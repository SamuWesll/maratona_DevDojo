package br.com.devjojo.introducao.arrays;

public class Arrays5 {

    public static void main(String[] args) {
        int[][] dias = new int[2][2];
        dias[0][0] = 30;
        dias[0][1] = 31;
        dias[1][0] = 29;
        dias[1][1] = 28;

        for (int[] ref: dias) {
            System.out.println(ref);
            for (int dia: ref) {
                System.out.println(dia);
            }
        }
        
    }
}
