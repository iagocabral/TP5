package modelo; 

/**
 * Classe Venda, contendo todo os dados necessarios para efetuar uma venda
 * @author Iago Cabral e Pedro Henrique
 *
 */
public class Venda {
	
	private int numVenda; 
	private String nomeCliente;
	private int valorVenda; 
	
	/**
	 * Construtor de venda
	 * Public Venda, contem todos os dados(parametros) necessarios para uma venda 
	 * @param numero numero da venda
	 * @param nc  nome do cliente conrespondente da venda
	 * @param total valor total da venda
	 */
	public Venda(int numero, String nc, int total) {
		
		numVenda = numero; 
		nomeCliente = nc; 
		valorVenda = total; 
	}

	public int getNumVenda() {
		return numVenda;
	}

	public void setNumVenda(int numVenda) {
		this.numVenda = numVenda;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(int valorVenda) {
		this.valorVenda = valorVenda;
	}
	
}
