//Faça um algoritmo que leia o nome, o sexo e o estado civil de uma pessoa. Caso sexo seja “F” e estado civil seja “CASADA”, solicitar o tempo de casada (anos).


package entrada_processamento_saida;
import java.util.*;
public class Ex25 {

public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		char sexo;
		String estado;
		
		System.out.println("Digite o nome");
		System.out.printf("%s",ler.next()+"\n");
		
		System.out.println("\nDigite o estado civil");
		estado = ler.next();
		
		System.out.println("\nDigite o sexo M ou F");
		sexo = ler.next().charAt(0);
		
		if(sexo == 'F' && estado.equals("Casada")) {
			System.out.println("\nDigite o tempo de casado");
			System.out.printf("%s",ler.next()+"\n");
			
		}else {
			System.out.println("FIM");
		}
		

	}

}