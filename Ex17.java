//Verificar se tr�s valores quaisquer (A, B, C) que ser�o digitados formam ou n�o um tri�ngulo ret�ngulo. Lembre-se que o quadrado da hipotenusa � igual a soma dos quadrados dos catetos.


package entrada_processamento_saida;
import java.util.*;
public class Ex17 {

	public static void main(String[] args) {

		double a=0,b=0,c=0, catetos=0, Qdhipotenusa=0;
		Scanner ler = new Scanner(System.in);
		
		
		 System.out.println("DIGITE O LADO A: ");
		 a = ler.nextDouble();
		 System.out.println("DIGITE O LADO B: ");
		 b = ler.nextDouble();
		 System.out.println("DIGITE O LADO C: ");
		 c = ler.nextDouble();
			
			
		Qdhipotenusa = Math.pow(a, 2);	
		catetos = 	Math.pow(b, 2) + Math.pow(c, 2);
		
		if(Qdhipotenusa == catetos){
			
			System.out.println("Este eh um Triangulo Retangulo");
			
		}else {
			System.out.println("Nao eh um Triangulo Retangulo");
			
		}
			
		
		}

	}