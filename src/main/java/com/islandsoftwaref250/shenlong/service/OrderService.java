package com.islandsoftwaref250.shenlong.service;

import com.islandsoftwaref250.shenlong.models.Order;
import com.islandsoftwaref250.shenlong.repositories.OrderRepository;
import com.islandsoftwaref250.shenlong.request.OrderRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public Order register(OrderRequest request) {
        var order = new Order();
        var uuid = UUID.randomUUID();

        BeanUtils.copyProperties(request, order);
        order.setId(uuid);
        order.setDate(LocalDateTime.now());

        repository.save(order);

        var optional = repository.findById(uuid);

        return optional.get();
    }


}
