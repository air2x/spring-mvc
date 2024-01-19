package ru.maxima.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Person {
    private Long id;

    @NotEmpty(message = "name should not to be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    private String name;

    @Min(value = 0, message = "Age should be more than 0")
    private Integer age;

    @NotEmpty(message = "Age should be more than 0")
    @Email(message = "Email is not valid")
    private String email;
}
