package controle;
import modelo.*;
/**
 * Package Controle, package responsavel por fazer a ligacao entro o package modelo e o package sistemapastel(view)
 * Classe responsavel pelo controle dos pedidos, fazendo a liga�ao entre Pedido e view  
 * @author Iago Cabral e Pedro Henrique
 */
public class ControlePedido {
	
		private Pedido[] p;
		private int qntPedido; 
		
		/**
	     *  Settando a fun��o para controle dos pedidos
	     * @param d parametro d do tipo Dados
	     */
		public ControlePedido(ControleDados d) {
			
			p = d.getPedidos();
			qntPedido = d.getQntPedidos();
			
		}
		
		/**
	     * Fun��o para retornar o nome do cliente que realizou o pedido
	     * @return String s com o nome de um cliente
	     */
		public String[] getNomePedido() {
			
			String[] s = new String[qntPedido];
			for(int i = 0; i < qntPedido; i++) {
				s[i] = p[i].getNomeCliente(); 
			}
			
			return s; 
		}

		/**
	     * Fun��o para retornar a quantidade de pedidos
	     * @return retorna um inteiro, a quantidade de pedidos 
	     */
		public int getQnt() {			
			return qntPedido; 
		}

		/**
	     * Fun��o para Settar a quantidade de pedidos
	     * @param qntPedido um inteiro, que � a quantidade de pedidos
	     */
		public void setQntPedido(int qntPedido) {
			this.qntPedido = qntPedido;
		}
		
		/**
		 * Fun��o para retormar o nome do cliente registrado no pedido[i]
		 * @param i inteiro que respresenta o indice do pedido desejado na lista
		 * @return retorna uma string do cliente que realizou o pedido[i]
		 */
		public String getNomeCliente(int i) {
			return p[i].getNomeCliente();
		}

		/**
		 * Fun��o para retornar o nome do pastel desejado
		 * @param i inteiro que respresenta o indice do pedido desejado na lista
		 * @return retorna o nome do pastel do pedido[i]
		 */
		public String getEscPastel(int i) {
			return p[i].getEscPastel();
		}

		/**
		 * Fun��o para retornar o nome da bebida desejada
		 * @param i inteiro que respresenta o indice do pedido desejado na lista
		 * @return retorna o nome da bebida do pedido[i]
		 */
		public String getEscBebida(int i) {
			return p[i].getEscBebida();
		}


		/**
		 * Fun��o para retornar o valor do pedido desejado
		 * @param i inteiro que respresenta o indice do pedido desejado na lista
		 * @return retorna um inteiro, o valor do pedido[i]
		 */
		public int getValorPedido(int i) {
			return p[i].getValorPedido();
		}
		
		/**
		 * Fun��o para retornar o horario da compra do pedido desejado
		 * @param i inteiro que respresenta o indice do pedido desejado na lista
		 * @return retorna uma string, o horario da compra do pedido[i]
		 */
		public String getTimeCompra(int i) {
			return p[i].getTimeCompra();
		}


		/**
		 * Fun��o para retornar o numero de cadastro do pedido desejado
		 * @param i inteiro que respresenta o indice do pedido desejado na lista
		 * @return retorna um inteiro, o numero do pedido[i]
		 */
		public int getNumPedido(int i) {
			return p[i].getNumPedido();
		}

		/**
		 * Fun��o para retornar o gar�om que fez o pedido desejado
		 * @param i inteiro que respresenta o indice do pedido desejado na lista
		 * @return retorna uma string, o  nome do gar�om do pedido[i]
		 */
		public String getNomeGarcom(int i) {
			return p[i].getNomeGarcom();
		}

		/**
		 * Fun��o para retornar a quantidade de pasteis atribuidos ao pedido desejado
		 * @param i inteiro que respresenta o indice do pedido desejado na lista
		 * @return retorna um inteiro, o numero de pasteis pedidos no pedido[i]
		 */
		public int getQntPastel(int i) {
			return p[i].getQntPastel();
		}


		/**
		 * Fun��o para retornar a quantidade de bebidas atribuidas ao pedido desejado
		 * @param i inteiro que respresenta o indice do pedido desejado na lista
		 * @return retorna um inteiro, o numero de bebidas pedidas no pedido[i]
		 */
		public int getQntBebida(int i) {
			return  p[i].getQntBebida();
		}
	
}