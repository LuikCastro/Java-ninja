/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.ac2;

/**
 *
 * @author luik
 */
public class App {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();
        Paciente paciente2 = new Paciente();
        Paciente paciente3 = new Paciente();
        
        Hospital hospital = new Hospital();
        
        paciente1.setIdPaciente(1);
        paciente2.setIdPaciente(2);
        paciente3.setIdPaciente(3);
        
        paciente1.setNome("Julia");
        paciente2.setNome("Carla");
        paciente3.setNome("Ana");
        
        paciente1.setDoenca("Covid-19");
        paciente2.setDoenca("Colecistite");
        paciente3.setDoenca("Dengue");
        
        hospital.registraInternacao(paciente1, 15);
        hospital.registraInternacao(paciente2, 10);
        hospital.registraInternacao(paciente3, 5, 150.0);
        
        System.out.println(paciente1.toString());
        System.out.println("-------");
        System.out.println(paciente2.toString());
        System.out.println("-------");
        System.out.println(paciente3.toString());
        System.out.println("-------");
        
        hospital.registraCirurgia(paciente2, 1200.00);
        hospital.registraAlta(paciente1);
        hospital.registraAlta(paciente3);
        
        System.out.println(paciente1.toString());
        System.out.println("-------");
        System.out.println(paciente2.toString());
        System.out.println("-------");
        System.out.println(paciente3.toString());
        System.out.println("-------");
        
        System.out.println(hospital.toString());
    }
}
