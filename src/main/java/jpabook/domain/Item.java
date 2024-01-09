package jpabook.domain;

import jakarta.persistence.*;

@Entity

public class Item {

    @Id @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    @Column(name="item_name")
    private String name;

    private Integer price;

    private int stock;

}
