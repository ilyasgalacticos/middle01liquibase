package kz.middle.middle01liquibase.api;

import kz.middle.middle01liquibase.dto.UserDto;
import kz.middle.middle01liquibase.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserDto> getUsers(){
        return userService.getUsers();
    }
}
