package oo2;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

	private Integer id;
	private String nome;
	private String profissao;
	private Double salario;
	private List<Telefone> telefones;
	{
		telefones = new ArrayList<Telefone>();
	}
	
	
	 
	public Funcionario(Integer id, String nome, String profissao, Double salario, List<Telefone> telefones) {
		super();
		this.id = id;
		this.nome = nome;
		this.profissao = profissao;
		this.salario = salario;

	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	
	public void adicionarTelefone(Telefone telefone)
	{
		if(telefones == null)
		{
			telefones = new ArrayList<Telefone>();
		}
		telefones.add(telefone);
	}

}
