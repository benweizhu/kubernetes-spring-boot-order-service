package me.zeph.springcloud.order.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Price {
  private double amount;
  private Unit unit;
}
