package ro.msg.learning.shop.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by marino on 18.06.2018.
 */
@Data
public class ProductsRequest{
    Integer id;
    Integer quantity;
}