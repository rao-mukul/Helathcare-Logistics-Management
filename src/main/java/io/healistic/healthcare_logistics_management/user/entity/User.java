package io.healistic.healthcare_logistics_management.user.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String userName;
    private String passwordHash;
//    private int roleId;

    @OneToOne
    @JoinColumn(name = "role_id")
    private Role role;

}
