package br.com.senai.main;

import br.com.senai.classes.Conta;


public class Main {

	
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.conta = "123";
		conta1.nome = "José Bonifácio";
		conta1.saldo = 500;
		
		System.out.println(conta1.capturarTitular());
		System.out.println(conta1.capturarSaldo());
		
		System.out.println("Depósito de R$ 200,00");
		conta1.depositar(200.0);
		
		System.out.println(conta1.capturarSaldo());
		
		System.out.println("Saque de R$ 150,29");
		if (conta1.sacar(150.49)) {
			System.out.println("Saque efetuado com sucesso! =)");
		} else {
			System.out.println("Não há limite para saque! =(");
		}
		
		System.out.println(conta1.capturarSaldo());
		
		System.out.println("Saque de R$ 1500,00");
		if (conta1.sacar(1500.00)) {
			System.out.println("Saque efetuado com sucesso! =)");
		} else {
			System.out.println("Não há limite para saque! =(");
		}
		
		System.out.println(conta1.capturarSaldo());
		
		Conta conta2 = new Conta();
		conta2.nome = "Machado de Assis";
		conta2.conta = "456";
		conta2.saldo = 5000.00;
		
		System.out.println(conta2.capturarTitular());
		System.out.println(conta2.capturarSaldo());
		
		System.out.println("Transferência de R$ 1500,00");
		if (conta2.transferirPara(conta1, 1500.0)) {
			System.out.println("Transferência efetuada com sucesso! =)");
		} else {
			System.out.println("Não há limite para transferencia! =(");
		}
		
		System.out.println(conta2.capturarTitular());
		System.out.println(conta2.capturarSaldo());
		
		System.out.println(conta1.capturarTitular());
		System.out.println(conta1.capturarSaldo());
		
		System.out.println("Saque de R$ 1500,00");
		if (conta1.sacar(1500.00)) {
			System.out.println("Saque efetuado com sucesso! =)");
		} else {
			System.out.println("Não há limite para saque! =(");
		}
		System.out.println(conta1.capturarSaldo());
		
	}
}
