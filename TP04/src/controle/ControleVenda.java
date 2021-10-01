package controle;
import modelo.*;

public class ControleVenda {

    private Venda[] a;
    private int qntVenda;

    public ControleVenda(ControleDados d) {

        a = d.getVenda();
        qntVenda = d.getQntVendas();


    }

    public String[] getNomeVenda() {
        String[] s = new String[qntVenda];
        for(int i = 0; i < qntVenda; i++) {
            s[i] = a[i].getNomeCliente();
        }
        return s;
        }

    public int getQtd() {
        return qntVenda;
    }

    public void setQtd(int qtd) {
        this.qntVenda = qtd;
    
    }
    
    public int getValorVenda() {
        return qntVenda;
    }
}
  
