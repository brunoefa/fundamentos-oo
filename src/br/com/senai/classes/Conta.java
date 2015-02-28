package br.com.senai.classes;

import java.util.ArrayList;
import java.util.List;

public class Conta {

	public String conta;
	public String agencia;
	public String banco;
	public double saldo;
	public Cliente cliente;
	public List<Transacao> extrato = new ArrayList<Transacao>();
	
	public boolean sacar(double valor) {		
		boolean status;
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			status = true;
		}else {
			status = false;
		}
		registrarTransacao("Saque", valor, status);
		return status;
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
		registrarTransacao("Depósito", valor, true);
	}
	
	public String capturarTitular() {
		return this.cliente.nome;
	}
	
	public double consultarSaldo() {
		registrarTransacao("Consulta", this.saldo, true);
		return this.saldo;
	}
	
	public boolean transferirPara(Conta conta, double valor) {
		boolean status;
		if (sacar(valor)) {
			conta.depositar(valor);
			status = true;
		}else {
			status = false;
		}
		registrarTransacao("Transferência", valor, status);
		return status;
	}
	
	private void registrarTransacao(String operacao, double valor, boolean status) {
		Transacao t = new Transacao(operacao, valor, status);
		this.extrato.add(t);
	}
	
	public void imprimirExtrato() {
		this.cliente.imprimirCliente();
		for (Transacao transacao : this.extrato) {
			System.out.println(transacao.capturarTransacao());
		}
		System.out.println("");
	}
}
