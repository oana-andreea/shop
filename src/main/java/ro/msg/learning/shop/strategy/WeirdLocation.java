package ro.msg.learning.shop.strategy;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import ro.msg.learning.shop.model.Location;
import ro.msg.learning.shop.model.Product;
import ro.msg.learning.shop.model.ProductsRequest;

import java.util.Arrays;
import java.util.List;

/**
 * Created by marino on 15.06.2018.
 */
@Component
@ConditionalOnProperty(name = "location.strategy", havingValue = "WEIRD")
public class WeirdLocation implements Strategy {

    @Override
    public Location getProductLocation(List<ProductsRequest> products) {
        return null;
    }
}
