package br.estacio;

import br.estacio.model.Pessoa;

public class ApplicationMessage {
	
    public static void main(String[] args) {
		
    	Pessoa pessoa = new Pessoa();
    	pessoa.setNome("jose");
    	pessoa.setIdade(69);
    	pessoa.mostrar();
    	System.out.println(pessoa.getNome());
    	
	}
}
