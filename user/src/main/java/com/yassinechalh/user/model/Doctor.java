package com.yassinechalh.user.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Yassine CHALH
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String medicalLicenseNumber;

    @Column(nullable = false)
    private String specialization;

    @Column(nullable = false)
    private int yearsOfExperience;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}