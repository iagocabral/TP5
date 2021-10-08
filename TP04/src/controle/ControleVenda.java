package controle;
import modelo.*;
/**
 * Package Controle, package responsavel por fazer a ligacao entro o package modelo e o package sistemapastel(view)
 * Classe responsavel pelo controle das Vendas, fazendo a ligaçao entre Venda e view  
 * @author Iago Cabral e Pedro Henrique
 */
public class ControleVenda {

    private Venda[] a;
    private int qntVenda;

    /**
     *  Settando a função para controle de Vendas
     * @param d parametro d do tipo Dados
     */
    public ControleVenda(ControleDados d) {

        a = d.getVenda();
        qntVenda = d.getQntVendas();


    }

    /**
     * Função para retornar o nome do cliente da venda
     * @return String s com o nome de um cliente
     */
    public String[] getNomeVenda() {
        String[] s = new String[qntVenda];
        for(int i = 0; i < qntVenda; i++) {
            s[i] = a[i].getNomeCliente();
        }
        return s;
        }

    /**
     * Função para retornar a quantidade de vendas
     * @return retorna um inteiro, a quantidade de vendas 
     */
    public int getQtd() {
        return qntVenda;
    }

    /**
     * Função para Settar a quantidade de vendas
     * @param qtd  um inteiro, que é a quantidade de vendas
     */
    public void setQtd(int qtd) {
        this.qntVenda = qtd;
    
    }
    
    /**
     * Função que retorna o valor da venda
     * @return retorna um inteiro, o valor da venda
     */
    public int getValorVenda() {
        return qntVenda;
    }
}
  
