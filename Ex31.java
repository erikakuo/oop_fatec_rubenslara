//Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o pre�o normal de etiqueta e a escolha da condi��o de pagamento. Utilize os c�digos da tabela a seguir para ler qual a condi��o de pagamento escolhida e efetuar o c�lculo adequado e exibir o valor a ser pago no final.

//C�digo Condi��o de pagamento
//1 	� vista em dinheiro ou cheque, recebe 10% de desconto
//2 	� vista no cart�o de cr�dito, recebe 15% de desconto
//3 	Em duas vezes, pre�o normal de etiqueta sem juros
//4 	Em quatro vezes, pre�o normal de etiqueta mais juros de 10%


package entrada_processamento_saida;
import java.util.*;
public class Ex31 {
public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);	
		double preco, Valpagar=0;
		int opc;
		
		System.out.println("Digite o preco do Produto");
		preco = ler.nextDouble();

		System.out.println("\n\n");
		System.out.println("1 Dinheiro ou Cheque");
		System.out.println("2 A vista no credito");
		System.out.println("3 Credito em 2X");
		System.out.println("4 Credito em 4X");
		System.out.println("Sair");
		
		System.out.println("\nQual a forma de pagamento ?");
		opc = ler.nextInt();
		
		switch(opc)
		{
		
		case 1:
			Valpagar = preco-(preco*0.1);
		break;
			
		case 2:
			Valpagar = preco-(preco*0.15);
		break;
		
		case 3:
			Valpagar = preco;
		break;
		
		case 4:
			Valpagar = preco+(preco*0.1);
		break;
		
		case 5:
			System.out.println("FIM");
		break;
		
		default:
			System.out.println("Valor Inv�lido");
			break;
		
		}
		
		System.out.printf("Preco Final: %.2f", Valpagar);
		
		
		
		
		

	}

}