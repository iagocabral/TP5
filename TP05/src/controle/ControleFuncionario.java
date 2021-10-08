package controle;
import modelo.*;
/**
 * Package Controle, package responsavel por fazer a ligacao entro o package modelo e o package sistemapastel(view)
 * Classe responsavel pelo controle dos funcionarios, fazendo a ligaçao entre Funcionario e view  
 * @author Iago Cabral e Pedro Henrique
 */
public class ControleFuncionario {

    private Funcionario[] a;
    private int qntFuncionario;
    
    /**
     *  Settando a função para controle de funcionarios
     * @param d parametro d do tipo Dados
     */
    public ControleFuncionario(ControleDados d) {

        a = d.getFuncionarios();
        qntFuncionario = d.getQntFuncionarios();


    }

    /**
     * Função para retornar o nome de um funcionario 
     * @return String s com o nome de um funcionario
     */
    public String[] getNomeFuncionarios() {
        String[] s = new String[qntFuncionario];
        for(int i = 0; i < qntFuncionario; i++) {
            s[i] = a[i].getNomeFuncionario();
        }
        return s;
        }
    
    /**
     * Função para retornar a quantidade de funcionarios
     * @return retorna um inteiro, a quantidade de funcionarios 
     */
    public int getQtd() {
        return qntFuncionario;
    }
    
    /**
     * Função para Settar a quantidade de funcionarios
     * @param qtd um inteiro, que é a quantidade de funcionarios
     */
    public void setQtd(int qtd) {
        this.qntFuncionario = qtd;
    }
    
    /**
     * Funcao para retornar o cpf de um funcionario do indice i
     * @param i indice em uma lista (lista de funcionarios
     * @return	retorna uma string contendo o cpf do funcionario
     */
    public String getCPF(int i) {
        return a[i].getCpfFuncionario();
    }

    /**
     * Funcao para retornar a data de nascimento de um funcionario do indice i
     * @param i indice em uma lista (lista de funcionarios
     * @return	retorna uma string contendo a data de nascimento do funcionario
     */
    public String getNascimento(int i) {
        return a[i].getDataNascimento();
    }

    /**
     * Funcao para retornar o nome de um funcionario do indice i
     * @param i indice em uma lista (lista de funcionarios
     * @return	retorna uma string contendo o nome do funcionario
     */
    
    public String getNomeFuncionario(int i) {
        return a[i].getNomeFuncionario();
    }

    /**
     * Funcao para retornar a identidade de um funcionario do indice i
     * @param i indice em uma lista (lista de funcionarios
     * @return	retorna uma inteiro contendo a identidade do funcionario
     */
    public int getIDFuncionario(int i) {
        return a[i].getNumeroID();
    }
    
    /**
     * Funcao para retornar o telefone de um funcionario do indice i
     * @param i indice em uma lista (lista de funcionarios
     * @return	retorna uma inteiro contendo o telefone do funcionario
     */
    public int getTelefone(int i) {
        return a[i].getTelefoneFuncionario();
    }

    /**
     * Funcao para retornar o endereço de um funcionario do indice i
     * @param i indice em uma lista (lista de funcionarios
     * @return	retorna uma string contendo o endereço do funcionario
     */
    public String getEndereco(int i) {
        return a[i].getEndFuncionario();
    }
    
    /**
     * Funcao para retornar o horaio de trabalho de um funcionario do indice i
     * @param i indice em uma lista (lista de funcionarios
     * @return	retorna uma string contendo o horario de trabalho do funcionario
     */
    public String getHorario(int i) {
        return a[i].getTimeTrab();
    }
    
    /**
     * Funcao para retornar a ocupação de um funcionario do indice i
     * @param i indice em uma lista (lista de funcionarios
     * @return	retorna uma string contendo a ocupação do funcionario
     */
    public String getOcupacao(int i) {
        return a[i].getFuncao();
    }
    
    /**
     * Funcao para retornar o salario de um funcionario do indice i
     * @param i indice em uma lista (lista de funcionarios
     * @return	retorna um double contendo o salario do funcionario
     */
    public double getSalario(int i) {
        return a[i].getSalario();
    }

    /**
     * Função para setar a quantidade de funcionarios
     * @param qntFuncionario inteiro contendo a quantidade de funcionarios
     */
    public void setQntFunciorario(int qntFuncionario) {
        this.qntFuncionario = qntFuncionario;
    }
}
