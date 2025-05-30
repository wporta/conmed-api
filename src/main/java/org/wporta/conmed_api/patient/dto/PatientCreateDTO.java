package org.wporta.conmed_api.patient.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.wporta.conmed_api.utils.Gender;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PatientCreateDTO {
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
