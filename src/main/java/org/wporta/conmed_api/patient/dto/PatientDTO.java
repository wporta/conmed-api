package org.wporta.conmed_api.patient.dto;

import org.wporta.conmed_api.utils.Gender;

public record PatientDTO(
        Long id,
        String firstName,
        String lastName,
        Integer age,
        Gender gender,
        String recordNumber,
        String phone,
        String cellPhone,
        String email,
        String address
) {}
