/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lp.exercicio;

/**
 *
 * @author castr
 */
public class TestePokemon {
    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon();
        pokemon1.setNome("Pikachu");
        pokemon1.setTipo("Elétrico");
        
        Pokemon pokemon2 = new Pokemon();
        pokemon2.setNome("Charmander");
        pokemon2.setTipo("Fogo");
        
        System.out.println(pokemon1.toString());
        System.out.println(pokemon2.toString());
        
        TreinadorPokemon treinador = new TreinadorPokemon("Ash");
        
        treinador.treinarPokemon(pokemon2);
        treinador.treinarPokemon(pokemon2);
        treinador.treinarPokemon(pokemon2);
        treinador.treinarPokemon(pokemon2);
        treinador.treinarPokemon(pokemon2);
        
        System.out.println(pokemon2.toString());
        
        treinador.evoluirPokemon(pokemon2, "Charmeleon");
        
        System.out.println(pokemon2.toString());
        
        treinador.treinarPokemon(pokemon1);
        treinador.treinarPokemon(pokemon1);
        
        System.out.println(pokemon1.toString());
        
        treinador.evoluirPokemon(pokemon1, "Raiuchu");
        
        System.out.println(treinador.toString());
    }
}
