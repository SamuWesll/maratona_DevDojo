package br.com.devjojo.javacore.expressoesregulares.teste;

import java.util.Scanner;

public class ScannerTeste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner("1 true 100 oi");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        System.out.println("----------------------------");
        Scanner scanner2 = new Scanner("1 true 100 oi");
        while (scanner2.hasNext()) {
            if (scanner2.hasNextInt()) {
                int i = scanner2.nextInt();
                System.out.println(i);
            }
        }
    }

}
