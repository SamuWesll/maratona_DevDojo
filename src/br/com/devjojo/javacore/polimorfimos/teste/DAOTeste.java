package br.com.devjojo.javacore.polimorfimos.teste;

import br.com.devjojo.javacore.polimorfimos.classe.ArquivoDAOImpl;
import br.com.devjojo.javacore.polimorfimos.classe.DatabaseDAOImpl;
import br.com.devjojo.javacore.polimorfimos.classe.GenericDAO;

public class DAOTeste {

    public static void main(String[] args) {
        GenericDAO arquivo = new DatabaseDAOImpl();
        arquivo.save();
    }

}
