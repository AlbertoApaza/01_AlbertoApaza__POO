/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07_01albertoapaza;

/**
 *
 * @author Lab02
 */
public class Persona1 {
    private String nombre;
    private int edad;

    // Constructor
    public Persona1(String nombreInicial, int edadInicial) {
        nombre = nombreInicial;
        edad = edadInicial;
    }

    // Método para establecer el nombre
    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    // Método para establecer la edad
    public void setEdad(int nuevaEdad) {
        edad = nuevaEdad;
    }

    // Método para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la edad
    public int getEdad() {
        return edad;
    }
}


