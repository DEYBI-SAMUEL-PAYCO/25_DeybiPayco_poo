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
public class privatE {
    // Método privado de la clase MiClase

    private void mostrarMensajePrivado() {
        System.out.println("Hola desde MiClase (privado)");
    }

    // Método público que llama al método privado
    public void llamarMetodoPrivado() {
        mostrarMensajePrivado();
    }
}
