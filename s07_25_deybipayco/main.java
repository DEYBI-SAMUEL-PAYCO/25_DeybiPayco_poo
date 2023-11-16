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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear objetos de la clase Persona
        persona persona1 = new persona("Ana", 25, 1.65);
        persona persona2 = new persona("Juan", 30, 1.75);

        // Llamar a métodos de la clase Persona
        persona1.saludar();
        persona2.saludar();

        persona1.caminar();
        persona2.caminar(100);

        System.out.println(persona1.obtenerInformacion());
        System.out.println(persona2.obtenerInformacion());

        persona1.cumplirAnios();
        persona2.cumplirAnios(2);

        System.out.println(persona1.obtenerInformacion());
        System.out.println(persona2.obtenerInformacion());

        double nuevaAltura = persona1.crecer(0.1);
        System.out.println("Nueva altura de " + persona1.getNombre + ": " + nuevaAltura);
    }
        // Getter para el nombre
    public String getNombre() {
        return this.nombre;
    }
}
