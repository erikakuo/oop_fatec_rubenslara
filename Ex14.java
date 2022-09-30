//Entrar via teclado com três valores distintos. Exibir o maior deles.

package entrada_processamento_saida;
import java.util.*;
public class Ex14 {

public static void main(String[] args) {
	
	Scanner ler = new Scanner (System.in);
	
	int a,b,c, i=0;
	
	System.out.printf("Digite 3 numeros");
	
	System.out.printf("\nprimeiro numero: ");
	a = ler.nextInt();
	
	System.out.printf("\nsegunto numero: ");
	b = ler.nextInt();
	
	System.out.printf("\nterceiro numero: ");
	c = ler.nextInt();
	
	if(a>b && a >c) {
		System.out.printf("\nO Maior o numero digitado (a): %d ", a);
	}else if(b>a && b>c){
		
		System.out.printf("\nO Maior o numero digitado (b): %d ", b);
	}else {
		System.out.printf("\nO Maior o numero digitado (c): %d ", c);
	}
	
	
	

}

}