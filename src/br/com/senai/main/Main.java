package br.com.senai.main;

import br.com.senai.classes.Cliente;
import br.com.senai.classes.Conta;


public class Main {

	
	public static void main(String[] args) {
		Cliente clienteJose = new Cliente();
		clienteJose.nome = "José Bonifácio";
		clienteJose.cpf = "08703875644";
		clienteJose.dataDeNascimento = "27/12/1988";
		clienteJose.endereco = "Rua Joaquina, 234 Belo Horizonte - MG";
		
		Conta contaJose = new Conta();
		contaJose.conta = "123";
		contaJose.agencia = "345";
		contaJose.banco = "Bradesco";
		contaJose.saldo = 500;
		contaJose.cliente = clienteJose;
		
		Cliente clienteMachado = new Cliente();
		clienteMachado.nome = "Machado de Assis";
		clienteMachado.cpf = "08975542278";
		clienteMachado.dataDeNascimento = "29/03/1980";
		clienteMachado.endereco = "Rua das Petúnias, 45 Belo Horizonte - MG";
		
		Conta contaMachado = new Conta();
		contaMachado.conta = "456";
		contaMachado.conta = "876";
		contaMachado.conta = "Banco do Brasil";
		contaMachado.saldo = 5000.00;
		contaMachado.cliente = clienteMachado;
		
		contaJose.consultarSaldo();
		contaJose.depositar(200.0);
		contaJose.consultarSaldo();
		contaJose.sacar(150.49);
		contaJose.consultarSaldo();
		contaJose.sacar(1500.00);
		contaJose.consultarSaldo();

		contaMachado.consultarSaldo();
		contaMachado.transferirPara(contaJose, 1500.0);
		contaMachado.consultarSaldo();
		
		contaJose.consultarSaldo();
		contaJose.sacar(1500.00);
		contaJose.consultarSaldo();
		
		contaJose.imprimirExtrato();
		contaMachado.imprimirExtrato();
	}
}
