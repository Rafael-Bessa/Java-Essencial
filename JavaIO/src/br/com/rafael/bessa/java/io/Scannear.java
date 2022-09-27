package br.com.rafael.bessa.java.io;

import java.io.File;
import java.util.Scanner;

public class Scannear {

	public static void main(String[] args) throws Exception {
		
		//metodos de alto nivel
		
		Scanner s = new Scanner(new File("contas.csv"));
		
		while(s.hasNext()) {
		
			String linha = s.nextLine();
			System.out.println(linha);

		}
		
		s.close();
	}

}
