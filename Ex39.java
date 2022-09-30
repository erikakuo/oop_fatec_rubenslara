//38. Exibir a soma dos números inteiros positivos do intervalo de um a cem.


package entrada_processamento_saida;
import java.util.Scanner;
public class Ex39 {

	public static void main(String[] args) {
		
		int i=1,num=0;
		
		for(i=1;i<=100;i++) {
				num +=i;		
			}
			System.out.printf("Valor inteiro: %d", num);
			
		}
		
	
}
