package org.wporta.conmed_api.patient;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.wporta.conmed_api.patient.dto.PatientCreateDTO;
import org.wporta.conmed_api.patient.dto.PatientDTO;
import org.wporta.conmed_api.patient.dto.PatientUpdateDTO;
import org.wporta.conmed_api.utils.Gender;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PatientService {

    private final PatientRepository patientRepository;
    private final PatientMapper patientMapper;

    public PatientService(PatientRepository patientRepository, PatientMapper patientMapper) {
        this.patientRepository = patientRepository;
        this.patientMapper = patientMapper;
    }

    @Transactional
    public PatientDTO createPatient(PatientCreateDTO patientCreateDTO) {
        Patient patient = patientMapper.toEntity(patientCreateDTO);
        Patient saved = patientRepository.save(patient);
        return patientMapper.toDTO(saved);
    }

    public List<PatientDTO> getAllPatients() {
        return patientRepository.findAll()
                .stream()
                .map(patientMapper::toDTO)
                .toList();
    }

    public PatientDTO getPatientById(Long id) {
        return patientRepository.findById(id)
                .map(patientMapper::toDTO)
                .orElseThrow(() -> new NoSuchElementException("Not Found"));
    }

    public List<PatientDTO> getPatientsByGender(Gender gender) {
        return patientRepository.getPatientsByGender(gender)
                .stream()
                .map(patientMapper::toDTO)
                .toList();
    }

    @Transactional
    public PatientDTO updatePatient(PatientUpdateDTO patientUpdateDTO) {
        Patient patient = patientRepository.findById(patientUpdateDTO.getId())
                .orElseThrow(() -> new NoSuchElementException("Patient not found with ID: " + patientUpdateDTO.getId()));

        patientMapper.updatePatientFromDTO(patientUpdateDTO, patient);
        patientRepository.save(patient);
        return patientMapper.toDTO(patient);
    }

    @Transactional
    public void deletePatient(Long id) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Patient not found with ID: " + id));

        patientRepository.delete(patient);
    }
}
