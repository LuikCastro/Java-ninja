/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author castr
 */
public class Calculadora {
    private Integer n1;
    private Integer n2;

    public Integer getN1() {
        return n1;
    }

    public void setN1(Integer n1) {
        this.n1 = n1;
    }

    public Integer getN2() {
        return n2;
    }

    public void setN2(Integer n2) {
        this.n2 = n2;
    }
    
    public Integer somar(){
        return this.n1 + this.n2;
    }
    
    public Integer subtrair(){
        return this.n1 - this.n2;
    }
    
    public Integer multiplicar(){
        return this.n1 * this.n2;
    }
    
    public Integer dividir(){
        return this.n1 / this.n2;
    }
}
