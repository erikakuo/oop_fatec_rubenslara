//A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
package entrada_processamento_saida;
import java.util.*;
public class Ex04 {

		public static void main(String[] args) {
			
			
			Scanner ler = new Scanner(System.in);
			
			double a, b, area;
			
			System.out.printf("Digite o valor da base do Triangulo: ");
			a = ler.nextInt();
			
			System.out.printf("Digite o valor da altura do Triangulo: ");
			b = ler.nextInt();
			
			area = a*b/2;
			
			System.out.printf("A área do Quadrado é: %.2f ", area);

		}

	}
