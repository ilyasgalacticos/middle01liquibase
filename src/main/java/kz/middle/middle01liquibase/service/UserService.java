package kz.middle.middle01liquibase.service;

import kz.middle.middle01liquibase.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> getUsers();

}
