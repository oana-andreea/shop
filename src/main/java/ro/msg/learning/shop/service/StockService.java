package ro.msg.learning.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.msg.learning.shop.model.Location;
import ro.msg.learning.shop.model.Stock;
import ro.msg.learning.shop.model.StockKey;
import ro.msg.learning.shop.repository.StockRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by marino on 09.04.2018.
 */
@Service
public class StockService {
    private final StockRepository stockRepository;

    @Autowired
    public StockService(StockRepository stockRepository){
    this.stockRepository=stockRepository;
    }

    public List<Stock> exportStocks(Location locationId){
        Iterable<StockKey> i= new ArrayList();
        //i.add(new StockKey());
       return (List<Stock>) stockRepository.findAllById(i);
    }
}
