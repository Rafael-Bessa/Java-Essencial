package br.com.rafael.bessa.java.io;

import java.io.IOException;
import java.io.PrintStream;

public class Escreve3 {

	public static void main(String[] args) throws IOException {
		
//		OutputStream fos = new FileOutputStream("java2.io.txt");
//		OutputStreamWriter osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		
//		FileWriter fw = new FileWriter("java2.io.txt");
		
		
		
		PrintStream ps = new PrintStream("java2.io.txt");
		
		ps.print("Estou digitando");
		ps.println();
		ps.println("Digitando mais");
		ps.println();
		ps.println("oi");
		
		ps.close();
	}

}
