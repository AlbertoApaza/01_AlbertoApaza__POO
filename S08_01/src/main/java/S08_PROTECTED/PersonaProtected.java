/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S08_PROTECTED;

/**
 *
 * @author ALBERTO
 */
public class PersonaProtected {
    //ATRIBUTO
    protected String nombre;

    // Método protegido
    protected void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }
}