package controle;
import modelo.*;

public class ControleBebida {

    private Bebida[] a;
    private int qntBebida;

    public ControleBebida(ControleDados d) {

        a = d.getBebidas();
        qntBebida = d.getQntBebida();


    }

    public String[] getNomeBebida() {
        String[] s = new String[qntBebida];
        for(int i = 0; i < qntBebida; i++) {
            s[i] = a[i].getNomeProduto();
        }
        return s;
        }

    public int getQtd() {
        return qntBebida;
    }

    public void setQtd(int qtd) {
        this.qntBebida = qtd;
    }

    public String getTipo(int i) {
        return a[i].getTipo();
    }

    public String getSabor(int i) {
        return a[i].getSabor();
    }

    public String getNomeProduto(int i) {
        return a[i].getNomeProduto();
    }

    public int getValorProduto(int i) {
        return a[i].getValorProduto();
    }

    public String getTamanhoProduto(int i) {
        return a[i].getTamanhoProduto();
    }

    public void setQntBebidas(int qntBebidas) {
        this.qntBebida = qntBebidas;
    }
}
