package gfhouse.matchmaker.controller;

import gfhouse.matchmaker.domain.User;
import gfhouse.matchmaker.dto.UserDto;
import gfhouse.matchmaker.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public User signup(@RequestBody UserDto userDto) {
        return userService.create(userDto.getNickname(), userDto.getEmail(), userDto.getPassword());
    }
}
