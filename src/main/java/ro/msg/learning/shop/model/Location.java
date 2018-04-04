package ro.msg.learning.shop.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by marino on 04.04.2018.
 */
@Data
@Entity
public class Location {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "address_id")
    private Address address;
}
