package Aula05;

import java.util.Locale;
import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		//Usando o scanner para ler um arquivo texto
		Scanner sc = new Scanner(
				Exercício01.class.getResourceAsStream("arquivo.txt"));
		String linha= sc.nextLine();//pegando cabeçalho
		Scanner sca = new Scanner(linha);
		sca.useDelimiter(";");
		//Imprimindo o cabeçalho
		while(sca.hasNext()) {
			System.out.print(sca.next()+"\t\t");// \t=tab
		}
		System.out.println();//pulando a linha
		sca.close();//fechando o scanner de apoio
		while(sc.hasNextLine()) {
			linha = sc.nextLine();
			sca=new Scanner(linha).useLocale(Locale.US);
			sca.useDelimiter(";");//Delimitador
			//Imprimindo o nome
			System.out.print(sca.next()+ "\t");//nome
			//Imprimindo a idade
			System.out.print(sca.nextInt()+ "\t");//idade
			//Imprimindo o salário
			System.out.println(sca.nextDouble());//salário
			//fechando o scanner de apoio
			sca.close();
			
		}
		sc.close();
				
		
		

	}

}
