package ro.msg.learning.shop.model;

import lombok.Data;
import ro.msg.learning.shop.controller.OrderController;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by marino on 18.06.2018.
 */
@Data
public class OrderRequest{
    LocalDateTime orderTimeStamp;
    Address deliveryAddress;
    Customer customer;
    List<ProductsRequest> products;

}