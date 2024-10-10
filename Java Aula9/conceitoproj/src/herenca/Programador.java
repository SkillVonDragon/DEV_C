package herenca;

public class Programador {
	
	private String nome;
	private String sal;
	
	
	
	
	
	
	public Programador(String nome, String sal) {
		super();
		this.nome = nome;
		this.sal = sal;
	}



	@Override
	public String toString() {
		return "Programador [nome=" + nome + ", sal=" + sal + "]";
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	
	

}
