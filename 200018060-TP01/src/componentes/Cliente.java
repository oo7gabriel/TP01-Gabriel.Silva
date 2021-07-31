package componentes;

public class Cliente {

	public String nomeCliente;
	public String enderecoCliente;
	public int telefoneCliente;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, String endereco, int telefone) {
		this.nomeCliente = nome;
		this.enderecoCliente = endereco;
		this.telefoneCliente = telefone;
	}

	public String getNome() {
		return nomeCliente;
	}

	public void setNome(String nomeCad) {
		this.nomeCliente = nomeCad;
	}

	public String getEndereco() {
		return enderecoCliente;
	}

	public void setEndereco(String enderecoCad) {
		this.enderecoCliente = enderecoCad;
	}

	public int getTelefone() {
		return telefoneCliente;
	}

	public void setTelefone(int telefoneCad) {
		this.telefoneCliente = telefoneCad;
	}
	
	
}
