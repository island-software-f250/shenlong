package com.islandsoftwaref250.shenlong.service;

import com.islandsoftwaref250.shenlong.exceptions.OrderSaveException;
import com.islandsoftwaref250.shenlong.models.Order;
import com.islandsoftwaref250.shenlong.repositories.OrderRepository;
import com.islandsoftwaref250.shenlong.request.OrderRequest;
import com.islandsoftwaref250.shenlong.response.OrderResponse;
import com.islandsoftwaref250.shenlong.service.producer.KafkaProducer;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class OrderService {

    @Autowired
    private KafkaProducer producer;

    @Autowired
    private OrderRepository repository;

    public OrderResponse register(OrderRequest request) throws OrderSaveException{
        var order = new Order();
        var uuid = UUID.randomUUID();

        BeanUtils.copyProperties(request, order);
        order.setId(uuid);
        order.setDate(LocalDateTime.now());

        repository.save(order);

        producer.sendMessage(order);

        var optional = repository.findById(uuid);
        return optional
                .map(o -> new OrderResponse(o.getId(), o.getDate()))
                .orElseThrow(() -> new OrderSaveException("Sorry! Error registering the order."));
    }


}
