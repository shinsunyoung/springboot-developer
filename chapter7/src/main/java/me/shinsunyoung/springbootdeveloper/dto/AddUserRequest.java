package me.shinsunyoung.springbootdeveloper.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
public class AddUserRequest {
    private String email;
    private String password;
}
