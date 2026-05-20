package com.jefferson.examcenterapi.controllers;

import com.jefferson.examcenterapi.dto.request.PatientCreateRequest;
import com.jefferson.examcenterapi.dto.response.PatientCreateResponse;
import com.jefferson.examcenterapi.services.ExamService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("v1/patients")
@RestControllerAdvice
public class PatientsController {

    private final ExamService examService;

    public PatientsController(ExamService examService) {
        this.examService = examService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public PatientCreateResponse list() {
        return examService.list();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PatientCreateResponse create(@RequestBody PatientCreateRequest patientCreateRequest) {
        return examService.create(patientCreateRequest);
    }
}
