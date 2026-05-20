package com.jefferson.examcenterapi.domain.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.sql.Timestamp;

@Entity
@Table(name = "patients")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Patient {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    public Integer Id;

    public String name;
    public String email;
    public String cpf;
    public String phone;
    public String neighborhood;
    public String gender;

    public String birth_date;
    public String last_mammography_date;
    public String last_cervical_exam_date;

    @OneToOne
    @JoinColumn(name = "registration_center_id", referencedColumnName = "Id")
    public ExamCenters exam_center;

    @OneToOne
    @JoinColumn(name = "registered_by_id", referencedColumnName = "Id")
    public User registeredBy;

    public String observation;

public Boolean active;
    @CreatedDate
    private Timestamp createdAt;

    @LastModifiedDate
    private Timestamp updatedAt;

}
