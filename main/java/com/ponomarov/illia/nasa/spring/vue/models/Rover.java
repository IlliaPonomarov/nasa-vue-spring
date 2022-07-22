package com.ponomarov.illia.nasa.spring.vue.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import  java.util.*;
import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "rover")
public class Rover {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "landing_date")
    private LocalDate landingDate;
    @Column(name = "launch_date")
    private LocalDate launchDate;

    @OneToMany(mappedBy = "rover", fetch = FetchType.LAZY)
    private List<Mars> marses;

    public Rover(String name, LocalDate landingDate, LocalDate launchDate) {
        this.name = name;
        this.landingDate = landingDate;
        this.launchDate = launchDate;
    }
}
