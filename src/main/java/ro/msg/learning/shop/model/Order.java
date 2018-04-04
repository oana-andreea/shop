package ro.msg.learning.shop.model;

import lombok.Data;

/**
 * Created by marino on 04.04.2018.
 */
@Data
public class Order {
    private int id;
    private Location shippedFrom;
    private Customer customer;
    private Address address;
}
