package tp1;


public class Produto {
	String produtonome;
	String descricao;
	String valor;
	String lucro;
	int quantidade;
	
	public Produto() {
	}
	
	public Produto(String produtonome, String descricao, String valor, String lucro, int quantidade) {
		this.produtonome = produtonome;
		this.descricao = descricao;
		this.valor = valor;
		this.lucro = lucro;
		this.quantidade = quantidade;
		}
	
	public String getProdutonome() {
		return produtonome;
	}
	public void SetProdutonome(String produtonome) {
		this.produtonome = produtonome;
	}
	
	
	public String getDescricao() {
		return descricao;
	}
	public void SetDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public String getValor() {
		return valor;
	}
	public void SetValor(String valor) {
		this.valor = valor;
	}
	
	
	public String getLucro() {
		return lucro;
	}
	public void SetLucro(String lucro) {
		this.lucro = lucro;
	}
	
	
	public int getQuantidade() {
		return quantidade;
	}
	public void SetQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}

