package jpabook.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class OrderItem {

    @Id @GeneratedValue
    @Column(name="order_item_id")
    private Long id;

    @Column(name="order_id")
    private Long orderId;

    @Column(name="item_id")
    private Long itemId;

    @Column(name="order_price")
    private Integer orderPrice;

    @Column(name="order_count")
    private Integer orderCount;
}
