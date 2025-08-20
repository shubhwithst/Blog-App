package com.shubham.blogApp.Payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Setter
public class UserDto {
    private int id;

    @NotEmpty
    @Size(min = 3, max = 10, message = "User Name must be min 3 char and max 5 char ...")
    private String name;

    @Email
    private String email;

    @NotEmpty
    @Size(min = 3, max = 5, message = "Password must be min 3 char and max 5 char ...")
    private String password;

    @NotEmpty
    private String about;
}
