package ro.msg.learning.shop.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import ro.msg.learning.shop.model.Location;
import ro.msg.learning.shop.model.Product;
import ro.msg.learning.shop.model.Stock;
import ro.msg.learning.shop.model.StockKey;
import ro.msg.learning.shop.repository.StockRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.StreamSupport;

/**
 * Created by marino on 15.06.2018.
 */
@Component
@Primary
@ConditionalOnProperty(name = "location.strategy", havingValue = "SINGLE")
public class SingleLocation implements Strategy {

    @Autowired
    private StockRepository stockRepository;

    public Location getSingleProductLocation(List<Product> products) {
        List<StockKey> list = new ArrayList<>();
        products.forEach(p -> {
            StockKey s = new StockKey();
            s.setProduct(p);
            list.add(s);
        });

        Iterable<Stock> stocks = stockRepository.findAllById(list);
        HashMap<Location,List<Stock>> map = new HashMap<>();
        for(Stock stock:stocks){
            List<Stock> stockList = map.get(stock.getLocation());
            if(stockList!=null){
                stockList.add(stock);
            }
            else map.put(stock.getLocation(), Arrays.asList(stock));
        }


        //StreamSupport.stream(stocks.spliterator(), false).collect(p->)
        return null;
    }


    @Override
    public List<Location> getProductLocation(List<Product> products) {
        return Arrays.asList(getSingleProductLocation(products));
    }
}
