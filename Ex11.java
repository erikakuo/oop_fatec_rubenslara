//Entrar com dois valores quaisquer. 
//Exibir o maior deles, se existir, caso contr�rio, enviar mensagem avisando que 
//os n�meros s�o id�nticos.

package entrada_processamento_saida;
import java.util.*;
public class Ex11 {
	
	public static void main(String[] args) {
		
		int num, num2;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um primeiro numero: ");
		num = ler.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = ler.nextInt();
		
		if(num>num2){
			
			System.out.printf("Maior Numero Digitado: %d", num);
		}else if(num2 > num) {
			System.out.printf("Maior Numero Digitado: %d", num2);
		}else {
			System.out.printf("os Numeros Digitados s�o iguais");
		}
		
	}

}