package me.zeph.springcloud.order.service;

import me.zeph.springcloud.order.model.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

  public Order getOrder(long id) {
    return Order.builder().id(id).build();
  }
}
