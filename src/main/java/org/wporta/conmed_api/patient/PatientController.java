package org.wporta.conmed_api.patient;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.wporta.conmed_api.patient.dto.PatientCreateDTO;
import org.wporta.conmed_api.patient.dto.PatientDTO;
import org.wporta.conmed_api.patient.dto.PatientUpdateDTO;
import org.wporta.conmed_api.utils.Gender;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping
    public ResponseEntity<PatientDTO> createPatient(@RequestBody PatientCreateDTO patientCreateDTO) {
        PatientDTO createdPatient = patientService.createPatient(patientCreateDTO);
        URI location = URI.create("/patients/" + createdPatient.id());
        return ResponseEntity.created(location).body(createdPatient);
    }

    @GetMapping
    public ResponseEntity<List<PatientDTO>> getPatients() {
        return ResponseEntity.ok(patientService.getAllPatients());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<PatientDTO> getPatientById(@PathVariable Long id) {
        return ResponseEntity.ok(patientService.getPatientById(id));
    }

    @GetMapping("/bygender/{gender}")
    public ResponseEntity<List<PatientDTO>> getPatientByGender(@PathVariable Gender gender) {
        return ResponseEntity.ok(patientService.getPatientsByGender(gender));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PatientDTO> updatePatient(@PathVariable Long id, @RequestBody PatientUpdateDTO patientUpdateDTO) {
        patientUpdateDTO.setId(id);
        PatientDTO updatedPatient = patientService.updatePatient(patientUpdateDTO);
        return ResponseEntity.ok(updatedPatient);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePatient(@PathVariable Long id) {
        patientService.deletePatient(id);
        return ResponseEntity.noContent().build();
    }
}
