package br.com.senaisp.bauru.aula04;

public class Exemplo01 {

	public static void main(String[] args) {
		int vlr01=10;
		int vlr02=vlr01;
		System.out.println("vlr01:" + vlr01);
		System.out.println("vlr02:" + vlr02);
		//Strings
		String str01="Abelha";
		String str02= new String("Abelha");
		System.out.println("Str01:"+str01);
		System.out.println("Str02:"+str02);
		//Nessa comparação, é feita de endereço de memória 
		//Não conteudo
		System.out.println(str01==str02);
		//Para comparar conteudo usamos
		

	}

}
