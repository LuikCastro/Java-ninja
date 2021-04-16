/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frutas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author castr
 */
public class Frutas {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        lista.add("Maça");
        lista.add("Banana");
        lista.add("Uva");
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor digite uma fruta: ");
        String fruta = leitor.next();
        if (lista.contains(fruta)){
            System.out.println("A fruta: " + fruta + " existe na lista");
        } else{
            System.out.println("A fruta: " + fruta + " não existe na lsita");
        }
    }
}
