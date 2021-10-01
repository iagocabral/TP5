package controle;
import modelo.*;

public class ControlePastel {

    private Pastel[] a;
    private int qntPastel;

    public ControlePastel(ControleDados d) {

        a = d.getPaslteis();
        qntPastel = d.getQntPastel();


    }

    public String[] getNomePastel() {
        String[] s = new String[qntPastel];
        for(int i = 0; i < qntPastel; i++) {
            s[i] = a[i].getNomeProduto();
        }
        return s;
        }

    public int getQtd() {
        return qntPastel;
    }

    public void setQtd(int qtd) {
        this.qntPastel = qtd;
    }

    public String getRecheio(int i) {
        return a[i].getRecheio();
    }

    public String getCozinheiro(int i) {
        return a[i].getCozinheiro();
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

    public void setQntPasteis(int qntPastel) {
        this.qntPastel = qntPastel;
    }

}
