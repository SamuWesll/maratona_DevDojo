package br.com.devjojo.javacore.enums.teste;

import br.com.devjojo.javacore.enums.classe.Cliente;
import br.com.devjojo.javacore.enums.classe.TipoCliente;

public class ClienteTeste {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Samuel Weslley Rocha Barboza", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);
        System.out.println(cliente);
    }

}
