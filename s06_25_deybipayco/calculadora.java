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
public class calculadora {
    // Atributo
    private int resultado;

    // Constructor sin parámetros
    public calculadora() {
        this.resultado = 0;
    }

    // Método con sobrecarga (sumar)
    public int sumar(int a) {
        this.resultado += a;
        return this.resultado;
    }

    public int sumar(int a, int b) {
        this.resultado = a + b;
        return this.resultado;
    }

    // Método con valor de retorno
    public int obtenerResultado() {
        return this.resultado;
    }
}

