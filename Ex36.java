//35. Entrar via teclado com um valor qualquer. Travar a digita��o, 
//no sentido de aceitar somente valores positivos. Ap�s a digita��o, 
//exibir a tabuada do valor solicitado, no intervalo de um a dez.

package entrada_processamento_saida;
import java.util.Scanner;
public class Ex36 {

public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	       
        int num, t, i;
       
        System.out.printf("Digite um n�mero positivo: ");
        num = ler.nextInt();
       
        while(num <= 0) {
            System.out.printf("Erro, n�mero negativo! Digite um n�mero positivo: ");
            num = ler.nextInt();
        }
       
        for (i=1; i<=10; i++) {
           
            t = num * i;
            System.out.printf("\n%d X %d = %d", num, i, t);
        }

		

	}
	
}
