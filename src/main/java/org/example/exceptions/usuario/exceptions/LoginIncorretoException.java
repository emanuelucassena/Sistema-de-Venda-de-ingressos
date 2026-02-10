package org.example.exceptions.usuario.exceptions;

public class LoginIncorretoException extends RuntimeException {
    public LoginIncorretoException(String message) {
        super(message);
    }
}
