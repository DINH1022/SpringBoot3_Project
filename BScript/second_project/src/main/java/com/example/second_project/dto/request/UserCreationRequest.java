package com.example.second_project.dto.request;

import com.example.second_project.entity.User;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    @Size(min = 5 , message = "USERNAME_INVALID")
    String username;

    @Size(min = 8 , message = "PASSWORD_INVALID")
    String password;
    String firstname;
    String lastname;
    LocalDate dob;

}
