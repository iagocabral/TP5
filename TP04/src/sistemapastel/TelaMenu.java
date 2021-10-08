package sistemapastel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import modelo.*;
import controle.*;
import javax.swing.*;

/**
 * Classe principal, com a função main
 * classe principal do package sistemapastel(view), package responsavel pela interface 
 * @author iago cabral
 *
 */
public class TelaMenu implements ActionListener {
	
	private static JFrame janela = new JFrame("Pastelaria Visosa");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton pastel = new JButton("Pastel");
	private static JButton bebida = new JButton("Bebida");
	private static JButton pedido = new JButton("Pedido");
	private static JButton funcionario = new JButton("Funcionario");
	private static JButton venda = new JButton("Venda");
	/**
	 * criando dados
	 */
	public static ControleDados dados = new ControleDados();
	
	

  /**
   * public tela menu, settando os tamanho dos elementos da interface e as adicionando
   */
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
	/**
	 * Função Main, adicionando uma ActionListener para os botoes 
	 * @param args args main
	 */
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		
		pastel.addActionListener(menu);
		bebida.addActionListener(menu);
		pedido.addActionListener(menu);
		funcionario.addActionListener(menu);
		venda.addActionListener(menu);
	}
	
	/**
	 * Função que captura os eventos selecionados na interface
	 * direciona e cria uma interface, de acordo com a opção selecionada
	 */
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
