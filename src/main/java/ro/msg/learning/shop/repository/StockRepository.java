package ro.msg.learning.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ro.msg.learning.shop.model.Location;
import ro.msg.learning.shop.model.Product;
import ro.msg.learning.shop.model.Stock;
import ro.msg.learning.shop.model.StockKey;

import java.util.List;

/**
 * Created by marino on 04.04.2018.
 */
public interface StockRepository extends JpaRepository<Stock, StockKey> {


 List<Stock> readStocksByProductIdAndQuantityIsLessThanEqual(Integer productId,Integer quantity);

 Stock readStockByProductIdAndLocationId(Integer productId, Integer locationId);
}
