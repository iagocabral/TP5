package modelo;
/**
 * Classe Bebida, contendo todos os dados para a bebida, sendo eles:
 * nome da bebida, valor da bebida, tamanho da bebida, tipo da bebeida, sabor da bebida
 * @author Iago Cabral e Pedro Henrique
 *versão 1.0(Outubro 2021)
 */

public class Bebida extends Produto {
	/**
	 * Classe Bebida com todos os gets e sets necessarios.
	 * gets e sets para receber e retornar cada parametro que Bebida possui
	 */
	
	private String tipo; 
	private String sabor; 
	
	/**
	 * Construtor de bebida
	 * public Bebida, com os seguintes parametros: 
	 * @param np nome da bebida
	 * @param vp valor da bebida
	 * @param tp tamanho da bebeida 
	 * @param tipoBebida tipo da bebida
	 * @param saborBebida sabor da bebida
	 */
	
	public Bebida(String np, int vp, String tp, String tipoBebida, String saborBebida) {
		super(np, vp, tp);
		nomeProduto = np; 
		valorProduto = vp; 
		tamanhoProduto = tp; 
		tipo = tipoBebida;
		sabor = saborBebida;
		
	}
	/**
	 * 
	 * @return tipo tipo da bebida
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 *  funcao para settar o tipo da bebida
	 * @param tipo string com o dado do tipo da bebida
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * funcao para retornar o sabor da bebida
	 * @return sabor da bebida
	 */
	public String getSabor() {
		return sabor;
	}

	/**
	 * settar o sabor da bebida
	 * @param sabor para settar
	 */
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	/**
	 * 
	 */
	public String getNomeProduto() {
		return nomeProduto;
	}

	/**
	 * 
	 */
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	/**
	 * 
	 */
	public int getValorProduto() {
		return valorProduto;
	}
	/**
	 * 
	 */
	public void setValorProduto(int valorProduto) {
		this.valorProduto = valorProduto;
	}
	/**
	 * 
	 */
	public String getTamanhoProduto() {
		return tamanhoProduto;
	}
	/**
	 * 
	 */
	public void setTamanhoProduto(String tamanhoProduto) {
		this.tamanhoProduto = tamanhoProduto;
	} 

}
