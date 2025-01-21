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
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String medicalRecordNumber;

    @Column(nullable = false)
    private String allergies;

    @Column(nullable = false)
    private String medicalConditions;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}