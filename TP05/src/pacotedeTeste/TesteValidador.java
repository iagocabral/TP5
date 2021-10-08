package pacotedeTeste;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import modelo.*;

/**
 *  Package pacotedeTeste, classe Teste validador, criada para testar os validadores
 * @author Iago Cabral e Pedro Henrique
 *
 */
class TesteValidador {
	Validador v = new Validador();
	/**
	 * Teste para validar o cpf, teste de acordo com as normas brasileira de verificação de cpf
	 */
	@Test
	void testIsCPF() {
		assertTrue(v.validaCPF("95765883168"));
		assertFalse(v.validaCPF("1234567890"));
		assertFalse(v.validaCPF("12345"));
	}
	/**
	 * Teste para validar se a data é valida
	 */
	@Test
	void testIsData() {
		assertTrue(v.validaData("8/11/2001"));
		assertFalse(v.validaData("32/06/2005"));
		assertFalse(v.validaData("17062001"));
		assertFalse(v.validaData("12/13/2005"));
	}
	
	/**
	 * Teste para validar se a identidade possui 7 digitos 
	 */
	@Test
	void tesIsId() { 
		assertTrue(v.validaID(1234567)); //Id não possui validação, estará errado apenas se a qnt de digitos for difente de 7
		assertFalse(v.validaID(123456));
		assertFalse(v.validaID(12345678));
	}
}