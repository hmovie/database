package com.hmovie.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "category")
@Data
public class Category extends AbstractEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "category_id")
    private String id;
    @Column(name = "category_code", unique = true)
    private String code;
    @Column(name = "category_name")
    private String name;
}
