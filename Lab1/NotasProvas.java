/**
* Laboratório de Programação 2 - Lab 1
* 
* @author Sheila Maria Mendes Paiva - 118210186
*/

import java.util.Scanner;

public class NotasProvas {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String [] nomeNota;
		int contador = 0;
		int maior = 0; 
		int menor = 1000;
		int media = 0; 
		int acima = 0;
		int abaixo = 0;
		
		do{
			nomeNota = sc.nextLine().split(" ");
			int nota = 0;
			for (int i = 0; i < (nomeNota.length); i++) {
				if (i == 1){
					nota = Integer.parseInt(nomeNota[i]);
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

		}while (!nomeNota[0].equals("-"));
		
		System.out.println("maior: " + maior);
		System.out.println("menor: " + menor);
		System.out.println("media: " + (media / contador));
		System.out.println("acima: " + acima);
		System.out.println("abaixo: " + abaixo);
	}
}
