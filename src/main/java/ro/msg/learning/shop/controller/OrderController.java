package ro.msg.learning.shop.controller;

import org.springframework.web.bind.annotation.*;
import ro.msg.learning.shop.model.Order;

/**
 * Created by marino on 09.04.2018.
 */
@RestController
@RequestMapping("/api/order")
public class OrderController {

    @PostMapping
    public Order createOrder(Object o) {
        return null;
    }}