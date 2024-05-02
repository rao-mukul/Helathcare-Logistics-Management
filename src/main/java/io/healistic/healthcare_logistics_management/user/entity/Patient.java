package io.healistic.healthcare_logistics_management.user.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patientId;

    private String medicalHistory;
    private String allergies;
    private int emergencyContact;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
