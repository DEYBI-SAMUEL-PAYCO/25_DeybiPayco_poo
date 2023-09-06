
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PIERO GAEL
 */
public class calculadora {
    //atributos 
    int a;
    int b;
    int mul;
    int suma;
    int resta;
    int dividir ;
//metodos   
     public void ingresarDatos() {
         Scanner entrada = new Scanner (System.in);
         System.out.println("digitar el primer numero");
        a = entrada.nextInt();
         System.out.println("digitar el segundo numero");
        b = entrada.nextInt();
    }
    public void multiplicar() {
        mul = a * b;
         System.out.println("la multiplicación es;" + mul);
    }
}
