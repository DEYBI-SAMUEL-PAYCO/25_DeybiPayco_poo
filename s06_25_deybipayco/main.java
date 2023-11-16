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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Uso de las clases
        estudiante estudiante1 = new estudiante("Juan", 20);
        estudiante1.presentar();

        calculadora calculadora = new calculadora();

        System.out.println(calculadora.sumar(5));         // Suma 5 al resultado
        System.out.println(calculadora.sumar(3, 7));       // Suma 3 y 7 al resultado
        System.out.println(calculadora.obtenerResultado());// Obtiene el resultado actual
    }
    
}
