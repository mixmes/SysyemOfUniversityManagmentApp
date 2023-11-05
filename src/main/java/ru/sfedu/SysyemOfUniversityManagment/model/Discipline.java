package ru.sfedu.SysyemOfUniversityManagment.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Discipline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "discipline_id")
    private long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "typeOfMarking")
    private String typeOfMarking;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "edMat_id")
    private EducationalMaterial educationalMaterial = new EducationalMaterial();

    private Set<StudentGroup> listeners = new HashSet<>();
    public Discipline(String name , String typeOfMarking){
        this.name =  name;
        this.typeOfMarking = typeOfMarking;
    }


}
