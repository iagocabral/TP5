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
 * Tela para coletar os dados do Pastel
 * @author Iago Cabral e Pedro Henrique
 */
public class TelaDetalheProduto implements ActionListener {

	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome do Produto: ");
	private JTextField valorNome;
	private JLabel labelValor = new JLabel("Valor(R$): ");
	private JTextField valorValor;
	private JLabel labelTam = new JLabel("Tamanho: ");
	private JTextField valorTam;
	private JLabel labelRecheio = new JLabel("Recheio: ");
	private JTextField valorRecheio;
	private JLabel labelCozinheiro = new JLabel("Cozinheiro: ");
	private JTextField valorCozinheiro;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;
	
	/**
	 * Menu que cria a interface de acordo com a op
	 * op 1 = tela de cadastro
	 * op 3 = tela de detalhe
	 * adicionando a actionlistener aos botões
	 * @param op opção para saber se vai cadastrar ou editar
	 * @param d  controle de dados
	 * @param p  interface CRUD para pastel
	 * @param pos index da lista
	 */
	public void inserirEditar(int op, ControleDados d, CRUDInterface p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1) s = "Cadastro de Pastel";
		if (op == 3) s = "Detalhe de Pastel";

		janela = new JFrame(s);

		//Preenche dados do dado do Pastel
		if (op == 3) {
			valorNome = new JTextField(dados.getPaslteis()[pos].getNomeProduto(), 200);
			valorTam = new JTextField(dados.getPaslteis()[pos].getTamanhoProduto(),200);
			valorValor = new JTextField(String.valueOf(
					dados.getPaslteis()[pos].getValorProduto()),200);
			valorRecheio = new JTextField(dados.getPaslteis()[pos].getRecheio(), 200);
			valorCozinheiro = new JTextField(dados.getPaslteis()[pos].getCozinheiro(), 200);
			
		}
		else { 
			//Cadastrar um novo pastel
			valorNome = new JTextField(200);
			valorTam = new JTextField(200);
			valorValor = new JTextField(200);
			valorRecheio = new JTextField(200);
			valorCozinheiro = new JTextField(200);


			botaoSalvar.setBounds(245, 175, 115, 30);
		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelTam.setBounds(30, 140, 150, 25);
		valorTam.setBounds(180, 140, 180, 25);
		labelValor.setBounds(30, 50, 180, 25);
		valorValor.setBounds(180, 50, 180, 25);		
		labelRecheio.setBounds(30, 80, 150, 25);
		valorRecheio.setBounds(180, 80, 180, 25);
		labelCozinheiro.setBounds(30, 110, 150, 25);
		valorCozinheiro.setBounds(180, 110, 180, 25);


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
		this.janela.add(labelRecheio);
		this.janela.add(valorRecheio);
		this.janela.add(labelCozinheiro);
		this.janela.add(valorCozinheiro);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(500, 250);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}

	/**
	 * Função que captura os eventos relacionados aos botões da interface
	 * Adiciona uma produto a lista caso seja add
	 * atualiza os dados desejados caso a opção seja edit
	 * direciona e cria uma interface, de acordo com a opção selecionada
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
			try {
				boolean res;
				if(opcao == 1) //cadastro de novo pastel
					novoDado[0] = Integer.toString(dados.getQntPastel());
				
				else // edicao de dado existente
					
				novoDado[0] = Integer.toString(posicao); //inteiro para string [0] = string

				novoDado[1] =  valorNome.getText();    // string [1] = string, nome pastel 
				novoDado[3] =  valorRecheio.getText(); // string [3] = string, recheio pastel
				novoDado[4] =  valorCozinheiro.getText(); //string [4] = string, cozinheiro
				novoDado[5] =  valorValor.getText(); //preço do pastel, inteiro

				if (opcao == 1 || opcao == 3) {
					novoDado[2] =  valorTam.getText();
					res = dados.inserirEditarPastel(novoDado);
					
				} else {
					novoDado[2] =  valorValor.getText();
					res = dados.inserirEditarPastel(novoDado);
					
				}
				if (novoDado[1].isEmpty() ) res = false;
				if (novoDado[2].isEmpty() ) res = false;
				if (novoDado[3].isEmpty() ) res = false;
				if (novoDado[4].isEmpty() ) res = false;
				if (novoDado[5].isEmpty() ) res = false;
				
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

			if (opcao == 3) {//exclui aluno
				res = dados.removerPastel(posicao);
				if (res) mensagemSucessoExclusao(); 
				
			}
				
	
		}
	}
	
	/**
	 * Função que cria um JPane, com mensagem de sucesso na exclusão
	 */
	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	/**
	 * Função que cria um JPane, com mensagem de sucesso no cadastro
	 */
	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	/**
	 * Função que cria um JPane, com mensagem de erro no cadastro
	 * Erros provavelments atribuidos a falta de preenchimento ou entrando uma Variavel incompativel ao Jtextfild
	 */
	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
				+ "1. Nem todos os campos foram preenchidos \n"
				+ "2. Valor(R$) não contém apenas números", null, 
				JOptionPane.ERROR_MESSAGE);
	}
}