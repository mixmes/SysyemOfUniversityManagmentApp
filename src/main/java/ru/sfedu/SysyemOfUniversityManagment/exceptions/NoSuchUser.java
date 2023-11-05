package ru.sfedu.SysyemOfUniversityManagment.exceptions;

import org.springframework.security.core.AuthenticationException;

public class NoSuchUser extends AuthenticationException {
    public NoSuchUser(String msg, Throwable cause) {
        super(msg, cause);
    }

    public NoSuchUser(String msg) {
        super(msg);
    }
}
