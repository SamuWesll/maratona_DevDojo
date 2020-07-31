package br.com.devjojo.javacore.introducaoclasses.classes;

public class Calculadora {

    public void somarVarArgs(int ... numeros) {
        int soma = 0;
        for(int num : numeros) {
            soma += num;
        };
        System.out.println(soma);
    }

}
