package modelo;

public class Bebida extends Produto {
	
	private String tipo; 
	private String sabor; 

	public Bebida(String np, int vp, String tp, String tipoBebida, String saborBebida) {
		super(np, vp, tp);
		nomeProduto = np; 
		valorProduto = vp; 
		tamanhoProduto = tp; 
		tipo = tipoBebida;
		sabor = saborBebida;
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
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
