package me.zeph.springcloud.order.entity;

import lombok.Data;
import me.zeph.springcloud.order.model.Unit;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ORDERS")
public class OrderEntity {

  @Id private long id;

  @Column(name = "PRICE_AMOUNT")
  private double amount;

  @Enumerated(EnumType.STRING)
  @Column(name = "PRICE_UNIT")
  private Unit unit;
}
