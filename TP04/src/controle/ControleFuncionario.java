package controle;
import modelo.*;

public class ControleFuncionario {

    private Funcionario[] a;
    private int qntFuncionario;

    public ControleFuncionario(ControleDados d) {

        a = d.getFuncionarios();
        qntFuncionario = d.getQntFuncionarios();


    }

    public String[] getNomeFuncionarios() {
        String[] s = new String[qntFuncionario];
        for(int i = 0; i < qntFuncionario; i++) {
            s[i] = a[i].getNomeFuncionario();
        }
        return s;
        }

    public int getQtd() {
        return qntFuncionario;
    }

    public void setQtd(int qtd) {
        this.qntFuncionario = qtd;
    }

    public String getCPF(int i) {
        return a[i].getCpfFuncionario();
    }

    public String getNascimento(int i) {
        return a[i].getDataNascimento();
    }

    public String getNomeFuncionario(int i) {
        return a[i].getNomeFuncionario();
    }

    public int getIDFuncionario(int i) {
        return a[i].getNumeroID();
    }
    
    public int getTelefone(int i) {
        return a[i].getTelefoneFuncionario();
    }

    public String getEndereco(int i) {
        return a[i].getEndFuncionario();
    }
    
    public String getHorario(int i) {
        return a[i].getTimeTrab();
    }
    
    public String getOcupacao(int i) {
        return a[i].getFuncao();
    }
    
    public double getSalario(int i) {
        return a[i].getSalario();
    }

    public void setQntFunciorario(int qntFuncionario) {
        this.qntFuncionario = qntFuncionario;
    }
}
