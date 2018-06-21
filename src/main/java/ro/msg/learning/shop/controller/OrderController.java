package ro.msg.learning.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.msg.learning.shop.model.Order;
import ro.msg.learning.shop.model.OrderRequest;
import ro.msg.learning.shop.service.OrderService;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by marino on 09.04.2018.
 */
@RestController
@RequestMapping("/api/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping
    public Order createOrder(OrderRequest o) {
        return null;//orderService.createOrder(o.getProducts());
    }
}