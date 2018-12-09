package me.zeph.springcloud.order.entity;

import lombok.Getter;
import lombok.Setter;
import me.zeph.springcloud.order.model.Unit;

import javax.persistence.*;

@Entity
@Table(name = "ORDERS")
@Getter
@Setter
public class OrderEntity {

  @Id
  private long id;

  @Column(name = "PRICE_AMOUNT")
  private double amount;

  @Enumerated(EnumType.STRING)
  @Column(name = "PRICE_UNIT")
  private Unit unit;
}
