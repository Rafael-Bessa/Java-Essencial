package br.com.rafael.bessa.java.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada com um arquivo txt.
		
		FileInputStream fis = new FileInputStream("java.io.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		
		br.close();
	}

}
