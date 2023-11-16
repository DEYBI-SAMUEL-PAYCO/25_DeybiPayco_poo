/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07_25_deybipayco;

/**
 *
 * @author deybi
 */
public class persona {
    // Atributos
    private String nombre;
    private int edad;
    private double altura;

    // Constructor
    public persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // Método sin parámetros ni valor de retorno
    public void saludar() {
        System.out.println("Hola, soy " + this.nombre);
    }

    // Sobrecarga de métodos
    // Método con parámetros
    public void caminar() {
        System.out.println(this.nombre + " está caminando");
    }

    public void caminar(int pasos) {
        System.out.println(this.nombre + " ha caminado " + pasos + " pasos");
    }

    // Método con valor de retorno
    public String obtenerInformacion() {
        return "Nombre: " + this.nombre + ", Edad: " + this.edad + " años, Altura: " + this.altura + " metros";
    }

    // Sobrecarga de método con parámetros
    public void cumplirAnios() {
        this.edad++;
        System.out.println("¡Feliz cumpleaños! " + this.nombre + " ahora tiene " + this.edad + " años");
    }

    public void cumplirAnios(int anios) {
        this.edad += anios;
        System.out.println("¡Feliz cumpleaños! " + this.nombre + " ahora tiene " + this.edad + " años");
    }

    // Método con parámetros y valor de retorno
    public double crecer(double crecimiento) {
        this.altura += crecimiento;
        return this.altura;
    }

}
