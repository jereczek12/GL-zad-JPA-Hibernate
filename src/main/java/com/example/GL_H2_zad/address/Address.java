package com.example.GL_H2_zad.address;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity()
@Data
public class Address {
    @Id
    @GeneratedValue
    private Long id;

    private String adres;
}
