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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 // Crear objetos de la clase Persona
        persona persona1 = new persona("Ana", 25);
        persona persona2 = new persona("Juan", 30);

        // Llamar a métodos de la clase Persona con persona1 y persona2
        persona1.saludar("¡Hola!");
        String infoPersona2 = persona2.obtenerInformacion();
        System.out.println(infoPersona2);
    }    }
    
