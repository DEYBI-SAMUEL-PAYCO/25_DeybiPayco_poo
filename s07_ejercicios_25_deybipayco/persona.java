/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07_ejercicios_25_deybipayco;

/**
 *
 * @author deybi
 */

public class persona {
    // Atributos
    private String nombre;
    private int edad;

    // Constructor
    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método con parámetros para persona1
    public void saludar(String saludo) {
        System.out.println(saludo + ", soy " + this.nombre);
    }

    // Método con valor de retorno para persona2
    public String obtenerInformacion() {
        return "Nombre: " + this.nombre + ", Edad: " + this.edad + " años";
    }
}
