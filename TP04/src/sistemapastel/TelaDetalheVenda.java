package sistemapastel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;

/**
 * Package sistemapastel(view), Tela para Adicionar os dados em JtextFields 
 * Tela para coletar os dados da venda
 * @author Iago Cabral e Pedro Henrique
 */
public class TelaDetalheVenda implements ActionListener {

	private JFrame janela;
	private JLabel labelNumeroVenda = new JLabel("Numero da venda: ");
	private JTextField valorNumeroVenda;
	private JLabel labelNomeCliente = new JLabel("Nome do Cliente: ");
	private JTextField valorNomeCliente;
	private JLabel labelValorVenda = new JLabel("Valor da Venda: ");
	private JTextField valorValorVenda;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[10];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	/**
	 * Menu que cria a interface de acordo com a op
	 * op 1 = tela de cadastro
	 * op 3 = tela de detalhe
	 * adicionando a actionlistener aos bot�es
	 * @param op op��o para saber se vai cadastrar ou editar
	 * @param d  controle de dados
	 * @param p  interface CRUD para venda
	 * @param pos index da lista
	 */
	public void inserirEditar(int op, ControleDados d, CRUDVenda p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1) s = "Cadastro de Pedido";
		if (op == 3) s = "Detalhe de Pedido";
		

		janela = new JFrame(s);

		if (op == 3) {
			valorNumeroVenda = new JTextField(String.valueOf(dados.getVenda()[pos].getNumVenda()),200);
			valorNomeCliente = new JTextField(dados.getVenda()[pos].getNomeCliente(),200);
			valorValorVenda = new JTextField(String.valueOf(dados.getVenda()[pos].getValorVenda()),200);
		

		}
		else { 
			//Cadastrar um novo Pedido
			valorNumeroVenda = new JTextField(200);
			valorNomeCliente = new JTextField(200);
			valorValorVenda = new JTextField(200);



			botaoSalvar.setBounds(245, 290, 115, 30);
		}

		labelNumeroVenda.setBounds(30, 20, 150, 25);
		valorNumeroVenda.setBounds(180, 20, 180, 25);
		labelNomeCliente.setBounds(30, 50, 150, 25);
		valorNomeCliente.setBounds(180, 50, 180, 25);
		labelValorVenda.setBounds(30, 80, 180, 25);
		valorValorVenda.setBounds(180, 80, 180, 25);		
		
		//Coloca botoes de excluir e salvar
		if (op == 3 || op == 4) {
			botaoSalvar.setBounds(120, 290, 115, 30);
			botaoExcluir.setBounds(245, 290, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelNumeroVenda);
		this.janela.add(valorNumeroVenda);
		this.janela.add(labelNomeCliente);
		this.janela.add(valorNomeCliente);
		this.janela.add(labelValorVenda);
		this.janela.add(valorValorVenda);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 380);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}

	/**
	 * Fun��o que captura os eventos relacionados aos bot�es da interface
	 * Adiciona uma venda a lista caso seja add
	 * atualiza os dados desejados caso a op��o seja edit
	 * direciona e cria uma interface, de acordo com a op��o selecionada
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
			try {
				boolean res;
				if(opcao == 1) {

					novoDado[0] = Integer.toString(dados.getQntVendas());
				}
				else 
				
				novoDado[0] = Integer.toString(posicao); 

				novoDado[1] =  valorNumeroVenda.getText();    
				
				novoDado[3] =  valorValorVenda.getText(); 
	

				if (opcao == 1 || opcao == 3) {
					
					novoDado[2] =  valorNomeCliente.getText(); 
					res = dados.inserirEditarVenda(novoDado);
					
				} else {
					res = dados.inserirEditarVenda(novoDado);
					
				}
				if (novoDado[1].isEmpty() ) res = false;
				if (novoDado[2].isEmpty() ) res = false;
				if (novoDado[3].isEmpty() ) res = false;
				
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
				res = dados.removerVenda(posicao);
				
				if (res) mensagemSucessoExclusao(); 
	 
			}
				
	
		}
	}
	/**
	 * Fun��o que cria um JPane, com mensagem de sucesso na exclus�o
	 */
	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	/**
	 * Fun��o que cria um JPane, com mensagem de sucesso no cadastro
	 */
	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	/**
	 * Fun��o que cria um JPane, com mensagem de erro no cadastro
	 * Erros provavelments atribuidos a falta de preenchimento ou entrando uma Variavel incompativel ao Jtextfild
	 */
	public void mensagemErroCadastro() {
		
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
				+ "1. Nem todos os campos foram preenchidos \n"
				+ "2. Numero do Pedido, Valor do Pedido n�o s�o numeros inteiros", null, 
				JOptionPane.ERROR_MESSAGE);
	}

}