//32. Entrar com dois valores via teclado, onde o segundo dever� ser maior que o primeiro. Caso contr�rio solicitar novamente apenas o segundo valor.


package entrada_processamento_saida;
import java.util.*;

	
public class Ex33 {

	
		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			
			int num, num2;
			
			System.out.println("Digite um numero: ");
			num = ler.nextInt();
			
			System.out.println("Digite um segundo numero maior que o primeiro: ");
			num2 = ler.nextInt();
			
			if(num < num2) {
				
				System.out.printf("Voc� Digitou corretamente num: %d num2: %d ",num, num2);
				
			}else{
				
				System.out.println("Digite um segundo numero maior que o primeiro ");
				num2 = ler.nextInt();
				System.out.printf("Voc� digitou: num: %d, num2 %d", num, num2);
			}
			
		
			
			

		}

	}