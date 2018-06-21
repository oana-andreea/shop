package ro.msg.learning.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.msg.learning.shop.model.*;
import ro.msg.learning.shop.repository.OrderRepository;
import ro.msg.learning.shop.repository.StockRepository;
import ro.msg.learning.shop.strategy.Strategy;

/**
 * Created by marino on 05.04.2018.
 */

/**
 * Handles the creation of orders
 */
@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final StockRepository stockRepository;

    private final Strategy strategy;

    @Autowired
    public OrderService(OrderRepository orderRepository, StockRepository stockRepository, Strategy strategy) {
        this.orderRepository = orderRepository;
        this.stockRepository = stockRepository;
        this.strategy = strategy;
    }

    public Order createOrder(OrderRequest orderRequest) {
        Location location = strategy.getProductLocation(orderRequest.getProducts());
        orderRequest.getProducts().stream().forEach(product -> {
            Stock stock  = stockRepository.readStockByProductIdAndLocationId(product.getId(), location.getId());
            stock.setQuantity(stock.getQuantity()-product.getQuantity());
            stockRepository.save(stock);
        });
        Order order =new Order();
        order.setAddress(orderRequest.getDeliveryAddress());
        order.setCustomer(orderRequest.getCustomer());
        order.setShippedFrom(location);
        return orderRepository.save(order);
    }

}
