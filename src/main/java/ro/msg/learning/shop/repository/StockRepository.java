package ro.msg.learning.shop.repository;

import org.springframework.data.repository.CrudRepository;
import ro.msg.learning.shop.model.Product;
import ro.msg.learning.shop.model.Stock;
import ro.msg.learning.shop.model.StockKey;

/**
 * Created by marino on 04.04.2018.
 */
public interface StockRepository extends CrudRepository<Stock, StockKey> {

}
