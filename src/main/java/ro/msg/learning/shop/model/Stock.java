package ro.msg.learning.shop.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by marino on 04.04.2018.
 */
@Data
@Entity
@IdClass(StockKey.class)
public class Stock {
    @Id
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id")
    private Product product;
    @Id
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "location_id")
    private Location location;
    private Integer quantity;
}
