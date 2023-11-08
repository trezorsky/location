package com.example.location.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Geodata {

    @Id @GeneratedValue
    int id;
    @NonNull private double lon;
    @NonNull private double lat;
    @NonNull private String name;

}
