package br.com.devjojo.javacore.enums.classe;

public class Cliente {

    public enum TipoPagamento {
        AVISTA, APRAZO;
    }


    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo pagamento='" + tipoPagamento + '\'' +
                ", tipo=" + tipoCliente.getNome() +
                '}';
    }

    public Cliente(String nome, TipoCliente tipo, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipo;
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipo) {
        this.tipoCliente = tipo;
    }
}
