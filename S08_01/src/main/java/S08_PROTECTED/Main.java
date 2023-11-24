/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package S08_PROTECTED;

/**
 *
 * @author ALBERTO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Crear una instancia de PersonaProtected
        PersonaProtected persona = new PersonaProtected();

        // Establecer el valor del atributo protegido
        persona.nombre = "Alberto";

        // Llamar al método protegido
        persona.saludar();
    }
}