
package actividad1.juanorellano;

public class Persona {
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return "nombre='"+ nombre + " edad=" + edad;
    }
}
