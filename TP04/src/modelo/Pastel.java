package modelo;

/** 
 * Classe Pastel, com todos os dados necesarrios de um pastel
 * @author Iago Cabral e Pedro Henrique
 *
 */

public class Pastel extends Produto {
	
	private String recheio; 
	private String cozinheiro; 
	
	/** 
	 * Construtor de Pastel
	 * public Pastel, com os seguintes parametros(dados)
	 * @param np nome do pastel
	 * @param vp valor do pastel
	 * @param tp tamanho do pastel
	 * @param recheioPastel recheio do pastel
	 * @param funcionarioCozinha funcionario que o fez
	 */

	public Pastel(String np, int vp, String tp, String recheioPastel, String funcionarioCozinha) {
		super(np, vp, tp);
		nomeProduto = np; 
		valorProduto = vp; 
		tamanhoProduto = tp; 
		recheio = recheioPastel; 
		cozinheiro = funcionarioCozinha; 
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getCozinheiro() {
		return cozinheiro;
	}

	public void setCozinheiro(String cozinheiro) {
		this.cozinheiro = cozinheiro;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public int getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(int valorProduto) {
		this.valorProduto = valorProduto;
	}
	public String getTamanhoProduto() {
		return tamanhoProduto;
	}
	public void setTamanhoProduto(String tamanhoProduto) {
		this.tamanhoProduto = tamanhoProduto;
	} 
	
	
	
	
	
}
