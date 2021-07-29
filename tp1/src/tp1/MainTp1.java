package tp1;

import java.util.Scanner;
import java.util.ArrayList;

	public class MainTp1 {
		
	public static void main(String[] args) {
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		Scanner ler = new Scanner(System.in);
		
		dataBase(clientes, produtos);
		
	int option;
	
	System.out.println("=====Bem vindo ao TP1=====\n");
	
	while(true) {
	menuOpcao();
	option = ler.nextInt();
	
	switch(option) {
	case 1: 
		//cadastrar novo cliente
		registrarCliente(clientes);
		break;
		
	case 2:
		//Busca por cliente
		editarcliente(clientes);
		
		break;
		
	case 3:
		//Cadastro de novo produto
		registrarProdutos(produtos);
		break;
		
	case 4:
		//Busca por produto
		editarProdutos(produtos);
		break;
		
	case 5:
		//Cadastro de venda
		cadastrarVenda(clientes, produtos);
		break;
		
	case 6:
		//Mostrar produtos em estoque
		estoqueproduto(produtos);
		break;
		
	case 7:
		System.exit(0);
		break;
		
		default:
		System.out.println("-----opção invalida----\n");
	}
	}
	 }
	
	public static void dataBase(ArrayList<Cliente> clientes, ArrayList<Produto> produtos) {
		
		Cliente c1 = new Cliente("iago cabral", "vicente pires", "99999-0001");
		clientes.add(c1);
		Cliente c2 = new Cliente("pedro henrique", "asa norte", "00001-9999");
		clientes.add(c2);
		Cliente c3 = new Cliente("kishimoto", "park way", "01234-5678");
		clientes.add(c3);
		Cliente c4 = new Cliente("giba", "colorado", "00000-0000");
		clientes.add(c4);
		Cliente c5 = new Cliente("lucas", "asa norte", "11111-1111");
		clientes.add(c5);
		Cliente c6 = new Cliente("fernanda", "gama", "12345-1111");
		clientes.add(c6);
		Cliente c7 = new Cliente("giovanna", "asa sul", "12345-6789");
		clientes.add(c7);
		Cliente c8 = new Cliente("barack obama", "taguatinga", "00000-1234");
		clientes.add(c8);
		Cliente c9 = new Cliente("neymar", "aguas claras", "1234-0000");
		clientes.add(c9);
		Cliente c10 = new Cliente("marta camisa 10", "lago norte", "10101-1010");
		clientes.add(c10);
		
		Produto p1 = new Produto("azeite", "bom para fritar peixe", "15 reais", "10% lucro", 15);
		produtos.add(p1);
		Produto p2 = new Produto("arroz", "alimento nao perecivel", "5 reais", "11% de lucro", 339);
		produtos.add(p2);
		Produto p3 = new Produto("carne", "alimento proteico", "60 reais", "25% de lucro", 6);
		produtos.add(p3);
		Produto p4 = new Produto("batata", "carboidrado delicioso", "2 reais", "5% de lucro", 100);
		produtos.add(p4);
		Produto p5 = new Produto("balinha", "doçe pequeno", "0,15 reais", "5% de lucro", 567);
		produtos.add(p5);
		Produto p6 = new Produto("sushi", "refeição a base de arroz e peixe", "80 reias", "20% de lucro", 56);
		produtos.add(p6);
		Produto p7 = new Produto("pamonha", "alimento feito com milho", "5 reias", "8% de lucro", 27);
		produtos.add(p7);
		Produto p8 = new Produto("farofa pronta yoki", "hmmnn farofinha yoki", "6 reias", "30% de lucro", 674);
		produtos.add(p8);
		Produto p9 = new Produto("chocolate", "a melhor sobremesa do mundo", "7 reias", "16% de lucro", 72);
		produtos.add(p9);
		Produto p10 = new Produto("hambuguer ", "melhor comida possivel", "36 reias", "19% de lucro", 6);
		produtos.add(p10);
	}
	
	public static void menuOpcao() {
		System.out.println("Digite a opção que gostaria: ");
		System.out.println("1 - Cadastro de novo cliente");
		System.out.println("2 - Busca por cliente");
		System.out.println("3 - Cadastro de novo produto");
		System.out.println("4 - Busca por produto");
		System.out.println("5 - Cadastro de venda");
		System.out.println("6 - Mostrar produtos em estoque");
		System.out.println("7 - Sair");
	}

	public static void registrarCliente(ArrayList<Cliente> clientes) {
		
		Scanner ler = new Scanner(System.in);
		
		int quantidade1;
		String name, adress, tel; 
		
		System.out.println("---Voce escolheu a opção de registrar um novo cliente---\n");
		System.out.print("Digite a quantidade de cadastros a ser realizados: ");
		quantidade1 = ler.nextInt();
		ler.nextLine();
		
		for(int i = 1; i <= quantidade1; i++) {
			
			System.out.println("Digite o nome do fornecedor " + i + " : ");
			name = ler.nextLine(); 
			System.out.println("Digite o endereço do fornecedor " + i + " : ");
			adress = ler.nextLine();
			System.out.println("Digite o telefone do fornecedor " + i + " : ");
			tel = ler.nextLine(); 
			
			Cliente novo = new Cliente(name, adress, tel);
			clientes.add(novo);
		} 
	
		System.out.println("**Clientes cadastrados!**");
		System.out.print("Aperte 'enter' para voltar para o menu"); 
		ler.nextLine();

	}
	
	public static void editarcliente(ArrayList<Cliente> clientes) {
		Scanner ler = new Scanner(System.in);
		System.out.println("---Voce escolheu a opção de busca por cliente---\n");
		String consulta;
		int i = 0, escolha;
		System.out.println("Digite o nome do cliente a ser consultado: ");
		consulta = ler.nextLine();
		
		for(Cliente c : clientes) {
			if(consulta.equalsIgnoreCase(c.getNome())) {
				System.out.println("Achei o " + c.getNome() + "\nO endereço dele é: " + c.getEndereco() + "\nO telefone dele é: " + c.getNumero());
				
				System.out.println("Gostaria de altera algum dado? \n 1 - Alterar o nome \n 2 - alterar o endereço \n 3 - alterar o telefone \n 4 - Sair sem alterar nada ");
				escolha = ler.nextInt();
				ler.nextLine();
				switch(escolha) {
				case 1:
					System.out.println("Digite o futuro nome: ");
					String newname = ler.nextLine();
					c.SetNome(newname);
					System.out.println("novo nome: " + c.getNome());
					break;
				case 2:
					System.out.println("Digite o futuro endereço: ");
					String newadress = ler.nextLine();
					c.SetEndereco(newadress);
					System.out.println("novo endereço: " + c.getEndereco());
					break;
				case 3:
					System.out.println("Digite o futuro telefone: ");
					String newtel = ler.nextLine();
					c.SetNumero(newtel);
					System.out.println("novo telefone: " + c.getNumero());
					break;
				case 4:

					break;
					default:
						System.out.println("Entrada invalida");
				}
				
			} else {
				i++;
			}
			if(i == clientes.size()) {
				System.out.println("Cliente não encontrado!");
			}
		}
		System.out.print("Aperte 'enter' para voltar para o menu"); 
		ler.nextLine();
		}
	
	public static void registrarProdutos(ArrayList<Produto> produtos) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("---Voce escolheu a opção de registrar um novo produto---\n");
		System.out.print("Digite a quantidade de produtos a ser cadastrados: ");
		int quantidadeprod = ler.nextInt();
		ler.nextLine();
		
		for(int i = 1; i <= quantidadeprod; i++) {
			
			System.out.println("Digite o nome do produto " + i + " : ");
			String prodname = ler.nextLine(); 
			
			System.out.println("Digite a descrição do produto " + i + " : ");
			String proddesc = ler.nextLine(); 
			
			System.out.println("Digite o valor de compra do produto " + i + " : ");
			String prodvalor = ler.nextLine();
			
			System.out.println("Digite a porcentagem de lucro do produto " + i + " : ");
			String prodlucro = ler.nextLine(); 
			
			System.out.println("Digite a quantidade em estoque do produto " + i + " : ");
			int prodquantidade = ler.nextInt(); 
			ler.nextLine();
			
			Produto novo = new Produto(prodname, proddesc, prodvalor, prodlucro, prodquantidade);
			produtos.add(novo);
		}
		
		System.out.println("Produtos cadastrados com sucesso!");
		System.out.print("Aperte 'enter' para voltar para o menu"); 
		ler.nextLine();
	}
	
	public static void editarProdutos(ArrayList<Produto> produtos) {
		
		Scanner ler = new Scanner(System.in);
		String consultaprod;
		int i = 0, escolhaprod;
		System.out.println("---Voce escolheu a opção de busca por produto---\n");
		System.out.println("Digite o nome do produto a ser consultado: ");
		consultaprod = ler.nextLine();
		
		for(Produto p : produtos) {
			if(consultaprod.equalsIgnoreCase(p.getProdutonome())) {
				System.out.println("==========\nAchei o produto desejado \nnome do produto: " + p.getProdutonome() + "\ndescrição do produto:" + p.getDescricao() + "\nvalor de compra: " + p.getValor() + "\nporcentagem de lucro: " + p.getLucro() + "\nQuantidade em estoque: " + p.getQuantidade() + "\n==========\n");
				System.out.println("Gostaria de altera algum dado? \n1 - Alterar o nome \n2 - alterar a descrição \n3 - alterar o valor de compra \n4 - altera a porcentagem de lucro \n5 - alterar a quantidade de estoque  \n6 - Sair sem alterar nada ");
				escolhaprod = ler.nextInt();
				ler.nextLine();
				
				switch(escolhaprod) {
				case 1:
					System.out.println("Digite o futuro nome: ");
					String newnameprod = ler.nextLine();
					p.SetProdutonome(newnameprod);
					System.out.println("novo nome: " + p.getProdutonome());
					break;

				case 2:
					System.out.println("Digite a Nova descrição: ");
					String newdesc = ler.nextLine();
					p.SetDescricao(newdesc);
					System.out.println("nova descrição: " + p.getDescricao());
					break;
					
				case 3:
					System.out.println("Novo valor de compra: ");
					String newvalor = ler.nextLine();
					p.SetValor(newvalor);
					System.out.println("novo valor: " + p.getValor());
					break;
				case 4:
					System.out.print("Digite a nova porcentagem de lucro: ");
					String newlucro = ler.nextLine();
					p.SetLucro(newlucro);
					System.out.print("nova porcentagem de lucro: " + p.getLucro());
					break;
				case 5:
					System.out.print("Digite a nova quantidade em estoque: ");
					int newestoque = ler.nextInt();
					p.SetQuantidade(newestoque);
					System.out.print("Nova quantidade : " + p.getQuantidade());
					break;
				case 6:
					break;
	
				default:
					System.out.println("Entrada invalida");
				}
				
			} else {
				i++;
			}
			if(i == produtos.size()) {
				System.out.println("Produto não encontrado!");
			}
		}
		System.out.print("Aperte 'enter' para voltar para o menu"); 
		ler.nextLine();
	}
	
	public static void cadastrarVenda(ArrayList<Cliente> clientes, ArrayList<Produto> produtos) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("---Voce escolheu a opção de cadastrar vernda---\n");
		String loopi;
		
		do {
			
		for(Cliente c : clientes) {
			System.out.println(c.getNome());
		}
		
		System.out.print("Digite o cliente que deseja registrar a venda: ");
		String vendacliente = ler.nextLine();
		System.out.print("\n");
		
		for(Produto p : produtos) {
			System.out.println(p.getProdutonome());
		}
		
		System.out.print("Digite o produto que deseja registrar a venda: ");
		String vendaprod = ler.nextLine();
		System.out.print("\n");
		System.out.println("Digite a quantidade de " + vendaprod + " vendida para " + vendacliente);
		int vendaquant = ler.nextInt();
		System.out.print("\n");
		ler.nextLine();
		
		for(Produto p : produtos) {
			if(vendaprod.equalsIgnoreCase(p.getProdutonome())) {
				int x = p.getQuantidade();
				p.SetQuantidade(x - vendaquant);
			}
		}
		
		System.out.println("Caso o produto exista, venda cadastrada!");
		System.out.println("Para PARAR de cadastrar vendas digite *'sair'*");
		
		loopi = ler.nextLine();
		}while(!loopi.equals("sair")); 
 
		
		
		System.out.print("Aperte 'enter' para voltar para o menu"); 
		ler.nextLine();
	}
	
	public static void estoqueproduto(ArrayList<Produto> produtos) {
		Scanner ler = new Scanner(System.in);
		System.out.println("---Voce escolheu a opção de consulta de estoque---\n");
		System.out.println("--------------------------------------------------");
		for(Produto p : produtos) {
			System.out.println("O produto: " + p.getProdutonome() + " possui : " + p.getQuantidade() + " unidades");
		}
		System.out.println("--------------------------------------------------");
		System.out.print("Aperte 'enter' para voltar para o menu"); 
		ler.nextLine();	
	}
	}

