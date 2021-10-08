package controle;
import modelo.*;
/**
 * Package Controle, package responsavel por fazer a ligacao entro o package modelo e o package sistemapastel(view)
 * Classe Controle de Dados, responsavel pelo controle de Dados de todas as outras classes do package controle
 * @author Iago Cabral e Pedro Henrique
 *
 */

public class ControleDados {
    private Dados d = new Dados();
    /** 
     * chamando o banco de dados
     */
    public ControleDados() {
    	d.fillWithSomeData();
    } 
    
    /**
     * Função para retornar dados
     * @return d dados
     */
    public Dados getDados() {
        return d;
    }
    
    /**
     * Função para settar dados
     * @param d dados
     */
    public void setDados(Dados d) {
        this.d = d;
    }
    
    /**
     * Função para retornar os dados de Pastel
     * @return this.d.getPasteis() this
     */
    public Pastel[] getPaslteis() {
        return this.d.getPasteis();
    }
    
/**
 * Função para retornar a quantidade de pasteis
 * @return this.d.getQntPastel() this
 */
    public int getQntPastel() {
        return this.d.getQntPastel();
    }
    
    /**
     *  Função para retornar os dados das vendas
     * @return this.d.getVendas() this
     */
    public Venda[] getVenda() {
        return this.d.getVendas();
    }
   
    
    /**
     * Função para retornar os dados das bebidas
     * @return this.d.getBebidas() this
     */
    public Bebida[] getBebidas() {
        return this.d.getBebidas();
    }
    
    /**
     * Função para retornar a quantidade de bebidas
     * @return this.d.getQntBebida() this
     */
    public int getQntBebida() {
        return this.d.getQntBebida();
    }
    
    /**
     * Função para retornar os dados de funcionario
     * @return this.d.getFuncionarios() this
     */
    public Funcionario[] getFuncionarios() {
        return this.d.getFuncionarios();
    }
    
    /**
     * Função para retornar a quantidade de funcionarios
     * @return this.d.getQntFuncionario() this
     */
    public int getQntFuncionarios() {
        return this.d.getQntFuncionario();
    }
    
    /**
     *  Função para retornar os dados dos pedidos
     * @return this.d.getPedidos()
     */
    public Pedido[] getPedidos() {
        return this.d.getPedidos();
    }

    /**
     * Função para retornar a quantidade de vedidos
     * @return this.d.getQntPedido()
     */
    public int getQntPedidos() {
        return this.d.getQntPedido();
    }
    
    /**
     * Função para retornar a quantidade de vendas
     * @return this.d.getQntVenda()
     */
    public int getQntVendas() {
        return this.d.getQntVenda();
    }
    
    /**
     * Função booleana feita para editar dados do pastel na lista ou para adicionar um pastel na lista
     * @param dadosPastel String contendo os dados do pastel a ser inserido ou editado na lista
     * @return true, caso conseguiu inserir/editar o pastel ou False caso tenha algum erro nos dados passado como parametro
     */
    public boolean inserirEditarPastel(String[] dadosPastel) {
    	
    	if (dadosPastel[1].isEmpty() ) return false;
		if (dadosPastel[2].isEmpty() ) return false;
		if (dadosPastel[3].isEmpty() ) return false;
		if (dadosPastel[4].isEmpty() ) return false;
		if (dadosPastel[5].isEmpty() ) return false;
	
		
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
   
    /**
     * Função booleana feita para editar dados da bebida na lista ou para adicionar uma bebida na lista
     * @param dadosBebida String contendo os dados da bebida a ser inserido ou editado na lista
     * @return true, caso conseguiu inserir/editar a bebida ou False caso tenha algum erro nos dados passado como parametro
     */
   public boolean inserirEditarBebida(String[] dadosBebida) {
	   
	   	if (dadosBebida[1].isEmpty() ) return false;
		if (dadosBebida[2].isEmpty() ) return false;
		if (dadosBebida[3].isEmpty() ) return false;
		if (dadosBebida[4].isEmpty() ) return false;
		if (dadosBebida[5].isEmpty() ) return false;
	   
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
   
   /**
    * Função booleana feita para editar dados do funcionario na lista ou para adicionar um funcionario na lista
    * @param dadosFuncionario String contendo os dados do funcionario a ser inserido ou editado na lista
    * @return true, caso conseguiu inserir/editar o funcionario ou False caso tenha algum erro nos dados passado como parametro
    */
   public boolean inserirEditarFuncionario(String[] dadosFuncionario) {
   		
	   	if (dadosFuncionario[1].isEmpty() ) return false;
		if (dadosFuncionario[2].isEmpty() ) return false;
		if (dadosFuncionario[3].isEmpty() ) return false;
		if (dadosFuncionario[4].isEmpty() ) return false;
		if (dadosFuncionario[5].isEmpty() ) return false;
		if (dadosFuncionario[6].isEmpty() ) return false;
		if (dadosFuncionario[7].isEmpty() ) return false;
		if (dadosFuncionario[8].isEmpty() ) return false;
		if (dadosFuncionario[9].isEmpty() ) return false;
		
	   
 	   if(!dadosFuncionario[5].matches("[0-9]+") || !dadosFuncionario[6].matches("[0-9]+") || !dadosFuncionario[9].matches("[0-9]+")) // entrar se nao for inteiro
       		{
           return false;
           
       } else {
               Funcionario a = new Funcionario(dadosFuncionario[1], Integer.parseInt(dadosFuncionario[6]), dadosFuncionario[2],  dadosFuncionario[3], dadosFuncionario[4], Integer.parseInt(dadosFuncionario[5]), dadosFuncionario[7], dadosFuncionario[8], Double.parseDouble(dadosFuncionario[9])); 
               
               
               d.inserirEditarFuncionario(a, Integer.parseInt(dadosFuncionario[0]));
               return true;
       }
   }
   
   /**
    * Função booleana feita para editar dados da venda na lista ou para adicionar uma venda na lista
    * @param dadosVenda String contendo os dados da venda a ser inserido ou editado na lista
    * @return true, caso conseguiu inserir/editar a venda ou False caso tenha algum erro nos dados passado como parametro
    */
   public boolean inserirEditarVenda(String[] dadosVenda) {
	   
	   	if (dadosVenda[1].isEmpty() ) return false;
		if (dadosVenda[2].isEmpty() ) return false;
		if (dadosVenda[3].isEmpty() ) return false;
		
	   	
	   if(!dadosVenda[1].matches("[0-9]+") || !dadosVenda[3].matches("[0-9]+") ) // entrar se nao for inteiro
       		{
           return false;
           
       } else {
               Venda a = new Venda(Integer.parseInt(dadosVenda[1]), dadosVenda[2], Integer.parseInt(dadosVenda[3]));
               
               
               d.inserirEditarVenda(a, Integer.parseInt(dadosVenda[0]));
               return true;
       }
   }
   
  
   /**
    * Função para remover um pastel da lista de pasteis
    * @param i  o paramentro é um inteiro i, indice do pastel que deseja remover da lista
    * @return true, caso a remoção foi um sucesso ou false, caso tenha ocorrido algum erro na remoção
    */
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
	
	/**
	 * Função para remover uma bebida da lista de bebida
	 * @param i  o paramentro é um inteiro i, indice da bebida que deseja remover da lista
	 * @return true, caso a remoção foi um sucesso ou false, caso tenha ocorrido algum erro na remoção
	 */
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
	
	/**
	 * Função para remover um funcionario da lista de funcionario
	 * @param i  o paramentro é um inteiro i, indice do funcionario que deseja remover da lista
	 * @return true, caso a remoção foi um sucesso ou false, caso tenha ocorrido algum erro na remoção
	 */
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

	/**
	 * Função booleana feita para editar dados de um  pedido na lista ou para adicionar uma pedido na lista
	 * @param dadosPedido String contendo os dados do pedido a ser inserido ou editado na lista
     * @return true, caso conseguiu inserir/editar o pedido ou False caso tenha algum erro nos dados passado como parametro
     */
public boolean inserirEditarPedido(String[] dadosPedido) {
		
		if (dadosPedido[1].isEmpty() ) return false;
		if (dadosPedido[2].isEmpty() ) return false;
		if (dadosPedido[3].isEmpty() ) return false;
		if (dadosPedido[4].isEmpty() ) return false;
		if (dadosPedido[5].isEmpty() ) return false;
		if (dadosPedido[6].isEmpty() ) return false;
		if (dadosPedido[7].isEmpty() ) return false;
		if (dadosPedido[8].isEmpty() ) return false;
		if (dadosPedido[9].isEmpty() ) return false;
		
		if(!dadosPedido[3].matches("[0-9]+") || !dadosPedido[5].matches("[0-9]+") || !dadosPedido[6].matches("[0-9]+") || !dadosPedido[8].matches("[0-9]+")) // 
		{
			return false;
		} else {
        Pedido p = new Pedido(dadosPedido[1], dadosPedido[2], dadosPedido[4],Integer.parseInt(dadosPedido[6]), dadosPedido[7], Integer.parseInt(dadosPedido[8]), dadosPedido[9],Integer.parseInt(dadosPedido[3]),Integer.parseInt(dadosPedido[5]));
        
        d.inserirEditarPedido(p, Integer.parseInt(dadosPedido[0]));
        return true;
}
}


	/**
	 * Função para remover um pedido da lista de pedidos
	 * @param i  o paramentro é um inteiro i, indice do pedido que deseja remover da lista
	 * @return true, caso a remoção foi um sucesso ou false, caso tenha ocorrido algum erro na remoção
	 */
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
	
	/**
	 * Função para remover uma venda da lista de vendas
	 * @param i  o paramentro é um inteiro i, indice da venda que deseja remover da lista
	 * @return true, caso a remoção foi um sucesso ou false, caso tenha ocorrido algum erro na remoção
	 */	
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