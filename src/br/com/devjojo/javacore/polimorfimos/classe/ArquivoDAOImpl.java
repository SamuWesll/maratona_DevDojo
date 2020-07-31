package br.com.devjojo.javacore.polimorfimos.classe;

public class ArquivoDAOImpl implements GenericDAO {

    @Override
    public void save() {
        System.out.println("Salvando dados nos arquivos");
    }
}
