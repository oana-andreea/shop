package ro.msg.learning.shop.repository;

import org.springframework.data.repository.CrudRepository;
import ro.msg.learning.shop.model.Customer;

/**
 * Created by marino on 04.04.2018.
 */
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
