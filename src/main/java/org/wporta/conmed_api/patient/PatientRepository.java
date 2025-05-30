package org.wporta.conmed_api.patient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.wporta.conmed_api.utils.Gender;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    List<Patient> getPatientsByGender(Gender gender);
}
