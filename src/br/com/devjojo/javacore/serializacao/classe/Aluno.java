package br.com.devjojo.javacore.serializacao.classe;

import java.io.Serializable;

public class Aluno implements Serializable {

    private Long id;
    private String name;
    private transient String password; // não serializar
    private static String scholl = "DevDojo :)";

    public Aluno(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", nomeEscola='" + scholl + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String getScholl() {
        return scholl;
    }

    public static void setScholl(String scholl) {
        Aluno.scholl = scholl;
    }
}
