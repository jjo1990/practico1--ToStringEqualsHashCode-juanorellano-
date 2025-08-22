
package actividad1.juanorellano;


public class Estudiante extends Persona{
    
    private String carrera;

    public Estudiante() {
    }

    // Constructor
    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad); // Llama al constructor de la clase padre
        this.carrera = carrera;
    }
    

    @Override
    public String toString(){
        return "Estudiante{" + super.toString() + ", carrera='" + carrera + "'}";
    }
    
    
}
