package ro.msg.learning.shop.model;

import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by marino on 04.04.2018.
 */
@Data
@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @UniqueElements
    private String name;
}
