package sistemapastel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;


public class CRUDFuncionario implements ActionListener, ListSelectionListener {
    
    private JFrame janela;
    private JLabel titulo;
    private JButton cadastroFuncionarios;
    private JButton refreshFuncionarios;
    private static ControleDados dados;
    private JList<String> listaFuncionarioCadastrados;
    private String[] listaNomes = new String[50];
    
    
    public void mostrarDados(ControleDados d, int op){
        dados = d;
        
        switch (op) {
        case 1:
            listaNomes = new ControleFuncionario(dados).getNomeFuncionarios(); 
        	
            listaFuncionarioCadastrados = new JList<String>(listaNomes);
            janela = new JFrame("Funcionarios");
            titulo = new JLabel("Funcionarios Cadastrados");
            cadastroFuncionarios = new JButton("Cadastrar");
            refreshFuncionarios = new JButton("Refresh");

            titulo.setFont(new Font("Arial", Font.BOLD, 20));
            titulo.setBounds(90, 10, 250, 30);
            listaFuncionarioCadastrados.setBounds(20, 50, 350, 120);
            listaFuncionarioCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
            listaFuncionarioCadastrados.setVisibleRowCount(10);

            cadastroFuncionarios.setBounds(70, 177, 100, 30);
            refreshFuncionarios.setBounds(200, 177, 100, 30);

            janela.setLayout(null);

            janela.add(titulo);
            janela.add(listaFuncionarioCadastrados);
            janela.add(cadastroFuncionarios);
            janela.add(refreshFuncionarios);

            janela.setSize(400, 250);
            janela.setVisible(true);

            cadastroFuncionarios.addActionListener(this);
            refreshFuncionarios.addActionListener(this);
            listaFuncionarioCadastrados.addListSelectionListener(this);
            break; 

        default:
            JOptionPane.showMessageDialog(null,"Opção não encontrada!", null, 
                    JOptionPane.ERROR_MESSAGE);
        }

    }
    
    
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        
        
        if(src == cadastroFuncionarios)
        	new TelaDetalheFuncionario().inserirEditar(1, dados, this, 0);



        
        if(src == refreshFuncionarios) {
        	listaFuncionarioCadastrados.setListData(new ControleFuncionario(dados).getNomeFuncionarios());            
        	listaFuncionarioCadastrados.updateUI();
        }
    }
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();

        if(e.getValueIsAdjusting() && src == listaFuncionarioCadastrados) {
          new TelaDetalheFuncionario().inserirEditar(3, dados, this, 
            		listaFuncionarioCadastrados.getSelectedIndex());
        
    }
    }   
    
}