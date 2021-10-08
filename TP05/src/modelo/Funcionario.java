package modelo;

/** 
 * Classe Funcionario, com todos os dados necessarios de um funcionario
 * @author iago cabral
 *
 */

public class Funcionario {

	private String nomeFuncionario; 
	private int numeroID; 
	private String cpfFuncionario; 
	private String dataNascimento; 
	private String endFuncionario; 
	private int telefoneFuncionario; 
	private String timeTrab; 
	private String funcao; 
	private double salario; 

	/** 
	 * Construtor de funcionario
	 * public funcionarios com os seguinte paramentros: 
	 * @param nf nome do funcionario
	 * @param id identidade do funcionario
	 * @param cpf cpf do fuincionario
	 * @param nascimento data de nascimento do funcionario 
	 * @param endereco endereço do funcionario
	 * @param telefone telefone do funcionario
	 * @param horario  carga de trabalho
	 * @param ocupacao função ocupada na empresa
	 * @param salarioFun salario pago ao funcionario
	 */
	public Funcionario(String nf, int id, String cpf, String nascimento, String endereco, int telefone, String horario, String ocupacao, double salarioFun) {
		
		nomeFuncionario = nf; 
		numeroID = id; 
		cpfFuncionario = cpf; 
		dataNascimento = nascimento; 
		endFuncionario = endereco; 
		telefoneFuncionario = telefone; 
		timeTrab = horario; 
		funcao = ocupacao; 
		salario = salarioFun;  
	
	
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public int getNumeroID() {
		return numeroID;
	}

	public void setNumeroID(int numeroID) {
		this.numeroID = numeroID;
	}


	public String getCpfFuncionario() {
		return cpfFuncionario;
	}

	public void setCpfFuncionario(String cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndFuncionario() {
		return endFuncionario;
	}

	public void setEndFuncionario(String endFuncionario) {
		this.endFuncionario = endFuncionario;
	}

	public int getTelefoneFuncionario() {
		return telefoneFuncionario;
	}

	public void setTelefoneFuncionario(int telefoneFuncionario) {
		this.telefoneFuncionario = telefoneFuncionario;
	}

	

	public String getTimeTrab() {
		return timeTrab;
	}

	public void setTimeTrab(String timeTrab) {
		this.timeTrab = timeTrab;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}


	

}
