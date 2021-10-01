package modelo;

public abstract class Produto {
	
	protected String nomeProduto; 
	protected int valorProduto; 
	protected String tamanhoProduto;
	
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
