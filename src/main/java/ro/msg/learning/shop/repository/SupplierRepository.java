package ro.msg.learning.shop.repository;

import org.springframework.data.repository.CrudRepository;
import ro.msg.learning.shop.model.Product;
import ro.msg.learning.shop.model.Supplier;

/**
 * Created by marino on 04.04.2018.
 */
public interface SupplierRepository extends CrudRepository<Supplier, Integer> {

}
