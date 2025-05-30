package org.wporta.conmed_api.patient;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.wporta.conmed_api.patient.dto.PatientCreateDTO;
import org.wporta.conmed_api.patient.dto.PatientDTO;
import org.wporta.conmed_api.patient.dto.PatientUpdateDTO;

@Mapper(componentModel = "spring")
public interface PatientMapper {

    PatientDTO toDTO(Patient patient);

    Patient toEntity(PatientCreateDTO patientCreateDTO);

    void updatePatientFromDTO(PatientUpdateDTO dto, @MappingTarget Patient patient);
}
