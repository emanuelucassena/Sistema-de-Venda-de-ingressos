package org.example.exceptions.usuario.exceptions;

public class LoginJaExistenteException extends RuntimeException {
    public LoginJaExistenteException(String message) {
        super(message);
    }
}
