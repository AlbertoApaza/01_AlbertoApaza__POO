/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package S08_PRIVATE;

/**
 *
 * @author ALBERTO
 */
public class Main {
    public static void main(String[] args) {
        PersonaPrivate persona = new PersonaPrivate();
        persona.asignarValores("Alberto", 17);
        
        // Llamar al método público para imprimir la edad de la persona
        persona.imprimirEdad();
    }
}