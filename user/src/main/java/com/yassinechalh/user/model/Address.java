package com.yassinechalh.user.model;

import lombok.*;
import org.springframework.validation.annotation.Validated;

/**
 * @author Yassine CHALH
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Validated
public class Address {

    private String street;
    private String houseNumber;
    private String zipCode;
}
