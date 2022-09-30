//Exibir o seguinte seletor de op��es e em fun��o de uma escolha, solicitar os dados necess�rios para o c�lculo da respectiva �rea. Enviar mensagem de erro se o usu�rio escolher uma op��o inexistente.

//Encerrar o programa somente quando selecionada a op��o de finaliza��o. (Fazer esse exerc�cio utilizando If..Else e/ou Case)

//1 � Tri�ngulo
//2 � Quadrado
//3 � Ret�ngulo
//4 � C�rculo
//5 � Fim de processo



package entrada_processamento_saida;
import java.util.*;
public class Ex23 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int opc= 0;
		double a=0,b=0, area=0, raio=0;	
		
		do {
			
			
			System.out.println("\nO que quer fazer\n");
			System.out.println("\n1 Triangulo\n");
			System.out.println("2 Quadrado\n");
			System.out.println("3 Retangulo\n");
			System.out.println("4 Circulo\n");
			System.out.println("5 Fim de processo\n");
			opc = ler.nextInt();
			
			switch(opc) {
			
			
			case 1:
					
				System.out.printf("Digite o valor da base do Triangulo: ");
				a = ler.nextInt();
				
				System.out.printf("Digite o valor da altura do Triangulo: ");
				b = ler.nextInt();
				
				area = a*b/2;
				
				System.out.printf("A �rea do Triangulo e: %.2f ", area);
				
			break;
			
			case 2:
				
				System.out.printf("Digite o valor de um lado do quadrado: ");
				a = ler.nextInt();
				
				area = Math.pow(a, 2);
				
		
				System.out.printf("A area do Quadrado a: %.2f ", area);
				
			break;
			
			case 3:
				
				System.out.printf("Digite o valor da base do retangulo: ");
				a = ler.nextInt();
				
				System.out.printf("Digite o valor da altura do retangulo: ");
				b = ler.nextInt();
				
				area = a * b;
				
				System.out.printf("A area do Retangulo e: %.2f ", area);
				
				break;
			
			case 4:
				
				
				System.out.printf("Digite o valor do raio: ");
				a = ler.nextInt();
				
				raio =a;
				
				area = Math.pow(raio, 2) * Math.PI;

				System.out.printf("A area de um Circulo e: %.2f ", area);
				
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