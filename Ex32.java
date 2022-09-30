//Criar uma rotina de entrada que aceite somente um valor positivo.



package entrada_processamento_saida;
import java.util.*;

public class Ex32 {

public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		do {
			
		System.out.println("Digite um numero positivo: ");
		num = ler.nextInt();
			
		}while(num <= 0);
		
		System.out.printf("Esse numero esta correto, voce digitou: %d", num);
		

	}

}
