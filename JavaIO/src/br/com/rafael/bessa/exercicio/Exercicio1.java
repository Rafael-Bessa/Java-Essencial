/**
 * Write Java program to read input from java console.
 */

package br.com.rafael.bessa.exercicio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 public class Exercicio1 {
  public static void main(String[] args) throws IOException
  {
	  
    BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Digite seu nome: ");
    String nome = buff.readLine();
    System.out.println("Seu nome é : "+ nome);
    
  }
}
