package modelo;
/**
 * classe abstrata, utilizada como sub classes de outras no package modelo, como por exemplo Bebida
 * @author Iago Cabral e Pedro Henrique
 *
 */
public abstract class Produto {
	
	protected String nomeProduto; 
	protected int valorProduto; 
	protected String tamanhoProduto;
	
	/**
	 * Construto de produto
	 * @param np nome do produto	
	 * @param vp valor do produto
	 * @param tp tipo do produto
	 */
	public Produto(String np, int vp, String tp) {
		
		nomeProduto = np; 
		valorProduto = vp; 
		tamanhoProduto = tp; 
		
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
