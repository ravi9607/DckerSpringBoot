package com.example.newspringboot.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employ {
    @Id
    private int id;
    private String name;
    private String age;
}
