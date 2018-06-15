package ro.msg.learning.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.msg.learning.shop.model.Location;
import ro.msg.learning.shop.model.Stock;
import ro.msg.learning.shop.service.StockService;

import java.util.List;

/**
 * Created by marino on 09.04.2018.
 */
@RestController
@RequestMapping("/api/stocks")
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService){
        this.stockService = stockService;
    }
    @GetMapping("/location/{id}")
    public List<Stock> getStocksForLocation(@PathVariable long id) {
        return stockService.exportStocks(new Location());}
}
