import Nivel1.AberturaArquivo;
import Nivel1.DivisaoPorZero;
import Nivel1.StringParaInt;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        DivisaoPorZero divisaoPorZero = new DivisaoPorZero();
        StringParaInt stringParaInt = new StringParaInt();
        AberturaArquivo aberturaArquivo = new AberturaArquivo();

        try{
            divisaoPorZero.divisao(2,0);
        }catch (ArithmeticException e){
            System.out.println("VOCÊ ESTÁ TENTANDO DIVIDIR POR ZERO");
        }

        try{
            stringParaInt.ConverteStringParaInteiro("abc");
        }catch (NumberFormatException e){
            System.out.println("VOCÊ ESTÁ TENTANDO CONVERTER UMA STRING EM NÚMERO");
        }

        try{
            FileReader reader = new FileReader("arquivo.txt");
        }catch (FileNotFoundException e){
            System.out.println("ARQUIVO NÃO ENCONTRADO");
        }

        try{
            aberturaArquivo.LeArquivo(new FileReader("qualquercoisa.txt"));
        }catch (IOException e){
            System.out.println("ARQUIVO NÃO ENCONTRADO");
        }


    }
}
