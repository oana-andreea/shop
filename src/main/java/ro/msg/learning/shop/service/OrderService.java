package ro.msg.learning.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.msg.learning.shop.model.Order;
import ro.msg.learning.shop.repository.OrderRepository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by marino on 05.04.2018.
 */

/**Handles the creation of orders*/
@Service
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository){
        this.orderRepository=orderRepository;
    }

    /*Create a service (annotated with @Service) class that handles the creation of orders.
    The following constraints apply:
    You get a single java object as input. This object will contain the order timestamp, the delivery address and a list of products (product ID and quantity) contained in the order.
    You return an Order entity if the operation was successful. If not, you throw an exception.
    The service has to select a strategy for finding from which locations should the products be taken. See the strategy design pattern. The strategy should be selected based on a spring boot configuration. The following initial strategyshould be created:oSingle location: find a single location that has all the required products (with the required quantities) in stock.If there are more such locations, simply take the first one based on the ID.The service then runsthe strategy, obtaining a list of objectswith the following structure: location, product, quantity (= how many items of the given product are taken from the given location). If the strategy is unable to find a suitable set of locations, it should throw an exception
    .The stocks need to be updated by subtracting the shipped goods*/
    class OrderRequest{
        LocalDateTime orderTimeStamp;
        String deliveryAddress;
        List<ProductRequest> products;
    }
    class ProductRequest{
        long id;
        BigDecimal quantity;
    }
    public Order createOrder(OrderRequest orderRequest){
        if("y"=="x")
        return null;
        throw new RuntimeException();
    }

}
