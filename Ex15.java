//Entrar com o peso e a altura de uma determinada pessoa. Ap�s a digita��o, exibir se esta pessoa est� ou n�o com seu peso ideal. F�rmula: peso/altura�.

package entrada_processamento_saida;
import java.util.*;
public class Ex15 {
	
		public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);	
		double peso, altura, pesoideal;
		
		System.out.printf("Digite o seu peso: ");
		peso = ler.nextDouble();

		System.out.printf("Digite o sua altura: ");
		altura = ler.nextDouble();
		
		pesoideal = peso/(Math.pow(altura, 2));
		
		if(peso > pesoideal) {
			
			System.out.printf("Voc� est� acima do peso ");	
		}else {
			
			System.out.printf("Voc� est� com do peso ");	
		}
		
		}

	}
