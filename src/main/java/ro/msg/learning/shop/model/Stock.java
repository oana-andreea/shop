package ro.msg.learning.shop.model;

import lombok.Data;

/**
 * Created by marino on 04.04.2018.
 */
@Data
public class Stock {
    private Product product;
    private Location location;
    private int quantity;
}
