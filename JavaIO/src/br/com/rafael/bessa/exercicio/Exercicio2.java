package br.com.rafael.bessa.exercicio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio2 {

	public static void main(String[] args)  {
		
		try {
			BufferedReader buff = new BufferedReader(new InputStreamReader(new FileInputStream("java.io.txt")));
			
	
				String linha = buff.readLine();
				
				
				while(linha != null) {			
					System.out.println(linha);
					linha = buff.readLine();
				
				}
			
			buff.close();
		}
		
		catch(IOException e) {
			System.out.println("O arquivo não pode ser lido");
			System.out.println(e.getMessage());
		}
		
		
	}

}
