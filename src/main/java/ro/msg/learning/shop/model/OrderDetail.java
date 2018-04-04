package ro.msg.learning.shop.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by marino on 04.04.2018.
 */
@Data
@Entity
@IdClass(OrderDetailKey.class)
public class OrderDetail {
    @Id
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "order_id")
    private Order order;
    @Id
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id")
    private Product product;
    private Integer quantity;
}
