package br.com.devjojo.javacore.generics.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal implements Comparable {

    @Override
    public void consulta() {
        System.out.println("Consultando cachorro");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Cachorro{}";
    }
}

class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando gato");
    }
}

public class WildCardTest {

    public static void main(String[] args) {
        Cachorro[] caes = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
//        consultaAnimais(caes);
//        consultaAnimais(gatos);
//        System.out.println("-----------------");

        List<Cachorro> cachorroList = new ArrayList<>();
        cachorroList.add(new Cachorro());
        List<Gato> gatoList = new ArrayList<>();
        gatoList.add(new Gato());

        consultaAnimaisList(cachorroList);
        consultaAnimaisList(gatoList);

        ondernarLista(cachorroList);
    }

    public static void consultaAnimais(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    public static void consultaAnimaisList(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    public static void consultarCachorroList(List<? super Cachorro> caes) {

    }

    public static void ondernarLista(List<? extends Comparable> list) {
        Collections.sort(list);
    }

}
