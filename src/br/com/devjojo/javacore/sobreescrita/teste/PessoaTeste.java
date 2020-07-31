package br.com.devjojo.javacore.sobreescrita.teste;

import br.com.devjojo.javacore.sobreescrita.classe.Pessoa;

public class PessoaTeste {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Samuel");
        p.setIdade(25);
        System.out.println(p);
    }

}
