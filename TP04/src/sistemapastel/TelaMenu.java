package sistemapastel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import modelo.*;
import controle.*;
import javax.swing.*;


public class TelaMenu implements ActionListener {
	
	private static JFrame janela = new JFrame("Pastelaria Visosa");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton pastel = new JButton("CRUD - Pastel");
	private static JButton bebida = new JButton("CRUD - Bebida");
	private static JButton pedido = new JButton("CRUD - Pedido");
	private static JButton funcionario = new JButton("CRUD - Funcionario");
	private static JButton venda = new JButton("CRUD - Venda");
	public static ControleDados dados = new ControleDados();
	
	


	public TelaMenu() {
	
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(180, 10, 150, 30);
		pastel.setBounds(140, 50, 200, 30);
		bebida.setBounds(140, 100, 200, 30); 
		pedido.setBounds(140, 150, 200, 30);
		funcionario.setBounds(140, 200, 200, 30);
		venda.setBounds(140, 250, 200, 30);
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(pastel);
		janela.add(bebida);
		janela.add(pedido);
		janela.add(funcionario);
		janela.add(venda);
		
		janela.setSize(600, 400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}

	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		
		pastel.addActionListener(menu);
		bebida.addActionListener(menu);
		pedido.addActionListener(menu);
		funcionario.addActionListener(menu);
		venda.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == pastel) {
			new CRUDInterface().mostrarDados(dados, 1);
			
		}
		
		if(src == bebida) {
			new CRUDBebida().mostrarDados(dados, 1);
		}
		
		if(src == pedido) {
			new CRUDPedido().mostrarDados(dados, 1);
		}
		
		if(src == funcionario) {	
			new CRUDFuncionario().mostrarDados(dados, 1);
		}
		if(src == venda) {	
			new CRUDVenda().mostrarDados(dados, 1);	
		}
	}
}
