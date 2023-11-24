/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S08_PRIVATE;

/**
 *
 * @author ALBERTO
 */
public class PersonaPrivate {
    //ATRIBUTOS
    private String nombre;
    private int edad;
    
    public void asignarValores(String nombre, int edad) {
        // Código del método público para asignar valores a los atributos
        this.nombre = nombre;
        this.edad = edad;
    }
    
    void imprimirEdad() {
        // Código del método privado para imprimir la edad de la persona
        System.out.println("La edad de " + nombre + " es: " + edad + " años.");
    }
    
    // Otros métodos y constructores
}