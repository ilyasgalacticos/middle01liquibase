package kz.middle.middle01liquibase.feign;

import kz.middle.middle01liquibase.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "user-feign-client", url = "http://localhost:8001")
public interface UserFeignClient {

    @GetMapping(value = "/user")
    List<UserDto> getUsers();
}