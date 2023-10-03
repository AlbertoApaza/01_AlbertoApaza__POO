/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S07v2_01AlbertoApaza;

/**
 *
 * @author Lab02
 */
public class S07v2_01 {
        public static void main(String[] args) {
        // Creación de dos objetos de la clase Persona
        Persona1 persona1 = new Persona1();
        Persona1 persona2 = new Persona1();

        // Asignación de valores a los atributos
        persona1.nombre = "Juan";
        persona1.edad = 30;
        persona1.genero = "Masculino";

        persona2.nombre = "María";
        persona2.edad = 25;
        persona2.genero = "Femenino";

        // Uso de métodos
        System.out.println(persona1.obtenerInformacion());  // Imprime la información de persona1
        persona2.saludar();  // Imprime un saludo genérico de persona2
        persona1.saludar("¡Hola, amigo!");  // Imprime un saludo personalizado de persona1

        // Cambio de edad de persona2
        persona2.actualizarEdad(26);
        System.out.println("Nueva edad de María: " + persona2.obtenerEdad());
    }
}



