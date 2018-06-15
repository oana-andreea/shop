package ro.msg.learning.shop.strategy;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import ro.msg.learning.shop.model.Location;
import ro.msg.learning.shop.model.Product;

import java.util.Arrays;
import java.util.List;

/**
 * Created by marino on 15.06.2018.
 */
@Component
@ConditionalOnProperty(name = "location.strategy", havingValue = "WEIRD")
public class WeirdLocation implements Strategy {
    public Location getSingleProductLocation(List<Product> products){

        return null;
    }

    @Override
    public List<Location> getProductLocation(List<Product> products) {
        return Arrays.asList(getSingleProductLocation(products));
    }
}
