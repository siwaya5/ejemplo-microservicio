package com.example.demo.utilidades;

import org.springframework.http.HttpStatus;

public interface Constants {

    static final String GET_USER_BY_ID = "/getUser/{userId}";
    static final String GET_ALL_USERS = "/getAllUsers";
    static final String SAVE_USER = "/saveUser";
    static final String ALLOWED_ORIGINS = "*";

    public static final int CODE_OK = HttpStatus.OK.value();
    public static final int CODE_ERROR = HttpStatus.CONFLICT.value();
    public static final int CODE_INTERNAL_ERROR = HttpStatus.INTERNAL_SERVER_ERROR.value();
}
