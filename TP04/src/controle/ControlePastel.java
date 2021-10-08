package controle;
import modelo.*;
/**
 * Package Controle, package responsavel por fazer a ligacao entro o package modelo e o package sistemapastel(view)
 * Classe responsavel pelo controle dos Pasteis, fazendo a ligaçao entre Pastel e view  
 * @author Iago Cabral e Pedro Henrique
 */
public class ControlePastel {

    private Pastel[] a;
    private int qntPastel;

    /**
     *  Settando a função para controle de Pastel
     * @param d parametro d do tipo Dados
     */
    public ControlePastel(ControleDados d) {

        a = d.getPaslteis();
        qntPastel = d.getQntPastel();


    }

    /**
     * Função para retornar o nome de um Pastel 
     * @return String s com o nome de um pastel
     */
    public String[] getNomePastel() {
        String[] s = new String[qntPastel];
        for(int i = 0; i < qntPastel; i++) {
            s[i] = a[i].getNomeProduto();
        }
        return s;
        }

    /**
     * Função para retornar a quantidade de Pasteis
     * @return retorna um inteiro, a quantidade de pastel
     */
    public int getQtd() {
        return qntPastel;
    }

    /**
     * Função para Settar a quantidade de pasteis
     * @param qtd um inteiro, que é a quantidade de pasteis
     */
    public void setQtd(int qtd) {
        this.qntPastel = qtd;
    }
    
    /**
     * Funcao quer retorna o recheio de um pastel no indice i
     * @param i inteiro que respresenta o indice do pastel desejado na lista
     * @return retorna uma string contendo o recheio do pastel
     */

    public String getRecheio(int i) {
        return a[i].getRecheio();
    }
    
    /**
     * Funcao quer retorna o cozinheiro de um pastel no indice i
     * @param i inteiro que respresenta o indice do pastel desejado na lista
     * @return retorna uma string contendo o nome do cozinheiro que fez o pastel
     */
    public String getCozinheiro(int i) {
        return a[i].getCozinheiro();
    }

    /**
     * funcao para retornar o nome de um pastel
     * @param i inteiro que respresenta o indice do pastel desejado na lista
     * @return retorna uma string contendo o nome do pastel
     */
    public String getNomeProduto(int i) {
        return a[i].getNomeProduto();
    }

    /**
     * funcao para retornar o valor de um pastel
     * @param i inteiro que respresenta o indice do pastel desejado na lista
     * @return retorna um int contendo o valor do pastel[i]
     */
    public int getValorProduto(int i) {
        return a[i].getValorProduto();
    }

    /**
     * funcao para retornar o tamanho de um pastel
     * @param i inteiro que respresenta o indice do pastel desejado na lista
     * @return retorna uma string contendo o tamanho do pastel[i]
     */
    public String getTamanhoProduto(int i) {
        return a[i].getTamanhoProduto();
    }

    /**
     * Função para setar a quantidade de pasteis
     * @param qntPastel inteiro contendo a quantidade de pasteis
     */
    public void setQntPasteis(int qntPastel) {
        this.qntPastel = qntPastel;
    }

}
