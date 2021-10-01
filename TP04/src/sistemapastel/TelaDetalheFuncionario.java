package sistemapastel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;

public class TelaDetalheFuncionario implements ActionListener {

	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome do Funcionario : ");
	private JTextField valorNome;
	private JLabel labelID = new JLabel("ID: ");
	private JTextField valorID;
	private JLabel labelCPF = new JLabel("CPF: ");
	private JTextField valorCPF;
	private JLabel labelNascimento = new JLabel("Data de Nascimento: ");
	private JTextField valorNascimento;
	private JLabel labelEndereco = new JLabel("Endereço: ");
	private JTextField valorEndereco;
	private JLabel labelTelefone = new JLabel("Telefone: ");
	private JTextField valorTelefone;
	private JLabel labelHorario = new JLabel("Horario de Trab: ");
	private JTextField valorHorario;
	private JLabel labelOcupacao = new JLabel("Ocupação: ");
	private JTextField valorOcupacao;
	private JLabel labelSalario = new JLabel("Salario(R$): ");
	private JTextField valorSalario;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[10];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	public void inserirEditar(int op, ControleDados d, CRUDFuncionario p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1) s = "Cadastro de Funcionario";
		if (op == 3) s = "Detalhe de Funcionario";
		

		janela = new JFrame(s);

		//Preenche dados com dados do funcionario clicado
		if (op == 3) {
			valorNome = new JTextField(dados.getFuncionarios()[pos].getNomeFuncionario(), 200); //nome
			valorCPF = new JTextField(dados.getFuncionarios()[pos].getCpfFuncionario(),200); //cpf
			valorID = new JTextField(String.valueOf(dados.getFuncionarios()[pos].getNumeroID()),200); //ID
			valorNascimento = new JTextField(dados.getFuncionarios()[pos].getDataNascimento(), 200); //Data de Nascimento
			valorEndereco = new JTextField(dados.getFuncionarios()[pos].getEndFuncionario(), 200); //Endereco
			//NEW
			valorTelefone = new JTextField(String.valueOf(dados.getFuncionarios()[pos].getTelefoneFuncionario()),200); //Telefone
			valorHorario = new JTextField(dados.getFuncionarios()[pos].getTimeTrab(), 200); //Horario de trabalho
			valorOcupacao = new JTextField(dados.getFuncionarios()[pos].getFuncao(), 200);//Funcao do Trabalhador
			valorSalario = new JTextField(String.valueOf(dados.getFuncionarios()[pos].getSalario()),200); //Salario
		}
		else { 
			//Cadastrar um novo funcionario
			valorNome = new JTextField(200);
			valorCPF = new JTextField(200);
			valorID = new JTextField(200);
			valorNascimento = new JTextField(200);
			valorEndereco = new JTextField(200);
			valorTelefone = new JTextField(200);
			valorHorario = new JTextField(200);
			valorOcupacao = new JTextField(200);
			valorSalario = new JTextField(200);

			botaoSalvar.setBounds(245, 300, 115, 30);
		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelCPF.setBounds(30, 140, 150, 25);
		valorCPF.setBounds(180, 140, 180, 25);
		labelID.setBounds(30, 50, 180, 25);
		valorID.setBounds(180, 50, 180, 25);		
		labelNascimento.setBounds(30, 80, 150, 25);
		valorNascimento.setBounds(180, 80, 180, 25);
		labelEndereco.setBounds(30, 110, 150, 25);
		valorEndereco.setBounds(180, 110, 180, 25);
		labelTelefone.setBounds(30, 170, 150,25);
		valorTelefone.setBounds(180, 170, 180, 25);
		labelHorario.setBounds(30, 200, 150,25);
		valorHorario.setBounds(180, 200, 180, 25);
		labelOcupacao.setBounds(30, 230, 150, 25);
		valorOcupacao.setBounds(180, 230, 180, 25);
		labelSalario.setBounds(30, 260, 150, 25);
		valorSalario.setBounds(180, 260, 180, 25);
		
		
		if (op == 1 || op == 3 ) {
			this.janela.add(labelCPF);
			this.janela.add(valorCPF);
			this.janela.add(labelID);
			this.janela.add(valorID);
			
		}

		
		

		//Coloca botoes de excluir e salvar
		if (op == 3 || op == 4) {
			botaoSalvar.setBounds(120, 290, 115, 30);
			botaoExcluir.setBounds(245, 290, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelNascimento);
		this.janela.add(valorNascimento);
		this.janela.add(labelEndereco);
		this.janela.add(valorEndereco);
		this.janela.add(labelTelefone);
		this.janela.add(valorTelefone);
		this.janela.add(labelHorario);
		this.janela.add(valorHorario);
		this.janela.add(labelOcupacao);
		this.janela.add(valorOcupacao);
		this.janela.add(labelSalario);
		this.janela.add(valorSalario);
		
		this.janela.add(botaoSalvar);
		

		this.janela.setLayout(null);

		this.janela.setSize(400, 380); //500 250
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
					novoDado[0] = Integer.toString(dados.getQntFuncionarios());
				
				else 
					
				novoDado[0] = Integer.toString(posicao); //inteiro para string [0] = string
				novoDado[1] =  valorNome.getText(); //Nome    
				novoDado[3] =  valorNascimento.getText(); //Data de Nascimento
				novoDado[4] =  valorEndereco.getText(); 
				novoDado[5] =  valorTelefone.getText(); //INT
				novoDado[6] =  valorID.getText(); //INT
				novoDado[7] =  valorHorario.getText(); 
				novoDado[8] =  valorOcupacao.getText(); 
				novoDado[9] =  valorSalario.getText(); // DOUBLE 

				if (opcao == 1 || opcao == 3) {
					novoDado[2] =  valorCPF.getText(); 
					res = dados.inserirEditarFuncionario(novoDado);
					
				} else {
					novoDado[2] =  valorID.getText();
					res = dados.inserirEditarFuncionario(novoDado);
					
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
				res = dados.removerFuncionario(posicao);
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
				+ "2. ID, telefone e salario não contém apenas números", null, 
				JOptionPane.ERROR_MESSAGE);
	}


}