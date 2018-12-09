package me.zeph.springcloud.order.service;

import me.zeph.springcloud.order.model.Order;
import me.zeph.springcloud.order.repository.OrderRepository;
import me.zeph.springcloud.order.transformer.OrderTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

  @Autowired private OrderRepository orderRepository;

  @Autowired private OrderTransformer orderTransformer;

  public Order getOrder(long id) {
    return orderRepository
        .findById(id)
        .map(orderTransformer.transformToModel())
        .orElseThrow(IllegalArgumentException::new);
  }
}
