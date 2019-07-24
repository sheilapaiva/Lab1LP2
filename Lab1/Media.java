/**
* Laboratório de Programação 2 - Lab 1
* 
* @author Sheila Maria Mendes Paiva - 118210186
*/

import java.util.Scanner;

public class Media {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String [] inteiros = sc.nextLine().split(" ");
		
		int contador = 0;
		for (int i = 0; i < (inteiros.length); i++) {
			int n = Integer.parseInt(inteiros[i]);
			contador += n;
		}
		
		int media = contador / inteiros.length;
		for (int i = 0; i < (inteiros.length); i++) {
			int n = Integer.parseInt(inteiros[i]);
			if (n > media) {
				System.out.print(n + " ");
			}
		}
	}
}
