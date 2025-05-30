package org.wporta.conmed_api.patient;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.wporta.conmed_api.utils.Gender;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    public String firstName;

    @Column(nullable = false)
    public String lastName;

    public Integer age;

    @Column(nullable = false)
    public Gender gender;

    @Column(nullable = false, unique = true)
    public String recordNumber;

    public String phone;

    public String cellPhone;

    public String email;

    private String address;
}
