/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s11_25_deybipayco;

/**
 *
 * @author deybi
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear objetos de cada clase
        Persona persona = new Persona("Juan", 30);
        Estudiante estudiante = new Estudiante("Ana", 20, "Matemáticas");
        Empleado empleado = new Empleado("Carlos", 35, 50000.0);
        Deportista deportista = new Deportista("María", 25, "Tenis");

        // Llamar a métodos de las clases
        persona.saludar();
        persona.imprimirEdad();

        estudiante.saludar();
        estudiante.imprimirEdad();
        estudiante.estudiar();

        empleado.saludar();
        empleado.imprimirEdad();
        empleado.trabajar();

        deportista.saludar();
        deportista.imprimirEdad();
        deportista.practicarDeporte();
    }
    
}
