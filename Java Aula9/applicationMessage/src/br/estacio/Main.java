package br.estacio;

import br.estacio.model.Pessoa;

public class Main {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setIdade(20);
		pessoa.setNome("Geovanna");
		System.out.println("Nome: " + pessoa.getNome() + "\n" + "Idade: " + pessoa.getIdade());
		pessoa.mostrar();
	}
}
