//Calcular e exibir a m�dia aritm�tica de quatro valores quaisquer que ser�o digitados.
package entrada_processamento_saida;
import java.util.*;
public class Ex05 {	


		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			
			double media=0, a;
			int i=0;
			
			while(i <= 3) {
				
				System.out.printf("digite 4 Valores - Valor: ["+i+"]\n");
				System.out.printf("Digite um valor: ");
				a = ler.nextInt();
				
				media += a;
				i++;
			}
			
			media = media/4;
			
			System.out.printf("A m�dia �: %.2f ", media);
		}
}
		