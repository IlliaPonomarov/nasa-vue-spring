package com.ponomarov.illia.nasa.spring.vue.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;
import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "camera")
public class Camera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nameOfCamera;

    private String fullName;

    @ManyToOne
    private Rover rover;

    @OneToMany(mappedBy = "camera")
    private List<Mars> marses;



    public Camera(String nameOfCamera, String fullName, Rover rover) {
        this.nameOfCamera = nameOfCamera;
        this.fullName = fullName;
        this.rover = rover;
    }
}
