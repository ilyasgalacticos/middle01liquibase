package kz.middle.middle01liquibase.service.impl;

import kz.middle.middle01liquibase.dto.UserDto;
import kz.middle.middle01liquibase.feign.UserFeignClient;
import kz.middle.middle01liquibase.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserFeignClient userFeignClient;

    @Override
    public List<UserDto> getUsers() {
        return userFeignClient.getUsers();
    }
}
