//Entrar via teclado, com dois valores distintos. Exibir o menor deles.
package entrada_processamento_saida;
import java.util.*;
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {


		Scanner ler = new Scanner(System.in);
		
		int a, b, NumM;
		
		//Entrar via teclado, com dois valores distintos. Exibir o maior deles.
		System.out.printf("Digite um Numero: ");
		a = ler.nextInt();
		
		System.out.printf("Digite outro Numero: ");
		b = ler.nextInt();
		
		
		if(a > b) {
			
		}else if(b > a) {
			
			
		}else {
			System.out.printf("Num A e Num B Sao Iguais!!!");
		}
		
		System.out.printf("\n\n");
		
		if(a < b) {
			System.out.printf("\n\n");
			System.out.printf("Esse eh o Menor Numero: %d", a);
			System.out.printf("\n\n");
		}else if(b < a) {
			System.out.printf("Esse eh o Menor Numero: %d", b);
		}
		
		

	}


}
