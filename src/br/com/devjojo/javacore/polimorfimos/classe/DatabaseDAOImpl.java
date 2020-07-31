package br.com.devjojo.javacore.polimorfimos.classe;

public class DatabaseDAOImpl implements GenericDAO {

    @Override
    public void save() {
        System.out.println("Salvando dados no banco de dados");
    }

}
