//A partir de tr�s valores que ser�o digitados, verificar se formam ou n�o um tri�ngulo. Em caso positivo, exibir sua classifica��o: �Is�sceles, escaleno ou eq�il�tero�. Um tri�ngulo escaleno possui todos os lados diferentes, o is�sceles, dois lados iguais e o eq�il�tero, todos os lados iguais. Para existir tri�ngulo � necess�rio que a soma de dois lados quaisquer seja maior que o outro, isto, para os tr�s lados.


package entrada_processamento_saida;
import java.util.*;
public class Ex16 {

public static void main(String[] args) {
		
		int a,b,c;
		char condicao1, condicao2, condicao3, condicaofinal=' ';
		
		Scanner ler = new Scanner(System.in);
		
		
		 System.out.println("DIGITE O LADO A: ");
		 a = ler.nextInt();
		 System.out.println("DIGITE O LADO B: ");
		 b = ler.nextInt();
		 System.out.println("DIGITE O LADO C: ");
		 c = ler.nextInt();

		    if (b - c  < a && a < b + c)
		    {
		        condicao1 = 'v';
		    }
		    else
		    {
		        condicao1 = 'n';
		    }
		    if (a - c < b && b < a + c)
		    {
		        condicao2 = 'v';
		    }
		    else
		    {
		        condicao2 = 'n';
		    }
		    if (a - b < c && c < a + b)
		    {
		        condicao3 = 'v';
		    }
		    else
		    {
		        condicao3 = 'n';
		    }

		    if(condicao1 == 'v' && condicao2 =='v' && condicao3 == 'v')
		    {
		    	System.out.println("\n\n");
		    	System.out.println("Este eh um Triangulo!");
		        condicaofinal = 'v';

		    }
		    if(condicao1 == 'n' || condicao2 == 'n' || condicao3 == 'n')
		    {
		    	System.out.println("\n\n");
		    	System.out.println("Verifique os numeros digitados, eles nao representam valores que formam um triangulo");
		    	System.out.println("\n\n");
		    }


		        if(condicaofinal == 'v')
		        {
		                if (a == b || c == b || a == c)
		                {
		                	System.out.println("\n\n");
		                	System.out.println("\nDo tipo: Triangulo Isoceles");
		                	System.out.println("\n\n");
		                }

		                if (a == b && c == b && a == c)
		                {
		                	System.out.println("\n\n");
		                	System.out.println("\nDo tipo: Triangulo Equilatero");
		                	System.out.println("\n\n");
		                }

		                if (a != b && c != b && a != c)
		                {
		                	System.out.println("\n\n");
		                	System.out.println("\nDo tipo: Triangulo Escaleno");
		                	System.out.println("\n\n");
		                }
		
		
		        }


	}

}