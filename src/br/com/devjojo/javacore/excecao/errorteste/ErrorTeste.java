package br.com.devjojo.javacore.excecao.errorteste;

public class ErrorTeste {

    public static void main(String[] args) {
        stackOverFlowErro();
    }

    public static void stackOverFlowErro() {
        stackOverFlowErro();
    }

}
