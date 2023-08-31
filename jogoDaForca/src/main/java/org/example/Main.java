package org.example;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        SorteadorPalavras sorteador = new SorteadorPalavras();


        String palavraSecreta = sorteador.sorteiaPalavraAleatoria();
        int maxTentativas = 6;
        int tentativas = 0;

        char[] palavraEscondida = new char[palavraSecreta.length()];
        for (int i = 0; i < palavraSecreta.length(); i++) {
            palavraEscondida[i] = '_';
        }

        while (tentativas < maxTentativas) {
            System.out.println("Palavra: " + new String(palavraEscondida));
            System.out.print("Digite uma letra: ");
            char letra = scanner.next().charAt(0);

            boolean acertou = false;
            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letra) {
                    palavraEscondida[i] = letra;
                    acertou = true;
                }
            }

            if (!acertou) {
                tentativas++;
                System.out.println("Errou! Tentativas restantes: " + (maxTentativas - tentativas));
            }

            if (new String(palavraEscondida).equals(palavraSecreta)) {
                System.out.println("Parabéns, você ganhou! A palavra era: " + palavraSecreta);
                break;
            }
        }

        if (tentativas == maxTentativas) {
            System.out.println("Você perdeu! A palavra era: " + palavraSecreta);
        }
        scanner.close();
    }
}