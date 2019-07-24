/**
* Laboratório de Programação 2 - Lab 1
* 
* @author Sheila Maria Mendes Paiva - 118210186
*/

import java.util.Scanner;

public class MudouNome {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String listaNome;
		do{
			listaNome = sc.nextLine();
			String nome = "?";
			for (String palavra : listaNome.split(" ")) {
				if (palavra.length() == 5){
					nome = palavra;
				}
			}
			if (!nome.equals("wally")){
				System.out.println(nome);
			}
		} while (!listaNome.equals("wally"));
	}
}
