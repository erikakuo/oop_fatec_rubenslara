//Criar um programa para analisar a velocidade de um autom�vel. Solicitar via teclado os valores da acelera��o (a em m/s2), velocidade inicial (v0 em m/s) e o tempo de percurso (t em s). //Calcular e exibir a velocidade final do autom�vel em km/h. E exibir mensagem de acordo com a tabela

package entrada_processamento_saida;
import java.util.*;
public class Ex19 {
public static void main(String[] args) {
		
		double a, v, t, V;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Entre com a aceleracao em m/s");
		a = ler.nextDouble();
		
		System.out.println("Entre com a velocidade V0 em m/s");
		v = ler.nextDouble();
		
		System.out.println("Entre com o tempo de percurso s");
		t = ler.nextDouble();
		
		V = v+(a*t);
		
		if(V <= 40){
			System.out.println("Veiculo muito lento");
		}else if(40 < V && V <=60 ) {
			System.out.println("Velocidade Permitida");
		}else if(60 < V && V <= 80) {
			System.out.println("Velocidade de cruzeiro");
		}else if(80 < V && V <= 120) {
			System.out.println("Veiculo r�pido");
		}else if(V>120) {
			System.out.println("Veiculo muito r�pido");
		}

	}

}