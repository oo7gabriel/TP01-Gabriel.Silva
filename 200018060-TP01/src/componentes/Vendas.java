package componentes;

public class Vendas {
	public String clienteVenda;
	public String produtoVenda;
	public int quantidadeProduto;
	
	public Vendas() {
		
	}
	public Vendas(String clienteVenda, String produtoVenda, int quantidadeProduto) {
		this.clienteVenda = clienteVenda;
		this.produtoVenda = produtoVenda;
		this.quantidadeProduto = quantidadeProduto;
	}

	public String getClienteVenda() {
		return clienteVenda;
	}

	public void setClienteVenda(String clienteVenda) {
		this.clienteVenda = clienteVenda;
	}

	public String getProdutoVenda() {
		return produtoVenda;
	}

	public void setProdutoVenda(String produtoVenda) {
		this.produtoVenda = produtoVenda;
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	
}
