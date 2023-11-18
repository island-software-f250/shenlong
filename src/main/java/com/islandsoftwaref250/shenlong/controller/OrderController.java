package com.islandsoftwaref250.shenlong.controller;

import com.islandsoftwaref250.shenlong.models.Order;
import com.islandsoftwaref250.shenlong.request.OrderRequest;
import com.islandsoftwaref250.shenlong.service.OrderService;
import com.islandsoftwaref250.shenlong.service.producer.KafkaProducer;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/orders")
@RestController
public class OrderController {

    @Autowired
    private KafkaProducer producer;

    @Autowired
    private OrderService service;

    @PostMapping("/create")
    public ResponseEntity<Order> send(@Valid @RequestBody OrderRequest request){
        var order = service.register(request);
        producer.sendMessage(order);

        return ResponseEntity.ok(order);
    }
}
