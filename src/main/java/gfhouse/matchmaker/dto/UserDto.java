package gfhouse.matchmaker.dto;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String userId;
    private String nickname;
    private String password;
    private String email;
}
