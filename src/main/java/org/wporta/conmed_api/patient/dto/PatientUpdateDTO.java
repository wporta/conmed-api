package org.wporta.conmed_api.patient.dto;

import lombok.*;
import org.wporta.conmed_api.utils.Gender;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientUpdateDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private Gender gender;
    private String recordNumber;
    private String phone;
    private String cellPhone;
    private String email;
    private String address;
}
