//36. Entrar via teclado com um valor (X) qualquer. Travar a digita��o, no sentido de aceitar somente valores positivos. 
//Solicitar o intervalo que o programa que dever� calcular a tabuada do valor digitado, sendo que o segundo valor (B), dever� ser maior que o primeiro (A), 
//caso contr�rio, digitar novamente somente o segundo. Ap�s a valida��o dos dados, exibir a tabuada do valor digitado, no intervalo decrescente, 
//ou seja, a tabuada de X no intervalo de B para A.


package entrada_processamento_saida;
import java.util.Scanner;
public class Ex37 {

	
public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	       
        int num, num2, t, i;
       
        System.out.printf("Digite um n�mero positivo: ");
        num = ler.nextInt();
        
        System.out.printf("Digite o n�mero que deseja come�ar a contagem ");
        num2 = ler.nextInt();
        
        while(num <= 0) {
            System.out.printf("Erro, n�mero negativo! Digite um n�mero positivo: ");
            num = ler.nextInt();
       
        }
        
      
       
	        for (i=num2; i>=1; i--) {
	           
	            t = num * i;
	            System.out.printf("\n%d X %d = %d", num, i, t);
	        }

        
		
		
		
	}
}
