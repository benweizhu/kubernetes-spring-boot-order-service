package me.zeph.springcloud.order.controller;

import me.zeph.springcloud.order.model.Order;
import me.zeph.springcloud.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

  @Autowired private OrderService orderService;

  @GetMapping("/orders/{orderId}")
  public Order getOrder(@PathVariable(name = "orderId") long orderId) {
    return orderService.getOrder(orderId);
  }
}
