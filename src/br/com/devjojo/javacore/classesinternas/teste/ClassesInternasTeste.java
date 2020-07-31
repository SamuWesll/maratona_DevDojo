package br.com.devjojo.javacore.classesinternas.teste;

public class ClassesInternasTeste {

    private String nome = "Samuel Jedi do DevDojo";

    class Interna {
        public void verClasseExterna() {
            System.out.println(nome);
        }
    }

    public static void main(String[] args) {
        ClassesInternasTeste teste = new ClassesInternasTeste();
        ClassesInternasTeste.Interna in = teste.new Interna();
        ClassesInternasTeste.Interna in2 = new ClassesInternasTeste().new Interna();
        in.verClasseExterna();
    }
}

//class Externa {
//    private String nome = "Samuel Jedi do DevDojo";
//
//    class Interna {
//        public void verClasseExterna() {
//            System.out.println(nome);
//        }
//    }
//
//}
