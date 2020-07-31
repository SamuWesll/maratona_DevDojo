package br.com.devjojo.javacore.classesinternas.teste;

public class ClasseLocalTeste {

    private String nome = "Samuel";

    public void fazAlgumaCoisa(String teste) {
        final String sobrenome = "Weslley";
        class Interna {
            public void imprimeNomeExterno() {
                System.out.println(nome);
                System.out.println(teste);
            }
        }
        Interna in = new Interna();
        in.imprimeNomeExterno();;
    }

    public static void main(String[] args) {
        ClasseLocalTeste localTeste = new ClasseLocalTeste();
        localTeste.fazAlgumaCoisa("Alice");
    }

}
