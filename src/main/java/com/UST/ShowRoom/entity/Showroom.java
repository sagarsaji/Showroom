package com.UST.ShowRoom.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Showroom {
    @Id
    @GeneratedValue
    private int id;
    private String carName;
    private String manufyr;
    @ElementCollection
    private List<String> availableClr;
    private String model;
    @ElementCollection
    private List<String> accessories;
    private int price;
    @ElementCollection
    private List<String> payment;
    @ElementCollection
    private List<String> cities;
}
