package sistemapastel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;

public class TelaDetalheBebida implements ActionListener {

	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome do Produto: ");
	private JTextField valorNome;
	private JLabel labelValor = new JLabel("Valor(R$): ");
	private JTextField valorValor;
	private JLabel labelTam = new JLabel("Tamanho: ");
	private JTextField valorTam;
	private JLabel labelTipo = new JLabel("Tipo: ");
	private JTextField valorTipo;
	private JLabel labelSabor = new JLabel("Sabor: ");
	private JTextField valorSabor;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	public void inserirEditar(int op, ControleDados d, CRUDBebida p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1) s = "Cadastro de Bebida";
		if (op == 3) s = "Detalhe de Bebida";
		

		janela = new JFrame(s);

		//Preenche dados com dados da bebida clicada
		if (op == 3) {
			valorNome = new JTextField(dados.getBebidas()[pos].getNomeProduto(), 200);
			valorTam = new JTextField(dados.getBebidas()[pos].getTamanhoProduto(),200);
			valorValor = new JTextField(String.valueOf(dados.getBebidas()[pos].getValorProduto()),200);
			valorTipo = new JTextField(dados.getBebidas()[pos].getTipo(), 200);
			valorSabor = new JTextField(dados.getBebidas()[pos].getSabor(), 200);
			
		}
		else { 
			//Cadastrar uma nova bebida
			valorNome = new JTextField(200);
			valorTam = new JTextField(200);
			valorValor = new JTextField(200);
			valorTipo = new JTextField(200);
			valorSabor = new JTextField(200);


			botaoSalvar.setBounds(245, 175, 115, 30);
		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelTam.setBounds(30, 140, 150, 25);
		valorTam.setBounds(180, 140, 180, 25);
		labelValor.setBounds(30, 50, 180, 25);
		valorValor.setBounds(180, 50, 180, 25);		
		labelTipo.setBounds(30, 80, 150, 25);
		valorTipo.setBounds(180, 80, 180, 25);
		labelSabor.setBounds(30, 110, 150, 25);
		valorSabor.setBounds(180, 110, 180, 25);


		if (op == 1 || op == 3 ) {
			this.janela.add(labelTam);
			this.janela.add(valorTam);
			this.janela.add(labelValor);
			this.janela.add(valorValor);

		}

		//Coloca botoes de excluir e salvar
		if (op == 3 || op == 4) {
			botaoSalvar.setBounds(120, 175, 115, 30);
			botaoExcluir.setBounds(245, 175, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelTipo);
		this.janela.add(valorTipo);
		this.janela.add(labelSabor);
		this.janela.add(valorSabor);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(500, 250);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
			try {
				boolean res;
				if(opcao == 1) 
					novoDado[0] = Integer.toString(dados.getQntBebida());
				
				else 
					
				novoDado[0] = Integer.toString(posicao); //inteiro para string [0] = string

				novoDado[1] =  valorNome.getText();    // string [1] = string, nome bebida 
				novoDado[3] =  valorTipo.getText(); // string [3] = string, tipo bebida
				novoDado[4] =  valorSabor.getText(); //string [4] = string, sabor bebida
				novoDado[5] =  valorValor.getText(); //preço da bebida

				if (opcao == 1 || opcao == 3) {
					novoDado[2] =  valorTam.getText();
					res = dados.inserirEditarBebida(novoDado);
					
				} else {
					novoDado[2] =  valorValor.getText();
					res = dados.inserirEditarBebida(novoDado);
					
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
				res = dados.removerBebida(posicao);
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
				+ "2. Valor(R$) não contém apenas números", null, 
				JOptionPane.ERROR_MESSAGE);
	}

}