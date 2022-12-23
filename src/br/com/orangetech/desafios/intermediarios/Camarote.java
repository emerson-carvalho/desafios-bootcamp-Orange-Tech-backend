package br.com.orangetech.desafios.intermediarios;

import java.util.Scanner;

/* Desafio: No show da famosa banda Blue Cold Ice Cubes o vocalista, Antônio Queda, escolheu todas as pessoas que estavam na posição impar da fila para entrarem no camarote.
Ele fez isso em diversos shows e as pessoas foram a loucura para competirem por essas posições. Você resolveu criar um programa para saber, de acordo com o número de
pessoas na fila, quantas entrariam no camarote. */

public class Camarote {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;

        for (int i = 0; i <= tamanhoDaFila; i++) {
            if (i % 2 != 0) {
                pessoasNoCamarote++;
            }
        }
        System.out.printf("%d pessoas no camarote", pessoasNoCamarote);
    }
}
