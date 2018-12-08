package me.zeph.springcloud.order.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Price {
  private double amount;
  private Unit unit;
}
