package com.example.bootwebapp.db.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_employee")
@Data
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String department;

    @Builder
    Employee(Long id,
             String name,
             String email,
             String department){
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
    }
}
