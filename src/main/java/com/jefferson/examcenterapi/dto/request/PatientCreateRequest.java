package com.jefferson.examcenterapi.dto.request;

public record PatientCreateRequest(
        String name,
        String email,
        String cpf,
        String phone,
        String neighborhood,
        String gender,
        String birth_date,
        String last_mammography_date,
        String last_cervical_exam_date,
        Integer registration_center_id,
        Integer registered_by_id,
        String observation
) {
}
