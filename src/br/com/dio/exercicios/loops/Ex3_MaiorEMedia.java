package br.com.dio.exercicios.loops;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/


import java.util.Scanner;

public class  Ex3_MaiorEMedia{



    public static void main(String[ ]args){
        Scanner scan = new Scanner(System.in);

        int numero, maior =0;
        int soma = 0;
        int count = 0; //contator



        do {
            System.out.println("Numero :");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero; // Condição criada para atribuir o maior valor para variavel sempre que o laço for repetido

            count = count + 1;

        }while(count < 5);//para que o laço se repita o teste tem que dar falso, assim que der verdadeiro ele sai do laço

        System.out.println("Maior numero :" + maior);
        System.out.println("Média dos numeros é :" + (soma/5));



    }

}

