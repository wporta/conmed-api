package org.wporta.conmed_api.patient;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<Patient> getAllPatients() {
        return (List<Patient>) patientRepository.findAll();
    }

    public Patient getPatientById(Long id) {
        Patient patient = patientRepository.findById(id).orElseThrow();
        return patient;
    }
}
