package br.com.devjojo.javacore.generics.teste;

import br.com.devjojo.javacore.generics.classe.Carro;
import br.com.devjojo.javacore.generics.classe.Computador;

import java.util.ArrayList;
import java.util.List;

public class ClasseNaoGenericaTeste {

    public static void main(String[] args) {
        CarroAlugavel carroAlugavel = new CarroAlugavel();
        Carro carro = carroAlugavel.getCarroDisponivel();
        System.out.println("Usando carro por uma semana");
        carroAlugavel.devolverCarro(carro);
    }

}

class CarroAlugavel {
    private List<Carro> carroDisponivel = new ArrayList<>();
    {
        carroDisponivel.add(new Carro("Gol"));
        carroDisponivel.add(new Carro("BMW"));
    }

    public Carro getCarroDisponivel() {
        Carro c = carroDisponivel.remove(0);
        System.out.println("Alugano o carro: " + c);
        return c;
    }

    public void devolverCarro(Carro carro) {
        System.out.println("Devolvendo carro: " + carro);
        carroDisponivel.add(carro);
        System.out.println("Carros disponiveis: " + carroDisponivel);
    }

}

class ComputadorAlugavel {
    private List<Computador> computadorDisponivel = new ArrayList<>();
    {
        computadorDisponivel.add(new Computador("Gol"));
        computadorDisponivel.add(new Computador("BMW"));
    }

    public Computador getCarroDisponivel() {
        Computador c = computadorDisponivel.remove(0);
        System.out.println("Alugano o carro: " + c);
        return c;
    }

    public void devolverCarro(Computador computador) {
        System.out.println("Devolvendo carro: " + computador);
        computadorDisponivel.add(computador);
        System.out.println("Carros disponiveis: " + computadorDisponivel);
    }

}
