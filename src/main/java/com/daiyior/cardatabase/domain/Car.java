package com.daiyior.cardatabase.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String brand, model, color ,registrationNumber;

    private int modelYear, price;

    public Car(String brand, String model, String color, String registrationNumber, int modelYear, int price, Owner owner) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.registrationNumber = registrationNumber;
		this.modelYear = modelYear;
		this.price = price;
		this.owner = owner;
	}
@ManyToOne(fetch=FetchType.LAZY)
@JoinColumn(name="owner")
private Owner owner;

// @ManyToMany(mappedBy="cars")
// private Set<Owner> owners = new HashSet<Owner>();
}
