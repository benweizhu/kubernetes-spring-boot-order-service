package me.zeph.springcloud.order.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Order {
  private long id;
}
