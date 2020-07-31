package br.com.devjojo.javacore.polimorfimos.classe;

public class Vendedor extends Funcionario {

    private double totalVenda;

    public Vendedor(String nome, double salario, double totalVenda) {
        super(nome, salario);
        this.totalVenda = totalVenda;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }
}
