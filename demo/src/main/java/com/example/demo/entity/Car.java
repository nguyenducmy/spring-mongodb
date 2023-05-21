package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

@Document
@Data @AllArgsConstructor @NoArgsConstructor
public class Car {
    @Id
    private String id;
    @JsonIgnoreProperties
    @NonNull
    private String brand;
    @NonNull
    private String model;
    private String color;
}
