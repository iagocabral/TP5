package modelo;

public class Venda {
	
	private int numVenda; 
	private String nomeCliente;
	private int valorVenda; 
	
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
