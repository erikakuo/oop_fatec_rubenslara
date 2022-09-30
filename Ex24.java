//Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B é menor que C.

package entrada_processamento_saida;
import java.util.*;
public class Ex24 {

public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a=0,b=0,c=0, soma=0;
		
		
		System.out.printf("Digite um valor A ");
		a = ler.nextInt();
		
		System.out.printf("Digite um valor B ");
		b = ler.nextInt();
		
		System.out.printf("Digite um valor C ");
		c = ler.nextInt();
		
		soma =a+b;
		
		if(soma<c) {
			
			System.out.printf("A Soma: %d",soma);
			
		}else {
			System.out.println("A Somade A e B nao e menor que C");
		}

	}

}