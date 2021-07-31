package componentes;

public class Produto {
	
	public String nomeProduto;
	public String descricaoProduto;
	public double produtoValor;
	public double produtoPorcetagem;
	public int quantidadeProduto;
	
	public Produto() {
		
	}
	
	public Produto(String nomeProduto, String descricaoProduto, double produtoValor, double produtoPorcetagem,int quantidadeProduto) {
		this.nomeProduto = nomeProduto;
		this.descricaoProduto = descricaoProduto;
		this.produtoValor = produtoValor;
		this.produtoPorcetagem = produtoPorcetagem;
		this.quantidadeProduto = quantidadeProduto;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public double getProdutoValor() {
		return produtoValor;
	}

	public void setProdutoValor(double produtoValor) {
		this.produtoValor = produtoValor;
	}

	public double getProdutoPorcentagem() {
		return produtoPorcetagem;
	}

	public void setProdutoPorcentagem(double produtoPorcetagem) {
		this.produtoPorcetagem = produtoPorcetagem;
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	
	
}
