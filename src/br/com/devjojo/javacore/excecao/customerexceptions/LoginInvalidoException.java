package br.com.devjojo.javacore.excecao.customerexceptions;

public class LoginInvalidoException extends Exception {

    public LoginInvalidoException() {
        super("Usuario ou senha invalidos");
    }

}
