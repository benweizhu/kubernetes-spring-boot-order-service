package me.zeph.springcloud.order.transformer;

import me.zeph.springcloud.order.entity.OrderEntity;
import me.zeph.springcloud.order.model.Order;
import me.zeph.springcloud.order.model.Price;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class OrderTransformer {

  public Function<OrderEntity, Order> transformToModel() {
    return orderEntity -> {
      Price price = Price.builder()
              .unit(orderEntity.getUnit())
              .amount(orderEntity.getAmount()).build();
      return Order.builder().totalPrice(price).build();
    };
  }
}
