package oo2;

public class Telefone {
	
	private Integer idTelefone;
	private String operadora;
	private String numero;
	
	public Telefone() {
 	}

	public Telefone(Integer idTelefone, String operadora, String numero) {
		super();
		this.idTelefone = idTelefone;
		this.operadora = operadora;
		this.numero = numero;
	}



	@Override
	public String toString() {
		return "Telefone [idTelefone=" + idTelefone + ", operadora=" + operadora + ", numero=" + numero + "]";
	}
	
	
	public Integer getIdTelefone() {
		return idTelefone;
	}
	public void setIdTelefone(Integer idTelefone) {
		this.idTelefone = idTelefone;
	}
	public String getOperadora() {
		return operadora;
	}
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
