package com.example.soll.backend.exception;

import lombok.Getter;

@Getter
public class UserNotFoundException extends RuntimeException{
    private final ErrorCode errorCode;

    public UserNotFoundException(ErrorCode errorCode){
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
