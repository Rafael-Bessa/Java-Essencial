package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SorteadorPalavras {

    private List<String> listaPalavras = new ArrayList<>();

    private void leArquivo() throws FileNotFoundException {

        Scanner s = new Scanner(new File("palavras.txt"));

        while(s.hasNext()){
            listaPalavras.add(s.nextLine());
        }
    }

    public String sorteiaPalavraAleatoria() throws FileNotFoundException {

        leArquivo();
        Random random = new Random();
        return listaPalavras.get(random.nextInt(listaPalavras.size()));
    }
}
