package com.islandsoftwaref250.shenlong.controller;

import com.islandsoftwaref250.shenlong.request.OrderRequest;
import com.islandsoftwaref250.shenlong.response.OrderResponse;
import com.islandsoftwaref250.shenlong.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/orders")
@RestController
public class OrderController {


    @Autowired
    private OrderService service;

    @PostMapping("/create")
    public ResponseEntity<OrderResponse> send(@Valid @RequestBody OrderRequest request) {
        var order = service.register(request);

        return ResponseEntity.ok(order);
    }
}
