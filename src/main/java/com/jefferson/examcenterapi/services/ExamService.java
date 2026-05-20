package com.jefferson.examcenterapi.services;

import com.jefferson.examcenterapi.dto.request.PatientCreateRequest;
import com.jefferson.examcenterapi.dto.response.PatientCreateResponse;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;
import java.util.Random;

@Service
public class ExamService {

    public PatientCreateResponse list() {
        return generatePatient();
    }

    public PatientCreateResponse create(PatientCreateRequest patientCreateRequest) {
        var newPatient = new PatientCreateRequest(
                patientCreateRequest.name(),
                "jefferson14489@gmail.com",
                "12345678909",
                "21966187719",
                "Campo grande",
                "Masculino",
                "1995-06-22",
                null,
                null,
                1,
                2,
                ""
        );

        return generatePatient();
    }

    private PatientCreateResponse generatePatient() {
        Instant now = Instant.now();

        return new PatientCreateResponse(
                new Random().nextInt(1000),
                "Jefferson",
                "jefferson14489@gmail.com",
                "12345678909",
                "21966187719",
                "Campo grande",
                "Masculino",
                "1995-06-22",
                null,
                null,
                1,
                2,
                "",
                Timestamp.from(now),
                Timestamp.from(now)
        );
    }
}
