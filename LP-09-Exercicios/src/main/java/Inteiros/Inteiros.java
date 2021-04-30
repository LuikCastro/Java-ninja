/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inteiros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class Inteiros {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer numero, soma = 0, menor = 0, maior = 0;
        Boolean verificarNumero = true;
        List<Integer> listaNumeros = new ArrayList();

        while (verificarNumero) {
            System.out.println("Favor informar um numero inteiro.");
            numero = leitor.nextInt();
            if (numero != 0) {
                listaNumeros.add(numero);
            } else {
                verificarNumero = false;
            }
        }
        System.out.println("LISTA!!!");
        System.out.println(listaNumeros);

        System.out.println("LISTA DE PARES");
        for (int i = 0; i < listaNumeros.size(); i++) {
            if (listaNumeros.get(i) % 2 == 0) {
                System.out.println(listaNumeros.get(i));
            }
        }

        System.out.println("LISTA DE IMPARES");
        for (int i = 0; i < listaNumeros.size(); i++) {
            if (listaNumeros.get(i) % 2 == 1) {
                System.out.println(listaNumeros.get(i));
            }
        }

        System.out.println("SOMA DE TODOS");
        for (int i = 0; i < listaNumeros.size(); i++) {
            soma += listaNumeros.get(i);
        }
        System.out.println(soma);

        System.out.println("MENOR DE TODOS");
        for (int i = 0; i < listaNumeros.size(); i++) {
            if (menor == 0) {
                menor = listaNumeros.get(i);
            } else {
                if (listaNumeros.get(i) < menor) {
                    menor = listaNumeros.get(i);
                }
            }
        }
        System.out.println(menor);

        System.out.println("MAIOR DE TODOS");
        for (int i = 0; i < listaNumeros.size(); i++) {
            if (maior == 0) {
                maior = listaNumeros.get(i);
            } else {
                if (listaNumeros.get(i) > maior) {
                    maior = listaNumeros.get(i);
                }
            }
        }
        System.out.println(maior);
    }
}
