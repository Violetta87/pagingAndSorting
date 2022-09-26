package com.example.pagingandsorting.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name="Employee")
@Data
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue
    Long id;

    @Column
    private String firstName;

    @Column
    private String lastname;

    public Employee(String firstName, String lastname, String email) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.email = email;
    }

    @Column(name="mail", nullable = false, length = 200)
    private String email;

}
