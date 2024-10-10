package oo;

public class ItemProduto {

	private Integer idItem;
	private Produto produto;
	
	private Integer quantidade = 1;
	private Double subtotal = 0.;
	
	public ItemProduto(Integer iditem) {
		this.idItem = iditem;
	}	
	
	@Override
	public String toString() {
		return "ItemProduto [idItem=" + idItem + ", produto=" + produto + ", quantidade=" + quantidade + ", subtotal="
				+ subtotal + "]";
	}

	public Integer getIdItem() {
		return idItem;
	}
	public void setIdItem(Integer idItem) {
		this.idItem = idItem;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getSubtotal() 
	{
		this.subtotal = produto.getPrecoProduto() * this.quantidade;
		return subtotal;
	}	
	

}
