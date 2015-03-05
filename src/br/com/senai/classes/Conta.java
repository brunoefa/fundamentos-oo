package br.com.senai.classes;

import java.util.ArrayList;
import java.util.List;

public class Conta {

	private String conta;
	private String agencia;
	private String banco;
	private double saldo;
	private Cliente cliente;
	private List<Transacao> extrato = new ArrayList<Transacao>();
	
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
		System.out.println("Conta: " + getConta() + " Agência: " + getAgencia());
		System.out.println("");
		for (Transacao transacao : this.extrato) {
			System.out.println(transacao.capturarTransacao());
		}
		System.out.println("");
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		int digitos = agencia.length();
		for (int i = 0; i < 4 - digitos; i++) {
			agencia = "0" + agencia;	
		}
		this.agencia = agencia;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Transacao> getExtrato() {
		return extrato;
	}

	public void setExtrato(List<Transacao> extrato) {
		this.extrato = extrato;
	}
	
}
