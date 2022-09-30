//Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.
package entrada_processamento_saida;
import java.util.*;
public class Ex02 {
public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, area;
		
		System.out.printf("Digite o valor da base do retangulo: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o valor da altura do retangulo: ");
		b = ler.nextInt();
		
		area = a * b;
		
		System.out.printf("A área do Retangulo é: %d ", area);

	}

}