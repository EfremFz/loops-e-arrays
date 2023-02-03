package br.com.dio.exercicios.loops;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
import java.util.Scanner;


public class Ex4_ParEImpar{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int quantNumeros, numero;
        int count = 0, quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números que deseja :");
        quantNumeros = scan.nextInt();

        do{

            System.out.println("Informe um Numero :");
            numero = scan.nextInt();

            if(numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++; //equivale a (count = count + 1;)

        }while(count < quantNumeros);

        System.out.println("Quantidade de numeros Pares : " + quantPares);
        System.out.println("Quantidade de numeros Impares : " + quantImpares);




    }
}
