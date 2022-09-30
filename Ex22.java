//Entrar via teclado com dois valores quaisquer. Ap�s a digita��o, exibir um seletor de op��es (�menu�) com as seguintes op��es: (Fazer esse exerc�cio utilizando If..Else e/ou Case)

//1 � Multiplica��o
//2 � Adi��o
//3 � Divis�o
//4 � Subtra��o
//5 � Fim de processo (sair do programa)

//Solicitar uma op��o por parte do usu�rio, verificar se � ou n�o uma op��o v�lida (letras ou n�meros) e processar a respectiva opera��o. Enviar mensagem de erro se a op��o escolhida n�o existir no seletor.

//Encerrar o programa somente quando o usu�rio escolher a op��o de finaliza��o. Repare que a op��o de n�mero tr�s � de divis�o e o programa dever� enviar mensagem de erro, (somente nesta op��o) se o denominador for zero.



package entrada_processamento_saida;
import java.util.*;
public class Ex22 {
public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int opc= 0, num, num2, resultado;
		
		
		
		do {
			
			System.out.println("Digite um numero");
			num = ler.nextInt();
			System.out.println("Digite outro numero");
			num2 = ler.nextInt();
			
			System.out.println("\nO que quer fazer\n");
			System.out.println("\n1 Multiplicacao\n");
			System.out.println("2 Adicao\n");
			System.out.println("3 Divisao\n");
			System.out.println("4 Subtracao\n");
			System.out.println("5 Fim de processo\n");
			opc = ler.nextInt();
			
			switch(opc) {
			
			
			case 1:
				resultado = num*num2;
				System.out.printf("Mult: %d\n", resultado);
			break;
			
			case 2:
				resultado = num+num2;
				System.out.printf("Soma: %d\n", resultado);
				break;
			
			case 3:
				
				if(num2 != 0) {
					resultado = num/num2;
					System.out.printf("Divisao: %d\n", resultado);
				}else {
					System.out.println("Erro Numero Invalido!\n");
				}
				
				break;
			
			case 4:
				resultado = num-num2;
				System.out.printf("Subtracao: %d\n", resultado);
				break;
				
			case 5:
				System.out.printf("Voce decidiu sair\n");
				break;
				
			default:
				System.out.println("Opcao Invalida!\n");
				break;
			
			}
			
		}while(opc != 5);
		
	}

}