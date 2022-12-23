package br.com.orangetech.desafios.intermediarios;

import java.util.Scanner;

/*
Você levou sua namorada na incrível rede de lanchonetes Dc Monalds e ficou maravilhado como aquele lanche era gostoso. Porém, ficou horrorizado como algumas coisas no
aplicativo do cardápio estavam erradas. Então, você se ofereceu para ajudá-los com seus conhecimentos de programação. Ao conversar com o gerente, ele te explicou que a
vontade da lanchonete era criar um menu com os nomes dos ingredientes formando o lanche, como no exemplo abaixo:
Pao
Presunto
Carne
Pao
Ajude o restaurante a programar isso. */

public class DcMonalds {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[];

        listaIngredientes = ingredientes.split(";");

        for (String s : listaIngredientes) {
            System.out.println(s);
        }

    }
}