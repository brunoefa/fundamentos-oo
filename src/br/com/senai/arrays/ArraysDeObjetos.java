package br.com.senai.arrays;

import br.com.senai.classes.Conta;

public class ArraysDeObjetos {

	public static void main(String[] args) {

		Conta[] contas;
		contas = new Conta[10];

		Conta c1 = new Conta();
		c1.setAgencia("234");
		c1.setBanco("Bradesco");
		c1.setConta("1231235");
		
		contas[0] = c1;
		
		System.out.println(contas[1].getBanco());

	}
}