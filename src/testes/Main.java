package testes;

import java.util.LinkedHashSet;
import java.util.Set;

import tipos.MarcarSessao;

public class Main {

	public static void main(String[] args) {
		
		
		MarcarSessao marcar1 = new MarcarSessao("105", "Hudson", "100000001", "38-9586177", "Costas", 35.50, "05/08/2020");
		MarcarSessao marcar2 = new MarcarSessao("106", "Plinio", "100000002", "38-9586188", "Costas", 55, "06/08/2020");
		MarcarSessao marcar3 = new MarcarSessao("107", "Joao", "100000003", "38-9586199", "Membros Inferiores", 54, "07/08/2020");
		MarcarSessao marcar4 = new MarcarSessao("108", "Maria", "100000004", "38-9586111", "Costas e Rosto", 95, "08/08/2020");
		MarcarSessao marcar5 = new MarcarSessao("109", "Angela", "100000005", "38-9586122", "Costas e Membros superiores",111, "09/08/2020");

		
		Set<MarcarSessao> produtoSet = new LinkedHashSet<>();
		
		produtoSet.add(marcar1);
		produtoSet.add(marcar2);
		produtoSet.add(marcar3);
		produtoSet.add(marcar4);
		produtoSet.add(marcar5);
		
		for (MarcarSessao p: produtoSet) {
			System.out.println(p);
		}

		
		
	

	}

}
