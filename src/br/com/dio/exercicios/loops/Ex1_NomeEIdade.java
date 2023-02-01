package br.com.dio.exercicios.loops;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

import java.util.Scanner;

public class Ex1_NomeEIdade {

    public static void main (String [] args){

        Scanner scan = new Scanner(System.in); //Foi criada a classe Scanner para fazer entradas via teclado

        String nome;
        int idade;


        while(true){
            System.out.println("Nome : ");
            nome = scan.next(); // usando a classe scan ler strings

            if (nome.equals("0")) break; // esse IF é usando para parar o laço whilw

            System.out.println("Idade :");
            idade = scan.nextInt(); // usando a classe scan para ler int
        }

        System.out.println("Foi inserido o valor '0' (Zero) no campo Nome" );

    }
}
