/**
* Laboratório de Programação 2 - Lab 1
* 
* @author André Luís de Andrade Santana- 118210116
*/

import java.util.Scanner;

public class Notas {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] notasProvas;
		int contador = 0;
		int maior = 0; 
		int menor = 1000;
		int media = 0; 
		int acima = 0;
		int abaixo = 0;
		
		do{
			notasProvas = sc.nextLine().split(" ");
			int nota = 0;
			for (int i = 0; i < (notasProvas.length); i++) {
				if (i > 0){
					nota = Integer.parseInt(notasProvas[i]);
					contador += 1;
					media += nota;
					if (nota >= 700){
						acima += 1;
					} else{
						abaixo += 1;
					}
					if (nota > maior){
						maior = nota;
					}
					if (nota < menor){
						menor = nota;
					}
				}
			} 
		}while (!notasProvas[0].equals("-"));
		media = media / contador;
		System.out.println("maior: " + maior);
		System.out.println("menor: " + menor);
		System.out.println("media: " + media);
		System.out.println("acima: " + acima);
		System.out.println("abaixo: " + abaixo);
	}
}
