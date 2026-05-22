package com.jefferson.examcenterapi.domain.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "tb_exam_centers")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ExamCenters {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    public Integer Id;

    public String name;
    public String email;
    public String cnpj;
    public String address;
    public String road;
    public String zip_code;
    public String phone;
    public String neighborhood;
    public String uf;
    public String city;
    public String observation;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id")
    public Set<Patient> patient;

    @CreatedDate
    private Timestamp createdAt;

    @LastModifiedDate
    private Timestamp updatedAt;
}
