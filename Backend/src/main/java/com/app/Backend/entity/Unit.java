package com.app.Backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Generated;

import java.util.UUID;

@Entity
@Setter
@Getter
public class Unit {

    @Id
    @GeneratedValue
    private UUID id;
    private String abbreviation;
    private String name;
    private String cluster;

    public void setId() {
    }
}
