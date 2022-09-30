//Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.
package entrada_processamento_saida;
import java.util.*;
public class Ex06 {
	
public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		int TC=0, TF=0, a=5;
		System.out.printf("Digite um valor em Celsius: ");
		TC = ler.nextInt();
		
		TC = TC*9;
		a = 5*32;
		TC = a+TC;
		TF = TC/5;
		
		
		System.out.printf("O valor em Fahrenheit é: %d ", TF);
	}

}