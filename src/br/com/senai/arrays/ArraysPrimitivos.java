package br.com.senai.arrays;

public class ArraysPrimitivos {

	public static void main(String[] args) {
		
		int[] idades;
		idades = new int[5];
		idades[0] = 13;
		idades[1] = 2123;
		idades[2] = 123;
		idades[3] = 3453;
		idades[4] = 35;
		
		for (int i = 0; i < 5; i++) {
			System.out.println(idades[i]);
		}
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
		for (int i : idades) {
			System.out.println(idades[i]);
		}
	}
	
	public void fazAlgumaCoisaComArray(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}
	
}
