package br.estacio.model;

public class Conta {
	private Long id;
	private String nome;
	private Double saldo = 0d;
	private Double deposito = 0d;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getDeposito() {
		return deposito;
	}

	public void setDeposito(Double deposito) {
		this.deposito = deposito;
	}

	public void depositar() {
		if (this.deposito < 0) {
			System.out.println("Valor negativo não pode");
		} else {
			this.saldo = this.saldo + this.getDeposito(); // OU this.saldo += this.saldo
			;
		}
	}

}
