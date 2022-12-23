package br.com.orangetech.desafios.basicos;

import java.util.Scanner;

/* Desafio: Sua tia Gertrudes é uma leitora assídua. E ela gostaria de ter um aplicativo que dissesse para ela, de acordo com o número de páginas de um
livro, quanto tempo ela levaria para ler lendo apenas 3 páginas por dia. Como você está aprendendo Java, você se disponibilizou para ajudá-la com esse
desenvolvimento. */

public class LeituraDaGertrudes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Número de páginas de um determinado livro
        int paginas = scanner.nextInt();
        // Páginas lidas por dia
        int paginasLidas = 3;

        System.out.println(paginas/paginasLidas + " dias");
    }
}
