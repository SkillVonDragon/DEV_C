package heranca;

public abstract class Programador 
{
	private String nome;
	private String email;
	private String senha;
	private String acesso;
	private Double Salario;
	

	@Override
	public String toString() {
		return "Programador [nome=" + nome + ", email=" + email + ", senha=" + senha + ", acesso=" + acesso
				+ ", Salario=" + Salario + "]" + super.toString();
	}
	
	public Programador(String nome, String email, String senha, String acesso, Double salario) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.acesso = acesso;
		Salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getAcesso() {
		return acesso;
	}
	public void setAcesso(String acesso) {
		this.acesso = acesso;
	}
	public Double getSalario() {
		return Salario;
	}
	public void setSalario(Double salario) {
		Salario = salario;
	}
		
	public abstract Double getDesconto();
	
	
}
