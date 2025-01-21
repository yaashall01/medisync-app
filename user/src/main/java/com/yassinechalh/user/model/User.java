package com.yassinechalh.user.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;
import java.util.Set;

/**
 * @author Yassine CHALH
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {


    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "uuid2")
    @Column(length = 36, nullable = false, updatable = false)
    private String userId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = true)
    @Embedded
    private Address address;

    @Column(nullable = true)
    private LocalDate dateOfBirth;

    @Column(nullable = true)
    private String nationality;

    @Column(nullable = false)
    private boolean active = true;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Patient patientDetails;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Doctor doctorDetails;

    private boolean isDeleted;
}
