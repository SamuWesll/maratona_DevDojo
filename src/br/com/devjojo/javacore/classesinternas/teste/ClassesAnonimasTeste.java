package br.com.devjojo.javacore.classesinternas.teste;

class Animal {
    public void andar() {
        System.out.println("Andando");
    }
}

public class ClassesAnonimasTeste {

    public static void main(String[] args) {
        Animal animal = new Animal(){
            public void andar() {
                System.out.println("Andando anonimamente!");
            }
        };
        animal.andar();
    }

}
