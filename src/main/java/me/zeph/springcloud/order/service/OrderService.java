package me.zeph.springcloud.order.service;

import me.zeph.springcloud.order.model.Order;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

  @Value("${order.signature}")
  private String signature;

  public Order getOrder(long id) {
    return Order.builder().id(id).signature(signature).build();
  }
}
