package io.healistic.healthcare_logistics_management.user.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doctorId;

    private String qualifications;
    private String specialization;
    private int contactDetails;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
