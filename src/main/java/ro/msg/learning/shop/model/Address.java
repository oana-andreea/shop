package ro.msg.learning.shop.model;

import lombok.Data;

/**
 * Created by marino on 04.04.2018.
 */
@Data
public class Address {
    private int id;
    private String country;
    private String city;
    private String county;
    private String streetAddress;
}
