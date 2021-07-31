/*
 *Autor: Gabriel Ferreira da Silva
 */

package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import componentes.Cliente;
import componentes.Produto;
import componentes.Vendas;

public class Sistema {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leiturapc = new Scanner(System.in);
		int opcao = 0, quantidade = 0;
		boolean achaCliente = false, achaProduto = false;

		List<Cliente> clientelista = new ArrayList<>();
		List<Produto> produtolista = new ArrayList<>();
		List<Vendas> vendalista = new ArrayList<>();

		cadastroDos10(clientelista, produtolista); //Linha da função 73

		do {
			opcao = menuSwitch(opcao, leiturapc); //Linha da função 122

			switch (opcao) {
			case 1:
				cadastroCliente(clientelista, leiturapc, quantidade); //Linha da função 138
				break;

			case 2:
				buscaDeCliente(clientelista,leiturapc,achaCliente); //Linha da função 161
				break;

			case 3:
				cadastroProduto(produtolista, leiturapc, quantidade); //Linha da função 213
				break;

			case 4:
				buscaDeProdutos(produtolista,leiturapc,achaProduto); //Linha da função 241
				break;

			case 5:
				cadastroDeVendas(clientelista,produtolista,vendalista,leiturapc); //Linha da função 307
				break;

			case 6:
				estoqueVenda(produtolista,leiturapc); //Linha da função 396
				break;

			case 7:
				desligaPrograma(); //Linha da função 376
				break;

			default:
				System.out.println("Opcao Invalida");
				break;
			}

		} while (opcao != 7);

		leiturapc.close();
	}

// Funçaõ para facilitar a verificação de dados no programa
	
	public static void cadastroDos10(List<Cliente> clientelista, List<Produto> produtolista) {
		Cliente novo1 = new Cliente("rafael", "brasilia-df", 999999999);
		Cliente novo2 = new Cliente("bruno", "brasilia-df", 999999999);
		Cliente novo3 = new Cliente("sara", "brasilia-df", 999999999);
		Cliente novo4 = new Cliente("karen", "brasilia-df", 999999999);
		Cliente novo5 = new Cliente("killian", "brasilia-df", 999999999);
		Cliente novo6 = new Cliente("bruna", "brasilia-df", 999999999);
		Cliente novo7 = new Cliente("baek", "brasilia-df", 999999999);
		Cliente novo8 = new Cliente("cael", "brasilia-df", 999999999);
		Cliente novo9 = new Cliente("bianca", "brasilia-df", 999999999);
		Cliente novo10 = new Cliente("isabel", "brasilia-df", 999999999);

		clientelista.add(novo1);
		clientelista.add(novo2);
		clientelista.add(novo3);
		clientelista.add(novo4);
		clientelista.add(novo5);
		clientelista.add(novo6);
		clientelista.add(novo7);
		clientelista.add(novo8);
		clientelista.add(novo9);
		clientelista.add(novo10);

		Produto produtos1 = new Produto("Ype detergente 5L", "Soluçaõ tipo sabonete ideal para lavar louças", 26.99, 5,2);
		Produto produtos2 = new Produto("Suprema detergente 5L", "Soluçaõ tipo sabonete ideal para lavar louças", 17.99,2.5, 7);
		Produto produtos3 = new Produto("Bola de futebol", "Bola de futebol para crianças a partir de 3", 15.00, 2, 15);
		Produto produtos4 = new Produto("Bola de volei", "Bola de futebol para crianças a partir de 4", 19.99, 3, 17);
		Produto produtos5 = new Produto("Salgadinho 60g", "Salgado Assado para comer", 3.00, 5, 20);
		Produto produtos6 = new Produto("Salgadinho 100g", "Soluçaõ tipo sabonete ideal para lavar louças", 8.00, 9, 7);
		Produto produtos7 = new Produto("Ype detergente 1L", "Soluçaõ tipo sabonete ideal para lavar louças", 3.99, 1,25);
		Produto produtos8 = new Produto("Ype detergente 5L", "Soluçaõ tipo sabonete ideal para lavar louças", 17.99,2.5, 7);
		Produto produtos9 = new Produto("Salgadinho 60g", "Salgado Assado para comer", 3.00, 5, 20);
		Produto produtos10 = new Produto("Ype detergente 5L", "Soluçaõ tipo sabonete ideal para lavar louças", 17.99,2.5, 7);

		produtolista.add(produtos1);
		produtolista.add(produtos2);
		produtolista.add(produtos3);
		produtolista.add(produtos4);
		produtolista.add(produtos5);
		produtolista.add(produtos6);
		produtolista.add(produtos7);
		produtolista.add(produtos8);
		produtolista.add(produtos9);
		produtolista.add(produtos10);

	}
	
//Função para o menu ser simplificado main	

	public static int menuSwitch(int op, Scanner leiturapc) {
		System.out.println("|------MENU------|");
		System.out.println("1- Cadastrar Cliente");
		System.out.println("2- Busca por Cliente");
		System.out.println("3- Cadastro de novo produto");
		System.out.println("4- Busca por produto");
		System.out.println("5- Cadastro de venda");
		System.out.println("6- Mostrar produtos em estoque");
		System.out.println("7- Sair");
		int opcao = leiturapc.nextInt();

		return opcao;
	}

// Primeiro caso: Cadastro de novo cliente
	
	public static void cadastroCliente(List<Cliente> clientelista, Scanner leiturapc, int quantidade) {
		System.out.println("Quantas pessoas voce quer cadastrar ?Ex.: 1, 2, 3...");
		quantidade = leiturapc.nextInt();

		for (int i = 0; i < quantidade; i++) {
			leiturapc.nextLine();
			System.out.println("Qual o nome do Cliente:");
			String nomeCliente = leiturapc.nextLine();
			System.out.println("Qual o endereço do Cliente cadastrado:");
			String enderecoCliente = leiturapc.nextLine();
			System.out.println("Qual o telefone do cliente cadastrado:");
			int telefoneCliente = leiturapc.nextInt();
			Cliente novo = new Cliente(nomeCliente, enderecoCliente, telefoneCliente);
			clientelista.add(novo);
			System.out.println("Cliente cadastrado!!!");

			aguardeTempo(500);
		}

	}

// Segundo caso: Busca por cliente
	
	public static void buscaDeCliente(List<Cliente> clientelista, Scanner leiturapc, boolean achaCliente) {
		leiturapc.nextLine();
		System.out.println("Pesquise um nome: ");
		String nomePesquisaCliente = leiturapc.nextLine();
		for (int i = 0; i < clientelista.size(); i++) {
			if (clientelista.get(i).getNome().equals(nomePesquisaCliente)) {
				System.out.println("Dados Atuais:");
				System.out.println(clientelista.get(i).getNome());
				System.out.println(clientelista.get(i).getEndereco());
				System.out.println(clientelista.get(i).getTelefone());
				aguardeTempo(500);
				System.out.println("Deseja atualizar os dados do cliente ? s/n");
				char alterarClienteDados = leiturapc.next().charAt(0);

				if (alterarClienteDados == 's') {
					leiturapc.nextLine();
					System.out.println("Nome atual: " + clientelista.get(i).getNome());
					System.out.println("Digite o novo nome: ");
					String nomeAlterado = leiturapc.nextLine();
					clientelista.get(i).setNome(nomeAlterado);

					System.out.println("Endereco atual: " + clientelista.get(i).getEndereco());
					System.out.println("Digite o novo endereco: ");
					String enderecoAlterado = leiturapc.nextLine();
					clientelista.get(i).setEndereco(enderecoAlterado);

					System.out.println("Telefone atual: " + clientelista.get(i).getTelefone());
					System.out.println("Digite o novo telefone: ");
					int telefoneAlterado = leiturapc.nextInt();
					clientelista.get(i).setTelefone(telefoneAlterado);

					System.out.println("Dados foram alterados com sucesso. Aperte enter para continuar");
					leiturapc.nextLine();

				} else if (alterarClienteDados == 'n') {
					leiturapc.nextLine();
					System.out.println("Dados não foram alterados. Aperte enter para continuar");
					leiturapc.nextLine();
				}

				achaCliente = true;
			}
		}
		if (achaCliente == false) {
			System.out.println("Cliente não encontrado!");
		}

		achaCliente = false;
	}

//Terceiro caso: Cadastro de novo produto
	
	public static void cadastroProduto(List<Produto> produtolista, Scanner leiturapc, int quantidade) {
		System.out.println("Quantas produtos voce irá cadastrar ?Ex.: 1, 2, 3...");
		quantidade = leiturapc.nextInt();

		for (int i = 0; i < quantidade; i++) {
			leiturapc.nextLine();
			System.out.println("Qual o nome do Produto Cadastrado:");
			String nomeProduto = leiturapc.nextLine();
			System.out.println("Qual a descrição do Produto cadastrado:");
			String descricaoProduto = leiturapc.nextLine();
			System.out.println("Qual o valor(em reais) do Produto cadastrado:Ex.:33.00 , 45.00 ...");
			double valorProduto = leiturapc.nextDouble();
			System.out
					.println("Qual a porcentagem(em %) de lucro obtido encima do Produto cadastrado:Ex.: 1.6 , 50 ...");
			double porcetagemProduto = leiturapc.nextDouble();
			System.out.println("Qual a quantidade do Produto cadastrado:Ex.:1,2,3,4...");
			int quantidadeProduto = leiturapc.nextInt();
			Produto produtos = new Produto(nomeProduto, descricaoProduto, valorProduto, porcetagemProduto,
					quantidadeProduto);
			produtolista.add(produtos);
			System.out.println("Produto cadastrado!!!");

			aguardeTempo(500);
		}
	}

//Quarto Caso: Busca por produto
	
	public static void buscaDeProdutos(List<Produto> produtolista, Scanner leiturapc, boolean achaProduto) {
		leiturapc.nextLine();
		System.out.println("Pesquise um nome: ");
		String nomePesquisaProduto = leiturapc.nextLine();
		for (int i = 0; i < produtolista.size(); i++) {
			System.out.println("Dados Atuais:");
			System.out.println(produtolista.get(i).getNomeProduto());
			System.out.println(produtolista.get(i).getDescricaoProduto());
			System.out.println(produtolista.get(i).getProdutoValor());
			System.out.println(produtolista.get(i).getProdutoPorcentagem());
			System.out.println(produtolista.get(i).getQuantidadeProduto());
			aguardeTempo(500);

			System.out.println("Deseja atualizar os dados? s/n");
			char alterarProdutoDados = leiturapc.next().charAt(0);

			if (produtolista.get(i).getNomeProduto().equals(nomePesquisaProduto)) {
				System.out.println(produtolista.get(i).getNomeProduto());
				if (alterarProdutoDados == 's') {
					leiturapc.nextLine();
					System.out.println("Nome atual: " + produtolista.get(i).getNomeProduto());
					System.out.println("Digite o novo nome: ");
					String nomeProdutoAlterado = leiturapc.nextLine();
					produtolista.get(i).setNomeProduto(nomeProdutoAlterado);

					System.out.println("Descricao atual: " + produtolista.get(i).getDescricaoProduto());
					System.out.println("Digite a nova descricao: ");
					String descricaoProdutoAlterado = leiturapc.nextLine();
					produtolista.get(i).setDescricaoProduto(descricaoProdutoAlterado);

					System.out.println("Valor do produto atual: " + produtolista.get(i).getProdutoValor());
					System.out.println("Digite o novo valor(em reais) do produto: ");
					double produtoValorAlterado = leiturapc.nextDouble();
					produtolista.get(i).setProdutoValor(produtoValorAlterado);

					System.out.println("Valor da porcentagem de lucro do produto atual: "
							+ produtolista.get(i).getProdutoPorcentagem());
					System.out.println("Digite a nova porcentagem de lucro do produto: ");
					double produtoPorcentagemAlterado = leiturapc.nextDouble();
					produtolista.get(i).setProdutoPorcentagem(produtoPorcentagemAlterado);

					System.out.println("Quantidade atual: " + produtolista.get(i).getQuantidadeProduto());
					System.out.println("Digite a nova quantidade do produto: ");
					int produtoQuantidadeAlterado = leiturapc.nextInt();
					produtolista.get(i).setQuantidadeProduto(produtoQuantidadeAlterado);

					System.out.println("Dados foram alterados com sucesso. Aperte enter para continuar");
					leiturapc.nextLine();

				} else if (alterarProdutoDados == 'n') {
					leiturapc.nextLine();
					System.out.println("Dados não foram alterados. Aperte enter para continuar");
					leiturapc.nextLine();
				}
				achaProduto = true;
			}
		}
		if (achaProduto == false) {
			System.out.println("Produto não encontrado!");
		}

		achaProduto = false;
	}
	
//Quinto Caso: Cadastro de venda

	public static void cadastroDeVendas(List<Cliente> clientelista, List<Produto> produtolista, List<Vendas> vendalista, Scanner leiturapc) {
		int vendaTamanho = 0, quantidadeProAtual;
		char vendaCompleta = 's';
		if (produtolista.size() > vendaTamanho && clientelista.size() > vendaTamanho) {
			do {
				for (int i = 0; i < clientelista.size(); i++) {
					System.out.println(i + " - " + clientelista.get(i).getNome());
				}

				System.out.println("Por favor selecione o número do cliente para a venda:");
				int clienteSelecionado = leiturapc.nextInt();
				String clienteVenda = clientelista.get(clienteSelecionado).getNome();

				for (int i = 0; i < produtolista.size(); i++) {
					System.out.println(i + " - " + produtolista.get(i).getNomeProduto());
				}

				System.out.println("Por favor selecione o número do produto para a venda:");
				int produtoSelecionado = leiturapc.nextInt();
				String produtoVenda = produtolista.get(produtoSelecionado).getNomeProduto();

				quantidadeProAtual = produtolista.get(produtoSelecionado).getQuantidadeProduto();

				if (quantidadeProAtual == 0) {
					System.out.println("A quantidade de produtos é muito pequena para a venda.");
				} else {
					System.out.println("Qual a quantidade a ser vendida: (Quantidade Atual: "
							+ produtolista.get(produtoSelecionado).getQuantidadeProduto() + " )");
					int quantidadeSelecionada = leiturapc.nextInt();
					
					while(quantidadeSelecionada <= 0) {
							System.out.println("Qual a quantidade a ser vendida: (Quantidade Atual: "+ produtolista.get(produtoSelecionado).getQuantidadeProduto() + " )");
							quantidadeSelecionada = leiturapc.nextInt();
					}
					
					int quantidadeVendida = quantidadeProAtual - quantidadeSelecionada;
					if (quantidadeVendida < 0) {
						while (quantidadeVendida < 0) {
							System.out.println(
									"A quantidade não pode ser vendida, pois a quantidade a ser disponivel é menor que a pedida.");
							System.out.println("Por favor coloque outra quantidade: ");
							quantidadeSelecionada = leiturapc.nextInt();
							quantidadeVendida = quantidadeProAtual - quantidadeSelecionada;
						}
						produtolista.get(produtoSelecionado).setQuantidadeProduto(quantidadeVendida);
						System.out.println("Venda cadastrada!!!");
					}
					System.out.println("Deseja continuar com outra venda ?");
					vendaCompleta = leiturapc.next().charAt(0);

					Vendas vendasre = new Vendas(clienteVenda, produtoVenda, quantidadeVendida);
					vendalista.add(vendasre);

					aguardeTempo(500);
				}
			} while (vendaCompleta != 'n');

		} else if (produtolista.size() == vendaTamanho && clientelista.size() == vendaTamanho) {
			System.out.println("Não há nada para vender,pois não há clientes ou produtos.");
		} else if (produtolista.size() == vendaTamanho) {
			System.out.println("Não existe produto para vender ao cliente.");
		} else if (clientelista.size() == vendaTamanho) {
			System.out.println("Não existe cliente para vender um produto. ");
		}

	}
	
//Sexto Caso: Mostrar produtos em estoque	
	
	public static void estoqueVenda(List<Produto> produtolista, Scanner leiturapc) {
		int tamanhoEstoque = 0;
		if (produtolista.size() > tamanhoEstoque) {
			for (int i = 0; i < produtolista.size(); i++) {
				System.out.print("Produto: " + produtolista.get(i).getNomeProduto());
				System.out.println(" , Quantidade em Estoque: " + produtolista.get(i).getQuantidadeProduto());
				System.out.println();
			}
		} else if (produtolista.size() == tamanhoEstoque) {
			System.out.println("Não existe produto em estoque.");
		}

		leiturapc.nextLine();
		System.out.println("Pressione Enter para continuar ...");
		leiturapc.nextLine();

	}
	
//Sétimo Caso: Sair
	
	public static void desligaPrograma() {
		System.out.println("Obrigado por usar o Sistema. Até uma Próxima!");
	}
	
//Função para realizar um delay de 0.5segundos após o caso selecionado ser completado
	
	public static void aguardeTempo(int milisegundos) {
		try {
			Thread.sleep(milisegundos);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

}
