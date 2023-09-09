package kz.middle.middle01liquibase.exceptions;

public class UserNotFoundException extends RuntimeException{

    private Long id;

    public UserNotFoundException(Long id){
        this.id = id;
    }

    @Override
    public String getMessage() {
        return "User with id " + id + " not found in users microservice";
    }
}