
/**
 * Classe que representa um triangulo
 * @author regisnumata
 *
 */
public class Triangulo {
	
	
	/**
	 * Metodo que recebe 3 parametros para definir tipo de um triangulo se Equilatero||Isosceles||Escaleno||Nao Triangulo
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 * @return String com a classificação do triangulo
	 */
	public String verificarTriangulo(int lado1, int lado2, int lado3) {

		if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
			if (lado1 == lado2 && lado1 == lado3) {
				return "Triangulo Equilatero";
			} else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
				return "Triangulo Isosceles";
			} else
				return "Triangulo Escaleno";
		} else {
			return "Não é um triangulo";
		}
	}
	
}
