package com.example.apidocumentwith_swagger2.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "USER")
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "User model")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "The database generated User ID")
    @NotNull(message = "ID can't be null")
    private Long id;

    @NotNull(message = "First name can't be null")
    private String firstName;
    @NotNull(message = "Last name can't be null")
    private String lastName;
    @Min(value = 15, message = "Age should not be less than 15")
    @Max(value = 65, message = "Age should not be greater than 65")
    private int age;
    @Email(regexp=".*@.*\\..*", message = "Email should be valid")
    private String email;
}