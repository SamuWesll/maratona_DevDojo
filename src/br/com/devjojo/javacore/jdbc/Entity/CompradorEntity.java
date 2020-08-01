package br.com.devjojo.javacore.jdbc.Entity;

import java.util.Objects;

public class CompradorEntity {

    private Integer id;
    private String cpf;
    private String nome;

    public CompradorEntity() {
    }

    public CompradorEntity(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public CompradorEntity(Integer id, String cpf, String nome) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompradorEntity that = (CompradorEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public String toString() {
        return "CompradorEntity{" +
                "id=" + id +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
