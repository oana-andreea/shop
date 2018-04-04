package ro.msg.learning.shop.model;

import lombok.Data;
import java.io.Serializable;

/**
 * Created by marino on 04.04.2018.
 */
@Data
public class StockKey implements Serializable {
    private Product product;
    private Location location;
}
