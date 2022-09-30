//Faça um algoritmo para receber um número qualquer e informar na tela se é par ou ímpar. Utilize o operador %

package entrada_processamento_saida;
import java.util.*;
public class Ex26 {

public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um numero para saber se e par ou impar");
		num = ler.nextInt();
		
		if(num%2 == 0) {
			
			System.out.println("Esse numero e Par");
		}else {
			System.out.println("Esse numero e impar");
		}
		

	}

}