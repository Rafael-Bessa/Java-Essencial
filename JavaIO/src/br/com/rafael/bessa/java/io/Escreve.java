package br.com.rafael.bessa.java.io;

import java.io.FileWriter;
import java.io.IOException;

public class Escreve {

	public static void main(String[] args) throws IOException {
		
//		OutputStream fos = new FileOutputStream("java2.io.txt");
//		OutputStreamWriter osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		
		FileWriter fw = new FileWriter("java2.io.txt");
		
		fw.write("Estou escrevendo com o writer");
		fw.write(System.lineSeparator());                      // devolve os caracteres \n
		fw.write("Escrevendo mais");
		fw.write("\n");
		fw.write("Testandooooooooooooooo");
		fw.write(System.lineSeparator());
		fw.write(System.lineSeparator());
		fw.write("Alô");
		
			
		fw.close();

	}

}
