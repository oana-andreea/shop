package ro.msg.learning.shop.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import ro.msg.learning.shop.model.*;
import ro.msg.learning.shop.repository.StockRepository;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by marino on 15.06.2018.
 */
@Component
@Primary
@ConditionalOnProperty(name = "location.strategy", havingValue = "SINGLE")
public class SingleLocation implements Strategy {

    @Autowired
    private StockRepository stockRepository;

    @Override
    public Location getProductLocation(List<ProductsRequest> productsRequests) {
        return  productsRequests.stream()
                .map(request->stockRepository.readStocksByProductIdAndQuantityIsLessThanEqual(request.getId(), request.getQuantity()))
                .map(stocks->stocks.stream().map(Stock::getLocation).collect(Collectors.toSet()))
                .reduce((first,second)->{
                    first.retainAll(second);
                    return first;})
                .orElseThrow(() -> new IllegalArgumentException("No products request:" + productsRequests))
                .stream()
                .sorted(Comparator.comparing(Location::getId))
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException("No location was found for all products request:"+productsRequests+ " Consider multiple locations"));

    }

}
