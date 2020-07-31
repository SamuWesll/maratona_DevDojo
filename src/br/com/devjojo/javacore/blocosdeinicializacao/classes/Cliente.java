package br.com.devjojo.javacore.blocosdeinicializacao.classes;

public class Cliente {

    private int[] parcelas;
    // Bloco de inicializacao
    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicializacao");
        for(int i =1; i<100; i++) {
            parcelas[i-1] = i;
            System.out.print(i + " ");
        }
    }

    public Cliente() {
    }

    public int[] getParcelas() {
        return this.parcelas;
    }
    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }

}
