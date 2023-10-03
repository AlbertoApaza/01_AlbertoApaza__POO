package S07v2_01AlbertoApaza;

public class Persona1 {
    // Atributos
    String nombre;
    int edad;
    String genero;

    public String obtenerInformacion() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Género: " + genero;
    }

    public void saludar() {
        System.out.println("¡Hola! Soy " + nombre);
    }

    public void saludar(String mensaje) {
        System.out.println("¡Hola! Soy " + nombre + ". " + mensaje);
    }

    public int obtenerEdad() {
        return edad;
    }

    public void actualizarEdad(int nuevaEdad) {
        edad = nuevaEdad;
    }
}

