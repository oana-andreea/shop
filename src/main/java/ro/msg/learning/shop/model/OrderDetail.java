package ro.msg.learning.shop.model;

import lombok.Data;

/**
 * Created by marino on 04.04.2018.
 */
@Data
public class OrderDetail {
    private  Order order;
    private Product product;
    private int quantity;
}
