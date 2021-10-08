package sistemapastel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

/**
 * Package sistemapastel(view), Tela informativa sobre os pedidos, mostrado a lista de pedidos e a opcao de add na lista ou refresh 
 * @author Iago Cabral e Pedro Henrique
 */
public class CRUDPedido implements ActionListener, ListSelectionListener {
    
    private JFrame janela;
    private JLabel titulo;
    private JButton cadastroPedido;
    private JButton refreshPedido;
    private static ControleDados dados;
    private JList<String> listaPedidosCadastrado;
    private String[] listaNomes = new String[50];
    
    /**
     * criando a lista de pedidos e criando tambem um JList
     * criando os elementos da interface CRUD pedidos e as mostrando
     * adicionando ActionListened para os botoes
     * @param d dados
     * @param op 1 opcao
     */
    public void mostrarDados(ControleDados d, int op){
        dados = d;
        
        switch (op) {
        case 1:
            listaNomes = new ControlePedido(dados).getNomePedido(); 
        	
            listaPedidosCadastrado = new JList<String>(listaNomes);
            janela = new JFrame("Pedidos");
            titulo = new JLabel("Pedidos Cadastrados");
            cadastroPedido = new JButton("Cadastrar");
            refreshPedido = new JButton("Refresh");

            titulo.setFont(new Font("Arial", Font.BOLD, 20));
            titulo.setBounds(90, 10, 250, 30);
            listaPedidosCadastrado.setBounds(20, 50, 350, 120);
            listaPedidosCadastrado.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
            listaPedidosCadastrado.setVisibleRowCount(10);

            cadastroPedido.setBounds(70, 177, 100, 30);
            refreshPedido.setBounds(200, 177, 100, 30);

            janela.setLayout(null);

            janela.add(titulo);
            janela.add(listaPedidosCadastrado);
            janela.add(cadastroPedido);
            janela.add(refreshPedido);

            janela.setSize(400, 250);
            janela.setVisible(true);

            cadastroPedido.addActionListener(this);
            refreshPedido.addActionListener(this);
            listaPedidosCadastrado.addListSelectionListener(this);
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
        
        
        if(src == cadastroPedido)
        	new TelaDetalhePedido().inserirEditar(1, dados, this, 0);



        
        if(src == refreshPedido) {
        	listaPedidosCadastrado.setListData(new ControlePedido(dados).getNomePedido());            
        	listaPedidosCadastrado.updateUI();
        }
    }
   
    /**
     * Função para editar e ajustar a Jlist
     */
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();

        if(e.getValueIsAdjusting() && src == listaPedidosCadastrado) {
           new TelaDetalhePedido().inserirEditar(3, dados, this, 
        		   listaPedidosCadastrado.getSelectedIndex());
        
    }
    }   
    
}