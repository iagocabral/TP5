package sistemapastel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

/**
 * Package sistemapastel(view), Tela informativa sobre as bebidas, mostrado a lista de bebidas e a opcao de add na lista ou refresh 
 * @author Iago Cabral e Pedro Henrique
 */
public class CRUDBebida implements ActionListener, ListSelectionListener {
    
    private JFrame janela;
    private JLabel titulo;
    private JButton cadastroBebida;
    private JButton refreshBebida;
    private static ControleDados dados;
    private JList<String> listaBebidasCadastrados;
    private String[] listaNomes = new String[50];
     
    /**
     * criando a lista de bebidas e criando tambem um JList
     * criando os elementos da interface CRUD bebidas e as mostrando
     * adicionando ActionListened para os botoes
     * @param d controle de dados
     * @param op opçao 1
     */
    public void mostrarDados(ControleDados d, int op){
        dados = d;       
        switch (op) {
        case 1:
            listaNomes = new ControleBebida(dados).getNomeBebida(); 
        	
            listaBebidasCadastrados = new JList<String>(listaNomes);
            janela = new JFrame("Bebidas");
            titulo = new JLabel("Bebidas Cadastrados");
            cadastroBebida = new JButton("Cadastrar");
            refreshBebida = new JButton("Refresh");

            titulo.setFont(new Font("Arial", Font.BOLD, 20));
            titulo.setBounds(90, 10, 250, 30);
            listaBebidasCadastrados.setBounds(20, 50, 350, 120);
            listaBebidasCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
            listaBebidasCadastrados.setVisibleRowCount(10);

            cadastroBebida.setBounds(70, 177, 100, 30);
            refreshBebida.setBounds(200, 177, 100, 30);

            janela.setLayout(null);

            janela.add(titulo);
            janela.add(listaBebidasCadastrados);
            janela.add(cadastroBebida);
            janela.add(refreshBebida);

            janela.setSize(400, 250);
            janela.setVisible(true);

            cadastroBebida.addActionListener(this);
            refreshBebida.addActionListener(this);
            listaBebidasCadastrados.addListSelectionListener(this);
            break; 

        default:
            JOptionPane.showMessageDialog(null,"Opção não encontrada!", null, 
                    JOptionPane.ERROR_MESSAGE);
        }

    }
    
    /**
	 * Função que captura os eventos relacionados aos botões da interface
	 * direciona e cria uma interface, de acordo com a opção selecionada
	 */
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        
        
        if(src == cadastroBebida)
        	new TelaDetalheBebida().inserirEditar(1, dados, this, 0);



        
        if(src == refreshBebida) {
        	listaBebidasCadastrados.setListData(new ControleBebida(dados).getNomeBebida());            
        	listaBebidasCadastrados.updateUI();
        }
    }
    /**
     * Função para editar e ajustar a Jlist
     */
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();

        if(e.getValueIsAdjusting() && src == listaBebidasCadastrados) {
           new TelaDetalheBebida().inserirEditar(3, dados, this, 
            		listaBebidasCadastrados.getSelectedIndex());
        
    }
    }   
    
}