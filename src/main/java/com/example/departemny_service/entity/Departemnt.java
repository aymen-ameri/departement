package com.example.departemny_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Departemnt {
@Id
@GeneratedValue(strategy = GenerationType.AUTO  )
    private Long departmentId;
            private String departemntName;
            private  String departmentAddress;
            private  String departemntCode;
}
