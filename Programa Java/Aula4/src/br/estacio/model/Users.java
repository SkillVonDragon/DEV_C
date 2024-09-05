package br.estacio.model;

public class Users {

	// Privates
	private Integer id;
	private String nome;
	private String email;
	
	// Snippets Completos
	public Users(Integer id, String nome, String email)
	{
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	public Users() { super(); }
	
	// Snipets
	public Integer getId() { return id; }
	public void setId(Integer id) {  this.id = id; 	}
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	
}
