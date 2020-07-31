package br.com.devjojo.introducao.arrays;

public class Arrays1 {

    public static void main(String[] args) {
        int [] idade =  new int[3];
        idade[0] = 20;
        idade[1] = 15;
        idade[2] = 30;
        for (int id: idade ) {
            System.out.println("idade " + id);
        }
    }

}
