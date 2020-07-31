package br.com.devjojo.javacore.introducaoclasses.testes;

import br.com.devjojo.javacore.introducaoclasses.classes.Calculadora;

public class CalculadoraTeste {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calc.somarVarArgs(numeros);
    }

}
