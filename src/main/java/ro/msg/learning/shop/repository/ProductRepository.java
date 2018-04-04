package ro.msg.learning.shop.repository;

import org.springframework.data.repository.CrudRepository;
import ro.msg.learning.shop.model.Location;
import ro.msg.learning.shop.model.Product;

/**
 * Created by marino on 04.04.2018.
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
