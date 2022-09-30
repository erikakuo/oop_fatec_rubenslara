//Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso seja ímpar, imprimir o resultado desta operação.


package entrada_processamento_saida;
import java.util.*;
public class Ex28 {

public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um numero para saber se e par ou impar");
		num = ler.nextInt();
		
		if(num%2 == 0) {
			
			System.out.printf("Par Soma 5: %d", num+5);
		}else {
			System.out.printf("ImPar Soma 8: %d", num+8);
		}
		
	}

}