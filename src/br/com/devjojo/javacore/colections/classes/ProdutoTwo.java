package br.com.devjojo.javacore.colections.classes;

import java.util.Objects;

public class ProdutoTwo implements Comparable<ProdutoTwo> {

    private Integer id;
    private String nome;
    private Double valor;
    private Integer quantidade;

    public ProdutoTwo(Integer id, String nome, Double valor, Integer quantidade) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdutoTwo that = (ProdutoTwo) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ProdutoTwo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(ProdutoTwo o) {
        return this.valor.compareTo(o.getValor());
//        return this.id.compareTo(o.getId());
    }
}
