package Aula05;

import java.util.Scanner;

public class Exemplo9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Utilizando uma estrutura While
		String res;
		do {
			System.out.println("Digite S ou N:");
			res = sc.nextLine();
			}while(!res.equals("s") && ! res.equals("N"));
		System.out.println("Saiu");
		sc.close();
	}

}
