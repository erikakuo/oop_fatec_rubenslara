//34. Exibir a tabuada do n�mero cinco no intervalo de um a dez.

package entrada_processamento_saida;
import java.util.Scanner;
public class Ex35 {
public static void main(String[] args) {
		
		int i=1,t, num=5;
		
		while(i <= 10) {
			
			t = num * i;
			System.out.printf("\n %d X %d = %d", num, i, t);
		
			i++;
		}

	}

}
