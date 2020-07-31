package br.com.devjojo.javacore.string.teste;

public class StringPerfomanceTeste {

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(3000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto String " + (fim - inicio) + " ms");
    }

    private static void concatString(int tam) {
        String string = "";
        for (int i =0; i < tam; i++) {
            string += 1;
        }
    }

    private static void concatStringBuilder(int tam) {
        StringBuilder sb = new StringBuilder(tam);
        for (int i =0; i < tam; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tam) {
        StringBuffer sb = new StringBuffer(tam);
        for (int i =0; i < tam; i++) {
            sb.append(i);
        }
    }

}
