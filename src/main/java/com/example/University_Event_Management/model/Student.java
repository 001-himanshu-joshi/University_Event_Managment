package com.example.University_Event_Management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
@Entity
@Getter
@Setter
@AllArgsConstructor
@Data
public class Student {
@Id
    private Integer studentId;
    private String studentFirstName;
    private String studentLastName;
    private int age;
    private String department;

}
