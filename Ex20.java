//Uma escola com cursos em regime semestral, realiza duas avalia��es durante o semestre e calcula a m�dia do aluno, da seguinte maneira:

//MEDIA = (P1 + 2.P2) / 3

//Fazer um programa para entrar via teclado com os valores das notas (P1 e P2) e calcular a m�dia. Exibir a situa��o final do aluno (�Aprovado ou Reprovado�), sabendo que a m�dia de aprova��o � igual a cinco.


package entrada_processamento_saida;
import java.util.*;
public class Ex20 {
public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int P1=0, P2=0, MEDIA=0;
		
		System.out.println("Nota da P1");
		P1 = ler.nextInt();
		
		System.out.println("Nota da P2");
		P2 = ler.nextInt();
		
		MEDIA = (P1 + 2*P2) / 3;
		
		if(MEDIA >= 5) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}

	}

}