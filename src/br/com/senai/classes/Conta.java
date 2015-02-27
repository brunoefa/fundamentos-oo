package br.com.senai.classes;

public class Conta {
	public String nome;
	public String conta;
	public double saldo; 
	
	public boolean sacar(double valor) {		
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		}
		return false;
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public String capturarTitular() {
		return this.nome;
	}
	
	public double capturarSaldo() {
		return this.saldo;
	}
	
	public boolean transferirPara(Conta conta, double valor) {
		if (sacar(valor)) {
			conta.depositar(valor);
			return true;
		}
		return false;
	}
}
