package com.sda.studysystem.models;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * County model
 */

@Entity
@Data
public class County {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String name;
    private boolean isActive;
    @OneToOne
    @NotNull
    private Country country;
}
