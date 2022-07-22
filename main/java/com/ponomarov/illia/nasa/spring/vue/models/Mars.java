package com.ponomarov.illia.nasa.spring.vue.models;


import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "mars")
public class Mars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "sol")
    private int sol;

    @Column(name = "img_src")
    private String imgSrc;

    @Column(name = "earth_date")
    private LocalDate earthDate;

    @ManyToOne
    @JoinColumn(name = "id")
    private Camera camera;

    @ManyToOne
    @JoinColumn(name = "id")
    private Rover rover;

    public Mars(int sol, String imgSrc, LocalDate earthDate, Camera camera, Rover rover) {
        this.sol = sol;
        this.imgSrc = imgSrc;
        this.earthDate = earthDate;
        this.camera = camera;
        this.rover = rover;
    }
}
