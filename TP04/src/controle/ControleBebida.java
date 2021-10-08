package controle;
import modelo.*;
/**
 * Package Controle, package responsavel por fazer a ligacao entre o package modelo e o package sistemapastel(view)
 * Classe responsavel pelo controle bebida, fazendo a liga�ao entre bebida e view 
 * @author Iago Cabral e Pedro Henrique
 *
 */
 
public class ControleBebida {
    private Bebida[] a;
    private int qntBebida;

    /**
     *  Settando a fun��o para controle de Bebida
     * @param d parametro d do tipo Dados
     */
    public ControleBebida(ControleDados d) {
        a = d.getBebidas();
        qntBebida = d.getQntBebida();
    } 	

    /**
     * Fun��o para retornar o nome de uma bebida 
     * @return String s com o nome da Bebida
     */
    public String[] getNomeBebida() {
        String[] s = new String[qntBebida];
        for(int i = 0; i < qntBebida; i++) {
            s[i] = a[i].getNomeProduto();
        }
        return s;
        }
    
    /**
     * Fun��o para retornar a quantidade de bebidas
     * @return retorna um inteiro, a quantidade de bebidas 
     */

    public int getQtd() {
        return qntBebida;
    }
    
    /**
     * Fun��o para Settar a quantidade de bebidas
     * @param qtd um interio, que � a quantidade de bebidas
     */

    public void setQtd(int qtd) {
        this.qntBebida = qtd;
    }
    
    /**
     * Fun��o para retornar o tipo de uma bebida que esta na lista
     * @param i parametro, indice na lista que deseja ter os dados
     * @return String contendo o tipo da bebida da posi��o i
     */

    public String getTipo(int i) {
        return a[i].getTipo();
    }
    
    /**
     * Fun��o para retornar o sabor de uma bebida que esta na lista
     * @param i parametro, indice na lista que deseja ter os dados
     * @return String contendo o sabor da bebida da posi��o i
     */

    public String getSabor(int i) {
        return a[i].getSabor();
    }
    
    /**
     * Fun��o para retornar o nome de uma bebida que esta na lista
     * @param i parametro, indice na lista que deseja ter os dados
     * @return String contendo o nome da bebida da posi��o i
     */
    
    public String getNomeProduto(int i) {
        return a[i].getNomeProduto();
    }
    
    /**
     * Fun��o para retornar o pre�o de uma bebida que esta na lista
     * @param i parametro, indice na lista que deseja ter os dados
     * @return int contendo o valor da bebida da posi��o i
     */

    public int getValorProduto(int i) {
        return a[i].getValorProduto();
    }
    
    /**
     * Fun��o para retornar o tamanho de uma bebida que esta na lista
     * @param i parametro, indice na lista que deseja ter os dados
     * @return String contendo o tamanho da bebida da posi��o i
     */
    
    public String getTamanhoProduto(int i) {
        return a[i].getTamanhoProduto();
    }

    /**
     * Fun��o para settar a quantidade de bebidas na lista
     * @param qntBebidas contendo o numero de bebidas
     */
    public void setQntBebidas(int qntBebidas) {
        this.qntBebida = qntBebidas;
    }
}
