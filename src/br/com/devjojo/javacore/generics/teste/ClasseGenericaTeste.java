package br.com.devjojo.javacore.generics.teste;

import br.com.devjojo.javacore.generics.classe.Carro;
import br.com.devjojo.javacore.generics.classe.Computador;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTeste {

    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>();
        carrosDisponiveis.add(new Carro("Mercedes"));
        carrosDisponiveis.add(new Carro("Volks"));
        ObjetosAlugaveis<Carro> carrosAlugaveis = new ObjetosAlugaveis<>(carrosDisponiveis);
        Carro c = carrosAlugaveis.getObjetosDisponiveis();

        System.out.println("-------------------------");

        List<Computador> computadoresDisponiveis = new ArrayList<>();
        computadoresDisponiveis.add(new Computador("Lenovo"));
        computadoresDisponiveis.add(new Computador("Sansung"));
        ObjetosAlugaveis<Computador> computadoresAlugaveis = new ObjetosAlugaveis<>(computadoresDisponiveis);
        Computador comp = computadoresAlugaveis.getObjetosDisponiveis();
    }

}

class ObjetosAlugaveis<T> {

    private List<T> disponiveis = new ArrayList<>();

    public ObjetosAlugaveis(List<T> objs) {
        this.disponiveis.addAll(objs);
    }

    public T getObjetosDisponiveis() {
        T obj = disponiveis.remove(0);
        System.out.println("Alugando um: " + obj);
        System.out.println("Disponiveis: " + disponiveis);
        return obj;
    }

    public void devevolverObjeto(T algumaCoisa) {
        System.out.println("Devolvendo: " + algumaCoisa);
        disponiveis.add(algumaCoisa);
        System.out.println("Disponiveis: " + disponiveis);
    }

}

//class DoisAtributos<T, X> {
//    private T um;
//    private X dois;
//
//    public DoisAtributos(T um, X dois) {
//        this.um = um;
//        this.dois = dois;
//    }
//
//    public T getUm() {
//        return um;
//    }
//
//    public void setUm(T um) {
//        this.um = um;
//    }
//
//    public X getDois() {
//        return dois;
//    }
//
//    public void setDois(X dois) {
//        this.dois = dois;
//    }
//}
