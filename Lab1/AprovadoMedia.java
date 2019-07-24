/**
* Laboratório de Programação 2 - Lab 1
* 
* @author Sheila Maria Mendes Paiva - 118210186
*/

import java.util.Scanner;

public class AprovadoMedia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        
        double media = (num1 + num2) / 2;
        if (media >= 7){
			System.out.println("pass: True!");
		} else {
			System.out.println("pass: False!");
		}
		
    }

}
