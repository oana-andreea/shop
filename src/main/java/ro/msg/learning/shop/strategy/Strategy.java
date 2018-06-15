package ro.msg.learning.shop.strategy;

import ro.msg.learning.shop.model.Location;
import ro.msg.learning.shop.model.Product;

import java.util.Arrays;
import java.util.List;

/**
 * Created by marino on 15.06.2018.
 */
public interface Strategy {

    public List<Location> getProductLocation(List<Product> products);
}
