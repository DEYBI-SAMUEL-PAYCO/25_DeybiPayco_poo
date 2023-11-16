/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s06_25_deybipayco;

/**
 *
 * @author deybi
 */
public class estudiante {
        // Atributos
    private String nombre;
    private int edad;

    public estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
        // Método sin sobrecarga
    public void presentar() {
        System.out.println("Hola, soy " + this.nombre + " y tengo " + this.edad + " años.");
    }
}
