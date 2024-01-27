package com.angulaspringdeom.employeeapp.exception;

/**
 * @author TemmyTechie
 */

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
