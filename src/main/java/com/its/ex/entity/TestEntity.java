package com.its.ex.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name = "test_table")
public class TestEntity {
    @Id // pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    @Column(name = "test_id")
    private Long id;

    @Column(name = "test_colmn1")
    private String column1;

    @Column(unique = true)
    private String testColumn2;
}


