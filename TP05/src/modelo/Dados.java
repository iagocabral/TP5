package modelo;
import java.util.*;


/** 
 *  Classe dados, relacionando as Classes Modelo e criando Arrays para Cada tipo de classe relevante
 * @author Iago Cabral e Pedro Henrique
 * versão 1.0(Outubro 2021)
 */

public class Dados { 

	/** 
	 * Criação dos Arrays das classes relevantes 
	 */
    private Pastel[] pasteis = new Pastel[50];
    private int qntPastel = 0;
    private Bebida[] bebidas = new Bebida[50];
    private int qntBebida = 0;
    private Funcionario[] funcionarios = new Funcionario[50];
    private int qntFuncionario = 0;
    private Pedido[] pedidos = new Pedido[50];
    private int qntPedido = 0;
    private Venda[] vendas = new Venda[50];
    private int qntVenda = 0;
    
    /** 
     * procedimento dataBase
     * criando um banco de dados para os arrays.
     */
	public void fillWithSomeData() {
		
		pasteis[0] = new Pastel("pastel de carne", 6, "a4","carne", "Messi"); 
		pasteis[1] = new Pastel("pastel de queijo", 4, "a3","queijo", "Messi");
		pasteis[2] = new Pastel("pastel de frango", 5, "P","frango", "Barack Obama");
		pasteis[3] = new Pastel("pastel de gato", 2, "GG","recheio secreto", "Paulão rataria");
		pasteis[4] = new Pastel("pastel de camarão", 8, "M","recheio de camarão", "Paulão rataria");
		qntPastel = 5;
		
		bebidas [0] = new Bebida("caldo de cana", 5, "500 ml","suco natural", "feito da cana de açucar");		   
		bebidas [1] = new Bebida("coca cola", 4, "350 ml","refrigerante", "refrigerante a base coca");		   
		bebidas [2] = new Bebida("guarana", 4, "310 ml","refrigerante", "refrigerante a base de guarana");		   
		bebidas [3] = new Bebida("dolly guarana", 3, "350 ml","refrigerante", "refrigerante a base de guarana");
		bebidas [4] = new Bebida("suco de uva", 4, "450ml","suco de caixinha", "suco de caixa sabor uva");
		qntBebida = 5;
		
		pedidos[0] = new Pedido("Cristiano Araujo","Pastel de Carne", "Coca Cola Zero", 17, "15:30", 6 , "Cristiano Ronald", 2,4);
		pedidos[1] = new Pedido("Pedro", "Pastel de vento", "suco de uva", 10, "16:23 horas", 4,  "Zé Goiaba", 2, 1);
		pedidos[2] = new Pedido("Rafael", "Pastel de carne", "dolly guarana", 9, "16:15 horas", 5, "Zé Goiaba", 1, 1);  
		pedidos[3] = new Pedido("Zé", "Pastel de camarão", "coca cola zero", 20, "18:30 horas", 6,  "Neymar", 2, 1);
		pedidos[4] = new Pedido("Alice", "Pastel de calabresa", "caldo de cana", 19,  "14:30 horas", 7, "Marta", 1, 3);
	    qntPedido = 5;
	    
	    funcionarios[0] = new Funcionario("Messi", 3405851, "079.817.136-11", "17/06/1998", "Asa norte quadra 305", 981526631, "07h as 12h", "Cozinheiro", 1500);
	    
	    funcionarios[1] = new Funcionario("Barack Obama", 2405851, "079.817.146-11", "17/06/1998", "Vicente pires rua 3", 981556632, "12h as 18h", "Cozinheiro", 1350);

	    funcionarios[2] = new Funcionario("Paulão Rataria", 3619815, "354.933.281-57", "17/06/1998", "Aguas Claras avenida castanheiras", 999556732, "12h as 18h", "Cozinheiro", 45000);
	    
	    funcionarios[3] = new Funcionario("Marta", 2527534, "352.573.981-57", "17/06/1998", "Lago norte", 999556732, "12h as 18h", "Garçom", 1500);
	    
	    funcionarios[4] = new Funcionario("Neymar", 1267891, "321.517.426-17", "17/06/1998", "Taguatinga", 993586712, "07h as 12h", "Garçom", 1200);
	    qntFuncionario = 5;
	    
	    vendas[0] = new Venda(1, "Joao pedro" ,  17);
	  
	    vendas[1] = new Venda(2, "Fernando" ,  6);
	   
	    vendas[2] = new Venda(3, "Lucas" ,  13);
	  
	    vendas[3] = new Venda(4, "Pedro" ,  10);
	  
	    vendas[4] = new Venda(5, "Rafael" ,  9);
	    qntVenda = 5;
	    
	}
	
	//PASTEL
	/**
	 * 
	 * @return pasteis
	 */
    public Pastel[] getPasteis() {
        return pasteis;
    }
    /**
     * 
     * @param pasteis array pasteis
     */
    public void setPasteis(Pastel[] pasteis) {
        this.pasteis = pasteis;
    }
    /**
     * Função criada para Inserir ou editar um pastel na lista 
     * @param a dado do tipo Pastel que deseja inserir ou editar
     * @param pos	posição na lista
     */
    public void inserirEditarPastel(Pastel a, int pos) {
        this.pasteis[pos] = a; 
        if(pos == qntPastel) qntPastel++; 
    }
    
    public Venda[] getVenda() {
        return vendas;
    }
    
    //BEBIDA
    public Bebida[] getBebidas() {
        return bebidas;
    }
    public void setBebidas(Bebida[] bebidas) {
        this.bebidas = bebidas;
    }
    /**
     * Função criada para Inserir ou editar uma bebida na lista 
     * @param a dado do tipo Bebida que deseja inserir ou editar
     * @param pos posição na lista
     */
    public void inserirEditarBebida(Bebida a, int pos) {
        this.bebidas[pos] = a; 
        if(pos == qntBebida) qntBebida++; 
    }
    
    //FUNCIONARIOS
    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }
    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }
    /**
     * Função criada para Inserir ou editar um funcionario na lista 
     * @param a dado do tipo Funcionario que deseja inserir ou editar
     * @param pos posição na lista
     */
    public void inserirEditarFuncionario(Funcionario a, int pos) {
        this.funcionarios[pos] = a; 
        if(pos == qntFuncionario) qntFuncionario++; 
    }
    
    //PEDIDOS
    public Pedido[] getPedidos() {
        return pedidos;
    }
    public void setPedidos(Pedido[] pedidos) {
        this.pedidos = pedidos;
    }
    
    /**
     * Função criada para Inserir ou editar um pedido na lista 
     * @param a dado do tipo Pedido que deseja inserir ou editar
     * @param pos posição na lista
     */
    public void inserirEditarPedido(Pedido a, int pos) {
        this.pedidos[pos] = a; 
        if(pos == qntPedido) qntPedido++; 
    }
    public Venda[] getVendas() {
        return vendas;
    }
    
    //VENDAS
    public void setVendas(Venda[] vendas) {
        this.vendas = vendas;
    }
    
    /**
     * Função criada para Inserir ou editar uma venda na lista 
     * @param a dado do tipo Venda que deseja inserir ou editar
     * @param pos posição na lista
     */
    public void inserirEditarVenda(Venda a, int pos) {
        this.vendas[pos] = a; 
        if(pos == qntVenda) qntVenda++; 
    }
    
    //PASTEL
    public int getQntPastel() {
        return qntPastel;
    }
    public void setQntPastel(int qntPastel) {
        this.qntPastel = qntPastel;
    }
    
    //BEBIDA
    public int getQntBebida() {
        return qntBebida;
    }
    public void setQntBebida(int qntBebida) {
        this.qntBebida = qntBebida;
    }
    
    //FUNCIONARIOS
    public int getQntFuncionario() {
        return qntFuncionario;
    }
    public void setQntFuncionario(int qntFuncionario) {
        this.qntFuncionario = qntFuncionario;
    }
    
    //PEDIDOS
    public int getQntPedido() {
        return qntPedido;
    }
    public void setQntPedido(int qntPedido) {
        this.qntPedido = qntPedido;
    }
    
    //VENDAS
    public int getQntVenda() {
        return qntVenda;
    }
    public void setQntVenda(int qntVenda) {
        this.qntVenda = qntVenda;
    }
}