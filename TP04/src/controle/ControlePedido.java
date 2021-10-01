package controle;
import modelo.*;

public class ControlePedido {
	
		private Pedido[] p;
		private int qntPedido; 
		
		public ControlePedido(ControleDados d) {
			
			p = d.getPedidos();
			qntPedido = d.getQntPedidos();
			
		}
		
		public String[] getNomePedido() {
			
			String[] s = new String[qntPedido];
			for(int i = 0; i < qntPedido; i++) {
				s[i] = p[i].getNomeCliente(); 
			}
			
			return s; 
		}

		public int getQnt() {			
			return qntPedido; 
		}

		public void setQntPedido(int qntPedido) {
			this.qntPedido = qntPedido;
		}
		
		public String getNomeCliente(int i) {
			return p[i].getNomeCliente();
		}

		public String getEscPastel(int i) {
			return p[i].getEscPastel();
		}


		public String getEscBebida(int i) {
			return p[i].getEscBebida();
		}


		public int getValorPedido(int i) {
			return p[i].getValorPedido();
		}
	
		public String getTimeCompra(int i) {
			return p[i].getTimeCompra();
		}


		public int getNumPedido(int i) {
			return p[i].getNumPedido();
		}


		public String getNomeGarcom(int i) {
			return p[i].getNomeGarcom();
		}


		public int getQntPastel(int i) {
			return p[i].getQntPastel();
		}


		public int getQntBebida(int i) {
			return  p[i].getQntBebida();
		}
	
}