package br.com.rafael.bessa.java.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Escreve2 {

	public static void main(String[] args) throws IOException {
		
		OutputStream fos = new FileOutputStream("java2.io.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		bw.write("Estou escrevendo com o writer");
		bw.newLine();
		bw.newLine();
		bw.write("Escrevendo mais");
			
		bw.close();

	}

}
