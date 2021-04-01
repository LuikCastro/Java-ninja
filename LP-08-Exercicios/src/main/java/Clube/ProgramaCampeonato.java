/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clube;

/**
 *
 * @author castr
 */
public class ProgramaCampeonato {
    public static void main(String[] args) {
        Clube clube1 = new Clube();
        Clube clube2 = new Clube();
        
        clube1.setNomeClube("Bayern");
        clube2.setNomeClube("Barcelona");
        
        clube1.registrarVitoria();
        clube2.registrarDerrota();
        
        System.out.println(clube1.getNomeClube() + " Ganhou nessa rodada");
        System.out.println(clube2.getNomeClube() + " Perdeu nessa rodada");
        System.out.println(clube1.getNomeClube() + " pontos: " + clube1.getPontos());
        System.out.println(clube2.getNomeClube() + " pontos: " + clube2.getPontos());
        System.out.println("                 ");
        System.out.println("-----------------");
        
        clube1.registrarDerrota();
        clube2.registrarVitoria();
        
        System.out.println(clube1.getNomeClube() + " Perdeu nessa rodada");
        System.out.println(clube2.getNomeClube() + " Ganhou nessa rodada");
        System.out.println(clube1.getNomeClube() + " pontos: " + clube1.getPontos());
        System.out.println(clube2.getNomeClube() + " pontos: " + clube2.getPontos());
        System.out.println("                 ");
        System.out.println("-----------------");
        
        clube1.registrarEmpate();
        clube2.registrarVitoria();
        
        System.out.println(clube1.getNomeClube() + " Empatou nessa rodada");
        System.out.println(clube2.getNomeClube() + " Ganhou nessa rodada");
        System.out.println(clube1.getNomeClube() + " pontos: " + clube1.getPontos());
        System.out.println(clube2.getNomeClube() + " pontos: " + clube2.getPontos());
        System.out.println("                 ");
        System.out.println("-----------------");
        
        clube1.registrarVitoria();
        clube2.registrarDerrota();
        
        System.out.println(clube1.getNomeClube() + " Ganhou nessa rodada");
        System.out.println(clube2.getNomeClube() + " Perdeu nessa rodada");
        System.out.println(clube1.getNomeClube() + " pontos: " + clube1.getPontos());
        System.out.println(clube2.getNomeClube() + " pontos: " + clube2.getPontos());
        System.out.println("                 ");
        System.out.println("-----------------");
        
        clube1.registrarVitoria();
        clube2.registrarDerrota();
        
        System.out.println(clube1.getNomeClube() + " Ganhou nessa rodada");
        System.out.println(clube2.getNomeClube() + " Perdeu nessa rodada");
        System.out.println(clube1.getNomeClube() + " pontos: " + clube1.getPontos());
        System.out.println(clube2.getNomeClube() + " pontos: " + clube2.getPontos());
        System.out.println("                 ");
        System.out.println("-----------------");
        
        System.out.println("Final de temporada:");
        System.out.println("                 ");
        System.out.println(clube1.getNomeClube() + ": " + clube1.getVitoria() + " vitórias, " + clube1.getEmpate() + " empates, " + clube1.getDerrota() + " derrotas"  );
        System.out.println("Total de pontos: " + clube1.getPontos());
        System.out.println("                 ");
        
        System.out.println("Final de temporada:");
        System.out.println(clube2.getNomeClube() + ": " + clube2.getVitoria() + " vitórias, " + clube2.getEmpate() + " empates, " + clube2.getDerrota() + " derrotas"  );
        System.out.println("Total de pontos: " + clube2.getPontos());
        System.out.println("                 ");
    }
}
