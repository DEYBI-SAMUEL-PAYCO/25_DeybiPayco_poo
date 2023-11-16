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
class Persona {
    // Atributos de la clase Persona
    protected String nombre;
    protected int edad;

    // Constructor de la clase Persona
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos de la clase Persona
    public void saludar() {
        System.out.println("Hola, soy " + this.nombre);
    }

    public void imprimirEdad() {
        System.out.println("Edad: " + this.edad + " años");
    }
}

// Clases Hijas que heredan de Persona
class Estudiante extends Persona {
    // Atributos adicionales de la clase Estudiante
    private String curso;

    // Constructor de la clase Estudiante
    public Estudiante(String nombre, int edad, String curso) {
        super(nombre, edad);
        this.curso = curso;
    }

    // Métodos adicionales de la clase Estudiante
    public void estudiar() {
        System.out.println(this.nombre + " está estudiando en el curso de " + this.curso);
    }
}

class Empleado extends Persona {
    // Atributos adicionales de la clase Empleado
    private double salario;

    // Constructor de la clase Empleado
    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;
    }

    // Métodos adicionales de la clase Empleado
    public void trabajar() {
        System.out.println(this.nombre + " está trabajando con un salario de " + this.salario);
    }
}

class Deportista extends Persona {
    // Atributos adicionales de la clase Deportista
    private String deporte;

    // Constructor de la clase Deportista
    public Deportista(String nombre, int edad, String deporte) {
        super(nombre, edad);
        this.deporte = deporte;
    }

    // Métodos adicionales de la clase Deportista
    public void practicarDeporte() {
        System.out.println(this.nombre + " practica el deporte de " + this.deporte);
    }
}
