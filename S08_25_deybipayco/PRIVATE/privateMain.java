/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRIVATE;

/**
 *
 * @author samuel
 */
public class privateMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear una instancia de la clase MiClase
        privatE miObjeto = new privatE();

        // No puedes llamar directamente al método privado desde Main
        // Esto generaría un error de compilación
        // miObjeto.mostrarMensajePrivado();
        // Sin embargo, puedes acceder al método privado desde un método público de la misma clase
        miObjeto.llamarMetodoPrivado();
    }

}
