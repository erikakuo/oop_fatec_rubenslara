//Calcular e exibir a �rea de um ret�ngulo, a partir dos valores da base e altura que ser�o digitados. Se a �rea for maior que 100, exibir a mensagem �Terreno grande�.
package entrada_processamento_saida;
import java.util.*;
public class Ex12 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, area;
		
		System.out.printf("Digite o valor da base do retangulo: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o valor da altura do retangulo: ");
		b = ler.nextInt();
		
		area = a * b;
		
		System.out.printf("A �rea do Retangulo �: %d ", area);
		
		System.out.printf("\n ");
		
		
		if(area > 100) {
			
			System.out.printf("Terreno grande!!!");
		}else{
			
			System.out.printf("Terreno pequeno!!!");
		}

	}

}