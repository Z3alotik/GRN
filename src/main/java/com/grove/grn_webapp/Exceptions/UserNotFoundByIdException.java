package com.grove.grn_webapp.Exceptions;

public class UserNotFoundByIdException extends RuntimeException  {
    public UserNotFoundByIdException(String message) {
        super(message);
    }

    public UserNotFoundByIdException(String message, Throwable cause) {
        super(message, cause);
    }
}
