package gfhouse.matchmaker.controller;

import gfhouse.matchmaker.domain.User;
import gfhouse.matchmaker.dto.LoginDto;
import gfhouse.matchmaker.service.LoginService;
import gfhouse.matchmaker.view.LoginView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class LoginController {
    private final LoginService loginService;

    @PostMapping("/login")
    public LoginView login(@RequestBody LoginDto loginDto){
        return loginService.login(loginDto.getUserId(), loginDto.getPassword());
    }
}