package sistemapastel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;

public class TelaDetalhePedido implements ActionListener {

	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome do Cliente: ");
	private JTextField valorNome;
	private JLabel labelEscPastel = new JLabel("Escolha do Pastel: ");
	private JTextField valorEscPastel;
	private JLabel labelQntPastel = new JLabel("Quantidade do Pastel: ");
	private JTextField valorQntPastel;
	private JLabel labelEscBebida = new JLabel("Escolha da Bebida: ");
	private JTextField valorEscBebida;
	private JLabel labelQntBebida = new JLabel("Quantidade da Bebida: ");
	private JTextField valorQntBebida;
	private JLabel labelValorPedido = new JLabel("O valor total(R$): ");
	private JTextField valorValorPedido;
	private JLabel labelTimeCompra = new JLabel("O horario da compra: ");
	private JTextField valorTimeCompra;
	private JLabel labelNumPedido = new JLabel("O Numero do Pedido(Int): ");
	private JTextField valorNumPedido;
	private JLabel labelNomeGarcom = new JLabel("O Nome do Garcom: ");
	private JTextField valorNomeGarcom;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[10];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	public void inserirEditar(int op, ControleDados d, CRUDPedido p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1) s = "Cadastro de Pedido";
		if (op == 3) s = "Detalhe de Pedido";
		

		janela = new JFrame(s);

		if (op == 3) {
			valorNome = new JTextField(dados.getPedidos()[pos].getNomeCliente(), 200);
			valorEscPastel = new JTextField(dados.getPedidos()[pos].getEscPastel(),200);
			valorQntPastel = new JTextField(String.valueOf(dados.getPedidos()[pos].getQntPastel()),200);
			valorEscBebida = new JTextField(dados.getPedidos()[pos].getEscBebida(), 200);
			valorQntBebida = new JTextField(String.valueOf(dados.getPedidos()[pos].getQntBebida()), 200);
			valorValorPedido = new JTextField(String.valueOf(dados.getPedidos()[pos].getValorPedido()), 200);
			valorTimeCompra = new JTextField(dados.getPedidos()[pos].getTimeCompra(), 200);
			valorNumPedido = new JTextField(String.valueOf(dados.getPedidos()[pos].getNumPedido()), 200);
			valorNomeGarcom =  new JTextField(dados.getPedidos()[pos].getNomeGarcom(), 200);
			
			
		}
		else { 
			//Cadastrar um novo Pedido
			valorNome = new JTextField(200);
			valorEscPastel = new JTextField(200);
			valorQntPastel = new JTextField(200);
			valorEscBebida = new JTextField(200);
			valorQntBebida = new JTextField(200);
			valorValorPedido = new JTextField(200);
			valorTimeCompra = new JTextField(200);
			valorNumPedido = new JTextField(200);
			valorNomeGarcom = new JTextField(200);



			botaoSalvar.setBounds(245, 290, 115, 30);
		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelEscPastel.setBounds(30, 50, 150, 25);
		valorEscPastel.setBounds(180, 50, 180, 25);
		labelQntPastel.setBounds(30, 80, 180, 25);
		valorQntPastel.setBounds(180, 80, 180, 25);		
		labelEscBebida.setBounds(30, 110, 150, 25);
		valorEscBebida.setBounds(180, 110, 180, 25);
		labelQntBebida.setBounds(30, 140, 150, 25);
		valorQntBebida.setBounds(180, 140, 180, 25);
		labelValorPedido.setBounds(30, 170, 150, 25);
		valorValorPedido.setBounds(180, 170, 180, 25);
		labelTimeCompra.setBounds(30, 200, 150, 25);
		valorTimeCompra.setBounds(180, 200, 180, 25);
		labelNumPedido.setBounds(30, 230, 150, 25);
		valorNumPedido.setBounds(180, 230, 180, 25);
		labelNomeGarcom.setBounds(30, 260, 150, 25);
		valorNomeGarcom.setBounds(180, 260, 180, 25);

		//Coloca botoes de excluir e salvar
		if (op == 3 || op == 4) {
			botaoSalvar.setBounds(120, 290, 115, 30);
			botaoExcluir.setBounds(245, 290, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelEscPastel);
		this.janela.add(valorEscPastel);
		this.janela.add(labelQntPastel);
		this.janela.add(valorQntPastel);
		this.janela.add(labelEscBebida);
		this.janela.add(valorEscBebida);
		this.janela.add(labelQntBebida);
		this.janela.add(valorQntBebida);		
		this.janela.add(labelValorPedido);
		this.janela.add(valorValorPedido);
		this.janela.add(labelTimeCompra);
		this.janela.add(valorTimeCompra);
		this.janela.add(labelNumPedido);
		this.janela.add(valorNumPedido);
		this.janela.add(labelNomeGarcom);
		this.janela.add(valorNomeGarcom);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 380);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
			try {
				boolean res;
				if(opcao == 1) {

					novoDado[0] = Integer.toString(dados.getQntPedidos());
				}
				else 
				
				novoDado[0] = Integer.toString(posicao); 

				novoDado[1] =  valorNome.getText();    
				
				novoDado[3] =  valorQntPastel.getText(); 
				novoDado[4] =  valorEscBebida.getText(); 
				novoDado[5] =  valorQntBebida.getText(); 
				novoDado[6] =  valorValorPedido.getText(); 
				novoDado[7] =  valorTimeCompra.getText(); 
				novoDado[8] =  valorNumPedido.getText(); 
				novoDado[9] =  valorNomeGarcom.getText(); 
							
				

				if (opcao == 1 || opcao == 3) {
					
					novoDado[2] =  valorEscPastel.getText(); 
					res = dados.inserirEditarPedido(novoDado);
					
				} else {
					res = dados.inserirEditarPedido(novoDado);
					
				}
				
				if(res == true) {
					mensagemSucessoCadastro();
				}
				else mensagemErroCadastro();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}
		if(src == botaoExcluir) {
			boolean res = false;

			if (opcao == 3) {
				res = dados.removerPedidos(posicao);
				if (res) mensagemSucessoExclusao(); 
	 
			}
				
	
		}
	}

	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
				+ "1. Nem todos os campos foram preenchidos \n"
				+ "2. Valor do Pedido, Numero do Pedido, Quantidade de Pastel e Bebida devem ser numeros inteiros", null, 
				JOptionPane.ERROR_MESSAGE);
	}

}