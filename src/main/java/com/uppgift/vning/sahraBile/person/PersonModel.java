package com.uppgift.vning.sahraBile.person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class PersonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @GeneratedValue(strategy = GenerationType.AUTO)



    @Column(name ="födelsedatum")
    private String födelsedatum;

    @Column(name = "first_Name")
    private String firstname;

    @Column(name = "last_name")
    private String lastname;

    @Column(name = "Email")
    private  String email;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "Address")
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
