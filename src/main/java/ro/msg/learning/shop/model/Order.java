package ro.msg.learning.shop.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by marino on 04.04.2018.
 */
@Data
@Entity
@Table(name="ordine") /***ARGHHHHH**/
public class Order {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "location_id")
    private Location shippedFrom;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "address_id")
    private  Address address;
}
