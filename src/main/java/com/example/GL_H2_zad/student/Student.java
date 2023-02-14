package com.example.GL_H2_zad.student;

import com.example.GL_H2_zad.address.Address;
import jakarta.persistence.*;
import lombok.Getter;

@Entity(name = "STUDENTS")
@Getter
public class Student {

    @Id
    @GeneratedValue
    private Long nrIndeksu;

    private String imie;
    private String nazwisko;

    @ManyToOne()
    @JoinColumn(name = "adres", referencedColumnName = "id", nullable = false)
    private Address address;

}
