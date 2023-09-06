/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg31_cristian;

import java.util.Scanner;

/**
 *
 * @author CristhianRojas
 */
class Persona {
    Scanner persona = new Scanner(System.in);
    String nombre;
    int edad;
    
    public void hablar(){
        System.out.println(nombre + " hola");
    }
    public void orden() {
        System.out.println(nombre + " levanto la mano");
    }
    public void mostrarValores() {
        
    }
    
}
