package oo;

public class Produto {
	private Integer idProduto;
	private String nomeProduto;
	private Double precoProduto;
	
	public Produto(Integer idProduto) {
		this.idProduto = idProduto;
	}


	public Produto(Integer idProduto, String nome, Double preco) {
		super();
		this.idProduto = idProduto;
		this.nomeProduto = nome;
		this.precoProduto = preco;
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nomeProduto=" + nomeProduto + ", precoProduto=" + precoProduto
				+ "]";
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}

}
