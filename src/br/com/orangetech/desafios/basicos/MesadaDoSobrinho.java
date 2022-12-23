package br.com.orangetech.desafios.basicos;

import java.util.Scanner;

/* Desafio: Seu sobrinho começou a ganhar mesada dos pais. No auge dos seus 8 anos recebendo 50 reais por mês, ele quer saber quanto terá se juntar
o dinheiro, sem gastar nada, durante alguns meses. E você, como um bom tio com habilidades de programação, vai criar um programa que com as
entradas do seu sobrinho vai calcular automaticamente a quantidade de dinheiro que ele terá em X meses. */

public class MesadaDoSobrinho {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // variavel que armazena a quantidade de meses de mesada poupada
        int meses = scanner.nextInt();
        int mesada = 50;

        int valorAcumulado = mesada * meses;

        System.out.println("Voce tera " + valorAcumulado + " reais");
    }
}
