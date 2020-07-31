package br.com.devjojo.javacore.assertions.teste;

public class AssertTeste {

    public static void main(String[] args) {
        calcularSalario(-10);
    }

    private static void calcularSalario(double salario) {
        // funciona apenas no ambiente de desenvolvimento
        assert (salario > 0);
    }

}
