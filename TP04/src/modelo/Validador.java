package modelo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;

/**
 * Verificar se os dados fornecidos estao no formato esperado
 * @author Iago Cabral e Pedro Henrique
 *versão 1.0 (Outubro 2021)
 */
 
public class Validador {
	/**
	 * Verificar se o CPF fornecido é valido, utilizando o metodo de verificação original utilizado no Brasil
	 * @param cpfFuncionario uma String que contem o cpf a ser verificado
	 * @return verdadeiro ou falso, indicando se o cpf é valido
	 */
	public static boolean validaCPF(String cpfFuncionario) {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (cpfFuncionario.equals("00000000000") ||
            cpfFuncionario.equals("11111111111") ||
            cpfFuncionario.equals("22222222222") || cpfFuncionario.equals("33333333333") ||
            cpfFuncionario.equals("44444444444") || cpfFuncionario.equals("55555555555") ||
            cpfFuncionario.equals("66666666666") || cpfFuncionario.equals("77777777777") ||
            cpfFuncionario.equals("88888888888") || cpfFuncionario.equals("99999999999") ||
            (cpfFuncionario.length() != 11))
            return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;

        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
        // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {
        // converte o i-esimo caractere do CPF em um numero:
        // por exemplo, transforma o caractere '0' no inteiro 0
        // (48 eh a posicao de '0' na tabela ASCII)
            num = (int)(cpfFuncionario.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico

        // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
            num = (int)(cpfFuncionario.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);

        // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == cpfFuncionario.charAt(9)) && (dig11 == cpfFuncionario.charAt(10)))
                 return(true);
            else return(false);
                } catch (InputMismatchException erro) {
                return(false);
            }
        }
	
	/**
	 * Verificar se a a data de Nascimento do funcionario é valido, o metodo utilizado foi:
	 * converter a string do tipo data em um dado tipo Data;
	 * utilizando as funções do import SimpleDateFormat verifico se a data fornecida foi verdadeira
	 * @param dataNascimento uma String que contem a data a a ser verificada
	 * @return verdadeiro ou falso, indicando se a data é valida 
	 */
	public boolean validaData(String dataNascimento) {
        try {
            //SimpleDateFormat é usada para trabalhar com formatação de datas
            //neste caso meu formatador irá trabalhar com o formato "dd/MM/yyyy"
            //dd = dia, MM = mes, yyyy = ano
            SimpleDateFormat formatar_data = new SimpleDateFormat("dd/MM/yyyy");
            //a mágica desse método acontece aqui, pois o setLenient() é usado para setar
            //sua escolha sobre datas estranhas, quando eu seto para "false" estou dizendo
            //que não aceito datas falsas como 31/02/2016
            formatar_data.setLenient(false);
            //aqui eu tento converter a String em um objeto do tipo date, se funcionar
            //sua data é valida
            formatar_data.parse(dataNascimento);
            //se nada deu errado retorna true (verdadeiro)
            return true;
        } catch (ParseException ex) {
            //se algum passo dentro do "try" der errado quer dizer que sua data é falsa, então,
            //retorna falso
            return false;
        }
    }
	
	/**
	 * Verificar se a identidade(ID) é valida, ID não possui nenhum modo de validação, apenas deve conter 7 digitos
	 * @param numeroID um inteiro contendo a ID do Funcionario
	 * @return verdadeiro ou falso, indicando se a identidade é valida
	 */
	public boolean validaID(int numeroID) {
		int cont =0;
		//logica para saber a quantidade de digitos que o numeroID possui, salvando em um contador
		while(numeroID !=0){
		numeroID = numeroID/10;
		cont++;
		}
		if(cont != 7)
		return(false);
		
		return(true);
	}
}	

