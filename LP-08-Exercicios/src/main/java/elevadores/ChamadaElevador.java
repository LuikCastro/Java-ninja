/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevadores;

/**
 *
 * @author castr
 */
public class ChamadaElevador {
    private Integer qtdPessoas = 0;
    private Integer pesoTotal = 0;
    private Integer qtdHomem = 0;
    private Integer qtdMulher = 0;
    private Integer qtdCrianca = 0;
    
    public ChamadaElevador(){
        
    }
    
    public void entraHomem(){
        qtdHomem++;
        pesoTotal += 90;
        qtdPessoas++;
    }
    
    public void entraMulher(){
        qtdMulher++;
        pesoTotal += 65;
        qtdPessoas++;
    }
    
    public void entraCrianca(){
        qtdCrianca++;
        pesoTotal += 45;
        qtdPessoas++;
    }
    
    public Integer getQtdPessoas() {
        return qtdPessoas;
    }
    
    public Integer getPesoTotal() {
        return pesoTotal;
    }

    public Integer getQtdHomem() {
        return qtdHomem;
    }

    public Integer getQtdMulher() {
        return qtdMulher;
    }

    public Integer getQtdCrianca() {
        return qtdCrianca;
    }
}
