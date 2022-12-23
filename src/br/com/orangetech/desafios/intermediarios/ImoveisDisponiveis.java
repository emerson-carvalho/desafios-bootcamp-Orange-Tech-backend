package br.com.orangetech.desafios.intermediarios;

import java.util.Scanner;

/* Desafio: O seu amigo quer verificar quais os imóveis estão disponíveis em uma certa corretora na região onde ele mora. A corretora disponibilizou uma API para ele,
mas como ele não entende nada de programação, pediu a sua ajuda. Para deixar tudo bonitinho, você resolveu criar um aplicativo para seu querido amigo, mas quando foi
olhar a API retornava os dados de uma forma esquisita, separado por barras. Ajude seu amigo deixando a informação mais amigável possível. */

public class ImoveisDisponiveis {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        String array[];

        array = frase.split("/");

        System.out.println("Imovel: " + array[0] + " R$" + array[1] + " " + array[2]);
    }
}
