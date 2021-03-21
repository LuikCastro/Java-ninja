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
public class ProgramaCalculo {
    public static void main(String[] args) {
        Calculadora calc1 = new Calculadora();
        Calculadora calc2 = new Calculadora();
        
        calc1.setN1(25);
        calc1.setN2(5);
        
        calc2.setN1(10);
        calc2.setN2(2);
        
        System.out.println("Iniciando programa calculadora...");
        System.out.println("             ");
        System.out.println(calc1.getN1() + " + " + calc1.getN2() + " = " + calc1.somar());
        System.out.println(calc1.getN1() + " - " + calc1.getN2() + " = " + calc1.subtrair());
        System.out.println(calc1.getN1() + " * " + calc1.getN2() + " = " + calc1.multiplicar());
        System.out.println(calc1.getN1() + " / " + calc1.getN2() + " = " + calc1.dividir());
        System.out.println("-----------------------");
        System.out.println(calc2.getN1() + " + " + calc2.getN2() + " = " + calc2.somar());
        System.out.println(calc2.getN1() + " - " + calc2.getN2() + " = " + calc2.subtrair());
        System.out.println(calc2.getN1() + " * " + calc2.getN2() + " = " + calc2.multiplicar());
        System.out.println(calc2.getN1() + " / " + calc2.getN2() + " = " + calc2.dividir());
    }

}
