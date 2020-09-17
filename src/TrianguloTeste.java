import org.junit.Assert;
import org.junit.Test;


/**
 * Classe para desenvolvimento dos metodos dos Casos de teste
 * @author regisnumata
 *
 */
public class TrianguloTeste {
	
	
	/**
	 * Nomenclatura dos métodos devem seguir Id do Casos de Teste
	 */
	
	Triangulo triangulo = new Triangulo();
	
	@Test
	public void tc_01() {		
		String retorno = triangulo.verificarTriangulo(5, 5, 5);
		Assert.assertEquals("Triangulo Equilatero", retorno);
	}
	
	@Test
	public void tc_02() {
		String retorno = triangulo.verificarTriangulo(5, 5, 3);
		Assert.assertEquals("Triangulo Isosceles", retorno);
	}
	
	@Test
	public void tc_03() {
		String retorno = triangulo.verificarTriangulo(5, 7, 8);
		Assert.assertEquals("Triangulo Escaleno", retorno);
	}
	
	@Test
	public void tc_04() {
		String retorno = triangulo.verificarTriangulo(5, 3, 5);
		Assert.assertEquals("Triangulo Isosceles", retorno);
	}
	
	@Test
	public void tc_05() {
		String retorno = triangulo.verificarTriangulo(3, 5, 5);
		Assert.assertEquals("Triangulo Isosceles", retorno);
	}
	
	@Test
	public void tc_06() {
		String retorno = triangulo.verificarTriangulo(0, 5, 5);
		Assert.assertEquals("Não é um triangulo", retorno);
	}
	
	@Test
	public void tc_07() {
		String retorno = triangulo.verificarTriangulo(5, 5, -5);
		Assert.assertEquals("Não é um triangulo", retorno);
	}
	
	@Test
	public void tc_08() {
		String retorno = triangulo.verificarTriangulo(5, 5, 10);
		Assert.assertEquals("Não é um triangulo", retorno);
	}
	
	@Test
	public void tc_09() {
		String retorno = triangulo.verificarTriangulo(5, 10, 5);
		Assert.assertEquals("Não é um triangulo", retorno);
	}
	
	@Test
	public void tc_10() {
		String retorno = triangulo.verificarTriangulo(10, 5, 5);
		Assert.assertEquals("Não é um triangulo", retorno);
	}
	
	@Test
	public void tc_11() {
		String retorno = triangulo.verificarTriangulo(1, 2, 4);
		Assert.assertEquals("Não é um triangulo", retorno);
	}
	
	@Test
	public void tc_12() {
		String retorno = triangulo.verificarTriangulo(1, 4, 2);
		Assert.assertEquals("Não é um triangulo", retorno);
	}
	
	@Test
	public void tc_13() {
		String retorno = triangulo.verificarTriangulo(4, 2, 1);
		Assert.assertEquals("Não é um triangulo", retorno);
	}
	
} //fim classe
