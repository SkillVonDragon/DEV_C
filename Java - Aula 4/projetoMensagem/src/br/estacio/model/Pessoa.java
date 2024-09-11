package br.estacio.model;

public class Pessoa {
	
	private String nome;
	
	private Integer idade;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}



	public void mostrar() {
		if(this.idade>=16) {
			System.out.println("Direito de tirar titulo de eleitor_votar");
		}
		
		if(this.idade>=18 ) {
			System.out.println("Direito habilitaçao_Dirigir");
		}
		
		if(this.idade<16) {
			System.out.println(" Nao pode dirigir e nem votar ");
		}
		
		
	}
	
	

}
