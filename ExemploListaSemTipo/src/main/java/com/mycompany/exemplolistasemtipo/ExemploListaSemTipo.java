/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplolistasemtipo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luik
 */
public class ExemploListaSemTipo {

    public static void main(String[] args) {
        List listaLoka = new ArrayList();
        
        listaLoka.add("oi");
        listaLoka.add(2021);
        listaLoka.add(77.5);
        listaLoka.add(true);
        
        System.out.println("FOR TRADICIONAL");
        for (int i = 0; i < listaLoka.size(); i++){
            System.out.println(listaLoka.get(i));
        }
        
        System.out.println("FOR APRIMORADO, FOR ENHANCED");
        for (Object x : listaLoka){
            System.out.println(x);
        }
        
        System.out.println("FOR ARROW FUNCTION");
        listaLoka.forEach(x -> {
            System.out.println(x);
        });
    }
}
