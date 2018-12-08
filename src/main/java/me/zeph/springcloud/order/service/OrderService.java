package me.zeph.springcloud.order.service;

import me.zeph.springcloud.order.model.Order;
import me.zeph.springcloud.order.model.Price;
import org.springframework.stereotype.Service;

import static me.zeph.springcloud.order.model.Unit.CNY;

@Service
public class OrderService {
  public Order getOrder(long id) {
    return Order.builder().id(id).totalPrice(Price.builder().amount(10).unit(CNY).build()).build();
  }
}
