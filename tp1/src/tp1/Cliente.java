package tp1;

public class Cliente {
	String nome;
	String endereco;
	String numero;
	
	public Cliente() {
	}
	
	public Cliente(String nome, String endereco, String numero) {
		this.nome = nome;
		this.endereco = endereco;
		this.numero = numero;
		}
		
	public String getNome() {
		return nome;
	}
	public void SetNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void SetEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumero() {
		return numero;
	}
	public void SetNumero(String numero) {
		this.numero = numero;
	}
	
	}
