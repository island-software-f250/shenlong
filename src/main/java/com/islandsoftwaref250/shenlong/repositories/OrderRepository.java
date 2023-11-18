package com.islandsoftwaref250.shenlong.repositories;

import com.islandsoftwaref250.shenlong.models.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderRepository extends MongoRepository<Order, UUID> {
}
