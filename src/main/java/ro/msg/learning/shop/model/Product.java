package ro.msg.learning.shop.model;

import lombok.Data;

/**
 * Created by marino on 04.04.2018.
 */
@Data
public class Product {
    private int id;
    private String name;
    private String description;
    private String price;
    private String weight;
    private ProductCategory category;
    private Supplier supplier;
}
