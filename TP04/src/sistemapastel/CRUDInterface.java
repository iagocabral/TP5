package sistemapastel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;


public class CRUDInterface implements ActionListener, ListSelectionListener {
    
    private JFrame janela;
    private JLabel titulo;
    private JButton cadastroPastel;
    private JButton refreshPastel;
    private static ControleDados dados;
    private JList<String> listaPasteisCadastrados;
    private String[] listaNomes = new String[50];
    
    
    public void mostrarDados(ControleDados d, int op){
        dados = d;
        
        switch (op) {
        case 1:
            listaNomes = new ControlePastel(dados).getNomePastel(); 
        	
            listaPasteisCadastrados = new JList<String>(listaNomes);
            janela = new JFrame("Pasteis");
            titulo = new JLabel("Pasteis Cadastrados");
            cadastroPastel = new JButton("Cadastrar");
            refreshPastel = new JButton("Refresh");

            titulo.setFont(new Font("Arial", Font.BOLD, 20));
            titulo.setBounds(90, 10, 250, 30);
            listaPasteisCadastrados.setBounds(20, 50, 350, 120);
            listaPasteisCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
            listaPasteisCadastrados.setVisibleRowCount(10);

            cadastroPastel.setBounds(70, 177, 100, 30);
            refreshPastel.setBounds(200, 177, 100, 30);

            janela.setLayout(null);

            janela.add(titulo);
            janela.add(listaPasteisCadastrados);
            janela.add(cadastroPastel);
            janela.add(refreshPastel);

            janela.setSize(400, 250);
            janela.setVisible(true);

            cadastroPastel.addActionListener(this);
            refreshPastel.addActionListener(this);
            listaPasteisCadastrados.addListSelectionListener(this);
            break; 

        default:
            JOptionPane.showMessageDialog(null,"Opção não encontrada!", null, 
                    JOptionPane.ERROR_MESSAGE);
        }

    }
    
    //Captura eventos relacionados aos botões da interface
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        
        //Cadastro de novo pastel
        if(src == cadastroPastel)
            new TelaDetalheProduto().inserirEditar(1, dados, this, 0);



        // Atualiza a lista de pasteis mostrada no JList
        if(src == refreshPastel) {
            listaPasteisCadastrados.setListData(new ControlePastel(dados).getNomePastel());            
            listaPasteisCadastrados.updateUI();
        }
    }
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();

        if(e.getValueIsAdjusting() && src == listaPasteisCadastrados) {
            new TelaDetalheProduto().inserirEditar(3, dados, this, 
                    listaPasteisCadastrados.getSelectedIndex());
        
    }
    }   
    
}