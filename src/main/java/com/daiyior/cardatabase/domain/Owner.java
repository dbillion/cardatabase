package com.daiyior.cardatabase.domain;

// import java.util.HashSet;
import java.util.List;
// import java.util.Set;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Owner {
   @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long ownerid; 
 private String firstname, lastname;

 @JsonIgnore
 @OneToMany(cascade=CascadeType.ALL, mappedBy="owner")
private List<Car> cars;

// @ManyToMany(cascade=CascadeType.PERSIST)
// @JoinTable(name="car_owner", joinColumns = { @JoinColumn(name="ownerid") },
//  inverseJoinColumns = { @JoinColumn(name="id") })
// private Set<Car> cars = new HashSet<Car>();


    public Owner(String firstname,String lastname) {
        this.firstname=firstname;
        this.lastname=lastname;
    }

 
}
