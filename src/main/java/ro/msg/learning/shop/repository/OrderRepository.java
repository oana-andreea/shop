package ro.msg.learning.shop.repository;

import org.springframework.data.repository.CrudRepository;
import ro.msg.learning.shop.model.Order;

/**
 * Created by marino on 04.04.2018.
 */
public interface OrderRepository extends CrudRepository<Order, Integer> {

}
