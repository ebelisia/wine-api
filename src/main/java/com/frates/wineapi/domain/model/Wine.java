package com.frates.wineapi.domain.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Wine {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    @Column(name = "alcohol_percent")
    private Float alcoholPercent;
    private String grape;
    private String year;

}
