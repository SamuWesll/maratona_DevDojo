package br.com.devjojo.javacore.serializacao.teste;

import br.com.devjojo.javacore.serializacao.classe.Aluno;

import java.io.*;

public class SerealizacaoTeste {

    public static void main(String[] args) {
//        gravadorObjeto();
        leitorObjeto();
    }

    private static void gravadorObjeto() {
        Aluno aluno = new Aluno(1l, "Samuel Weslley", "12345");
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.ser"))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void leitorObjeto() {
        try(ObjectInputStream oos = new ObjectInputStream(new FileInputStream("aluno.ser"))) {
            Aluno aluno = (Aluno) oos.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
