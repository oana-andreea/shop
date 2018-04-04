package ro.msg.learning.shop.model;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marino on 04.04.2018.
 */
@Data
@Embeddable
public class OrderDetailKey implements Serializable {
    private Order order;
    private Product product;
}
