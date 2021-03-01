/*
Esse programa faz um pequeno torneio entre duas pessoas de Pedra, Papel e Tesoura (Jokenpô),
A primeira coisa que o programa faz é cadastrar o nomes do dois oponentes, após isso é perguntado quantas
rodadas eles querem jogar. Para jogar é simples, o programa irá solicitar para cada jogador escrever sua mão (Pedra, Papel ou Tesoura),
se caso o jogador enviar uma mão inválida, um erro é retornado e o programa pergunta novamente a mão até que ele envie uma mão válida.
No final de cada rodada o programa verifica o vencedor e anuncia o mesmo, se caso haja um empate, a rodada é desconsiderada pelo programa
e é feita novamente até sair um vitorioso. Quando chegar na última rodada, é anunciado o vencedor e é exibido suas estátisticas (pontos, vitórias...)
e se caso dê empate, é anunciado o empate e mostra as estátistica de ambos jogadores.
 */
package com.mycompany.luik.castro.silva.ac1;

import java.util.Scanner;

/**
 *
 * @author castr
 */
public class Jokenpo {
   
    
    public static Boolean validarJogada(String x){
        Boolean validar;
        switch(x){
            case "Tesoura" : validar = false;
            break;
            case "Papel" : validar = false;
            break;
            case "Pedra" : validar = false;
            break;
            
            default: validar = true;
        }
        return validar;
    }
    
    public static String vencedorRodada(String maoUm, String maoDois){
        String vencedor;
        if ("Tesoura".equals(maoUm)  && "Papel".equals(maoDois) || "Pedra".equals(maoUm) && "Tesoura".equals(maoDois) || "Papel".equals(maoUm) && "Pedra".equals(maoDois)){
            vencedor = "maoUm";
        } 
        else if ("Tesoura".equals(maoDois)  && "Papel".equals(maoUm) || "Pedra".equals(maoDois) && "Tesoura".equals(maoUm) || "Papel".equals(maoDois) && "Pedra".equals(maoUm)){
            vencedor = "maoDois";
        }
        else{
            vencedor = "empate";
        }
        return vencedor;
    }
    
    public static void verVencedorPartida(String jogadorUm, String jogadorDois, Double pontosUm, Double pontosDois, Integer vitoriasJogadorUm, Integer vitoriasJogadorDois){
        if(pontosUm > pontosDois){
            System.out.println(String.format("Jogador: %s é o ganhador desta partida! \n Pontos: %.1f \n Rodadas ganhas: %d" , jogadorUm, pontosUm, vitoriasJogadorUm));
            System.out.println("Jogador " + jogadorDois + " ficou com " + (pontosUm - pontosDois) + " pontos a menos.");
        } 
        else if (pontosDois > pontosUm){
            System.out.println(String.format("Jogador: %s é o ganhador desta partida! \n Pontos: %.1f \n Rodadas ganhas: %d" , jogadorDois, pontosDois, vitoriasJogadorDois));
            System.out.println("Jogador " + jogadorUm + " ficou com " + (pontosDois - pontosUm) + " pontos a menos.");
        }
        else{
            System.out.println(String.format("A partida deu empate! \n Jogador: %s obteve %.1f pontos e %d rodadas ganhas \n Jogador: %s obteve %.1f pontos e %d rodadas ganhas", jogadorUm, pontosUm, vitoriasJogadorUm, jogadorDois, pontosDois, vitoriasJogadorDois));
        }
    }
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String jogadorUm, jogadorDois, iniciar, maoJogadorUm, maoJogadorDois;
        Boolean parar;
        Integer rodadas;
        Integer vitoriaJogadorUm = 0;
        Integer vitoriaJogadorDois = 0;
        Double pontosJogadorUm = 0.0;
        Double pontosJogadorDois = 0.0;
        
        System.out.println("Digite o nome do jogador 1");
        jogadorUm = leitor.next();
      
        System.out.println("Digite o nome do jogador 2");
        jogadorDois = leitor.next();
        
        System.out.println("Digite o número de rodadas");
        rodadas = leitor.nextInt();
        
        System.out.println(String.format("ATENÇÃO! Torneio entre %s e %s! já vai começar! e terá %d rodada(s)", jogadorUm, jogadorDois, rodadas));
        System.out.println(" ... preparando torneio ... \n ... carregando ... \n ... carregando ... \n ... bora lá ...");
        
        do{
            System.out.println("Digite 'play' para começar");
            iniciar = leitor.next();
            parar = "play".equals(iniciar);
        } while (parar == false);
        
        for (int i = 1; i <= rodadas; i++){
            do {
                System.out.println(jogadorUm + " Digite sua mão!");
                maoJogadorUm = leitor.next();
                parar = validarJogada(maoJogadorUm);
                if (parar == true){
                    System.out.println("Por favor, digite uma mão válida.");
                }
            } while (parar);
            
            do {
                System.out.println(jogadorDois + " Digite sua mão!");
                maoJogadorDois = leitor.next();
                parar = validarJogada(maoJogadorDois);
                if (parar == true){
                    System.out.println("Por favor, digite uma mão válida.");
                }
            } while (parar);
            
            if("maoUm".equals(vencedorRodada(maoJogadorUm, maoJogadorDois))){
                pontosJogadorUm = pontosJogadorUm + 1.5;
                vitoriaJogadorUm++;
                System.out.println("O vencedor desta rodada é: " + jogadorUm);
            }
            else if ("maoDois".equals(vencedorRodada(maoJogadorUm, maoJogadorDois))){
                pontosJogadorDois = pontosJogadorDois + 1.5;
                vitoriaJogadorDois++;
                System.out.println("O vencedor desta rodada é: " + jogadorDois);
            }
            else if ("empate".equals(vencedorRodada(maoJogadorUm, maoJogadorDois))){
                System.out.println("Empate! esta rodada será feita novamente");
                pontosJogadorUm = pontosJogadorUm + 0.5;
                pontosJogadorDois = pontosJogadorDois + 0.5;
                i--;
            }
        }
        verVencedorPartida(jogadorUm, jogadorDois, pontosJogadorUm, pontosJogadorDois, vitoriaJogadorUm, vitoriaJogadorDois);
    }   
}
