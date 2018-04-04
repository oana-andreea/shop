package ro.msg.learning.shop.repository;

import org.springframework.data.repository.CrudRepository;
import ro.msg.learning.shop.model.OrderDetail;
import ro.msg.learning.shop.model.OrderDetailKey;

/**
 * Created by marino on 04.04.2018.
 */
public interface OrderDetailRepository extends CrudRepository<OrderDetail, OrderDetailKey> {

}
