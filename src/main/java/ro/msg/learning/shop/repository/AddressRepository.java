package ro.msg.learning.shop.repository;

import org.springframework.data.repository.CrudRepository;
import ro.msg.learning.shop.model.Address;

/**
 * Created by marino on 04.04.2018.
 */
public interface AddressRepository  extends CrudRepository<Address, Integer> {

}
