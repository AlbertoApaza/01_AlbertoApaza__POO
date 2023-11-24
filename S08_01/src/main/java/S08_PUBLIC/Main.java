/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package S08_PUBLIC;

/**
 *
 * @author ALBERTO
 */
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de PersonaPublic
        PersonaPublic persona = new PersonaPublic();

        // Establecer los valores de los atributos
        persona.nombre = "Alberto";
        persona.edad = 17;

        // Llamar al método saludar()
        persona.saludar();
    }
}