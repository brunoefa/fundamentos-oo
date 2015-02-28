package br.com.senai.classes;

public class Cliente {
	
	public String nome;
	public String dataDeNascimento;
	public String endereco;
	public String cpf;
	
	public void imprimirCliente() {
		System.out.println(this.nome);
		System.out.println(this.cpf + " - " + this.dataDeNascimento);
		System.out.println(this.endereco);
		System.out.println("--------------------------------------------------------");
		System.out.println("");
	}
	
}
