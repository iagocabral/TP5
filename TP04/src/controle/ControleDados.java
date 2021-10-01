package controle;
import modelo.*;

public class ControleDados {
    private Dados d = new Dados();
    
    public ControleDados() {
    	d.fillWithSomeData();
    }
    
    public Dados getDados() {
        return d;
    }
    public void setDados(Dados d) {
        this.d = d;
    }
    
    //PASTEIS
    public Pastel[] getPaslteis() {
        return this.d.getPasteis();
    }
    

    public int getQntPastel() {
        return this.d.getQntPastel();
    }
    
    public Venda[] getVenda() {
        return this.d.getVendas();
    }
   
    
    //BEBIDAS
    public Bebida[] getBebidas() {
        return this.d.getBebidas();
    }

    public int getQntBebida() {
        return this.d.getQntBebida();
    }
    
    //FUNCIONARIOS
    public Funcionario[] getFuncionarios() {
        return this.d.getFuncionarios();
    }
    
    public int getQntFuncionarios() {
        return this.d.getQntFuncionario();
    }
    
    public Pedido[] getPedidos() {
        return this.d.getPedidos();
    }

    public int getQntPedidos() {
        return this.d.getQntPedido();
    }
    
    public int getQntVendas() {
        return this.d.getQntVenda();
    }
    
    
    
    

    public boolean inserirEditarPastel(String[] dadosPastel) {
    	
        if(!dadosPastel[5].matches("[0-9]+")) // entrar se nao for inteiro
        		{

            return false;
        } else {
                Pastel a = new Pastel(dadosPastel[1], Integer.parseInt(dadosPastel[5]), dadosPastel[2], 
                        dadosPastel[3],  dadosPastel[4]);
                
                d.inserirEditarPastel(a, Integer.parseInt(dadosPastel[0]));
                return true;
        }
    }
    
   public boolean inserirEditarBebida(String[] dadosBebida) {
    	
        if(!dadosBebida[5].matches("[0-9]+")) // entrar se nao for inteiro
        		{

            return false;
        } else {
                Bebida a = new Bebida(dadosBebida[1], Integer.parseInt(dadosBebida[5]), dadosBebida[2], 
                		dadosBebida[3],  dadosBebida[4]);
                
                d.inserirEditarBebida(a, Integer.parseInt(dadosBebida[0]));
                return true;
        }
    }
   
   public boolean inserirEditarFuncionario(String[] dadosFuncionario) {
   	
	   if(!dadosFuncionario[5].matches("[0-9]+") || !dadosFuncionario[6].matches("[0-9]+") || !dadosFuncionario[9].matches("[0-9]+")) // entrar se nao for inteiro
       		{
           return false;
           
       } else {
               Funcionario a = new Funcionario(dadosFuncionario[1], Integer.parseInt(dadosFuncionario[6]), dadosFuncionario[2],  dadosFuncionario[3], dadosFuncionario[4], Integer.parseInt(dadosFuncionario[5]), dadosFuncionario[7], dadosFuncionario[8], Double.parseDouble(dadosFuncionario[9])); 
               
               
               d.inserirEditarFuncionario(a, Integer.parseInt(dadosFuncionario[0]));
               return true;
       }
   }
   
   public boolean inserirEditarVenda(String[] dadosVenda) {
	   	
	   if(!dadosVenda[1].matches("[0-9]+") || !dadosVenda[3].matches("[0-9]+") ) // entrar se nao for inteiro
       		{
           return false;
           
       } else {
               Venda a = new Venda(Integer.parseInt(dadosVenda[1]), dadosVenda[2], Integer.parseInt(dadosVenda[3]));
               
               
               d.inserirEditarVenda(a, Integer.parseInt(dadosVenda[0]));
               return true;
       }
   }
   
  
    
	public boolean removerPastel(int i) {
		int qtdPastel = d.getQntPastel();
		String pastelRemovido = d.getPasteis()[i].getNomeProduto();
		String aux;
		
		if(i == (d.getQntPastel() - 1)) { 
			d.setQntPastel(d.getQntPastel() - 1);
			d.getPasteis()[d.getQntPastel()] = null;
			return true;
		} else { 
			int cont = 0;
			while(d.getPasteis()[cont].getNomeProduto().compareTo(pastelRemovido) != 0) {
				cont++;
			}
			
			for(int j = cont; j < d.getQntPastel() - 1; j++) {
				d.getPasteis()[j] = null;
				d.getPasteis()[j] = d.getPasteis()[j+1];
			}
			d.getPasteis()[d.getQntPastel()] = null;
			d.setQntPastel(d.getQntPastel() - 1);
			return true;
		}
	}
	
	public boolean removerBebida(int i) {
		int qtdBebida = d.getQntBebida();
		String bebidaRemovido = d.getBebidas()[i].getNomeProduto();
		String aux;
		
		if(i == (d.getQntBebida() - 1)) { 
			d.setQntBebida(d.getQntBebida() - 1);
			d.getBebidas()[d.getQntBebida()] = null;
			return true;
		} else { 
			int cont = 0;
			while(d.getBebidas()[cont].getNomeProduto().compareTo(bebidaRemovido) != 0) {
				cont++;
			}
			
			for(int j = cont; j < d.getQntBebida() - 1; j++) {
				d.getBebidas()[j] = null;
				d.getBebidas()[j] = d.getBebidas()[j+1];
			}
			d.getBebidas()[d.getQntBebida()] = null;
			d.setQntBebida(d.getQntBebida() - 1);
			return true;
		}
	}
	
	public boolean removerFuncionario(int i) {
		int qtdFuncionario = d.getQntFuncionario();
		String funcionarioRemovido = d.getFuncionarios()[i].getNomeFuncionario();
		String aux;
		
		if(i == (d.getQntFuncionario() - 1)) { 
			d.setQntFuncionario(d.getQntFuncionario() - 1);
			d.getFuncionarios()[d.getQntFuncionario()] = null;
			return true;
		} else { 
			int cont = 0;
			while(d.getFuncionarios()[cont].getNomeFuncionario().compareTo(funcionarioRemovido) != 0) {
				cont++;
			}
			
			for(int j = cont; j < d.getQntFuncionario() - 1; j++) {
				d.getFuncionarios()[j] = null;
				d.getFuncionarios()[j] = d.getFuncionarios()[j+1];
			}
			d.getFuncionarios()[d.getQntFuncionario()] = null;
			d.setQntFuncionario(d.getQntFuncionario() - 1);
			return true;
		}
	}
	
public boolean inserirEditarPedido(String[] dadosPedido) {
		
		if(!dadosPedido[3].matches("[0-9]+") || !dadosPedido[5].matches("[0-9]+") || !dadosPedido[6].matches("[0-9]+") || !dadosPedido[8].matches("[0-9]+")) // 
		{
			return false;
		} else {
        Pedido p = new Pedido(dadosPedido[1], dadosPedido[2], dadosPedido[4],Integer.parseInt(dadosPedido[6]), dadosPedido[7], Integer.parseInt(dadosPedido[8]), dadosPedido[9],Integer.parseInt(dadosPedido[3]),Integer.parseInt(dadosPedido[5]));
        
        d.inserirEditarPedido(p, Integer.parseInt(dadosPedido[0]));
        return true;
}
}
	public boolean removerPedidos(int i) {
		int qntPedidos = d.getQntPedido();
		String pedidoRemovido = d.getPedidos()[i].getNomeCliente();
		String aux;
		
		if(i == (d.getQntPedido() - 1)) { 
			d.setQntPedido(d.getQntPedido() - 1);
			d.getPedidos()[d.getQntPedido()] = null;
			return true;
		} else { 
			int cont = 0;
			while(d.getPedidos()[cont].getNomeCliente().compareTo(pedidoRemovido) != 0) {
				cont++;
			}
			
			for(int j = cont; j < d.getQntPedido() - 1; j++) {
				d.getPedidos()[j] = null;
				d.getPedidos()[j] = d.getPedidos()[j+1];
			}
			d.getPedidos()[d.getQntPedido()] = null;
			d.setQntPedido(d.getQntPedido() - 1);
			return true;
		}
	}
	
	public boolean removerVenda(int i) {
		int qntVenda = d.getQntVenda();
		String VendaRemovido = d.getVenda()[i].getNomeCliente();
		String aux;
		
		if(i == (d.getQntVenda() - 1)) { 
			d.setQntVenda(d.getQntVenda() - 1);
			d.getVenda()[d.getQntVenda()] = null;
			return true;
		} else { 
			int cont = 0;
			while(d.getVenda()[cont].getNomeCliente().compareTo(VendaRemovido) != 0) {
				cont++;
			}
			
			for(int j = cont; j < d.getQntVenda() - 1; j++) {
				d.getVenda()[j] = null;
				d.getVenda()[j] = d.getVenda()[j+1];
			}
			d.getVenda()[d.getQntVenda()] = null;
			d.setQntVenda(d.getQntVenda() - 1);
			return true;
		}
	}
	
}