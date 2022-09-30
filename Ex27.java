//Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo, imprimindo o resultado.

package entrada_processamento_saida;
import java.util.Scanner;
public class Ex27 {

public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um numero positivo ou negativo");
		num = ler.nextInt();
		
		if(num > 0) {
			
			System.out.printf("O Dobro: %d", num*2);
		}else if(num < 0) {
			System.out.printf("O triplo: %d", num*3);
		}
		

	}

}