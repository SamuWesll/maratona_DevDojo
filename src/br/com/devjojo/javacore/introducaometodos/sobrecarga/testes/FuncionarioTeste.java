package br.com.devjojo.javacore.introducaometodos.sobrecarga.testes;

import br.com.devjojo.javacore.introducaometodos.sobrecarga.classes.Funcionario;

public class FuncionarioTeste {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Chica da Silva","123.456.789-10",4500);
        funcionario.imprime();
    }

}
