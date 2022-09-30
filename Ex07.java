//Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. Calcular e exibir o valor correspondente em Reais (R$).

package entrada_processamento_saida;
import java.util.*;
public class Ex07 {

public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double dolar=5.065, real=0;
		
		System.out.printf("Digite o valor em Reais que deseja Converter: ");
		real = ler.nextInt();
		
		
		dolar = real*dolar;
		
		System.out.printf("Valor em Dolar correspondente: %.2f ", dolar);

	}

}
