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
public class TreinadorPokemon {
    private String nome;
    private Integer nivel;
    
    public TreinadorPokemon(String nome){
        this.nome = nome;
        this.nivel = 0;
    }
    
    public void treinarPokemon(Pokemon pokemon){
       pokemon.setForca(pokemon.getForca() + (pokemon.getForca() * 0.1));
       pokemon.setDoces(pokemon.getDoces() + 10);
       this.nivel += 2;
    }
    
    public void evoluirPokemon(Pokemon pokemon, String nomeEvolucao){
        if (pokemon.getDoces() >= 50){
            System.out.println("Pokémon: " + pokemon.getNome() + " evoluiu para  - > " + nomeEvolucao);
            pokemon.setNome(nomeEvolucao);
            pokemon.setDoces(pokemon.getDoces() - 50);
            
        }
        else{
            System.out.println("Não foi possível evoluir o pokemon!");
        }
    }

    @Override
    public String toString() {
        return "TreinadorPokemon{" + "nome=" + nome + ", nivel=" + nivel + '}';
    }
}
