
package actividad1.juanorellano;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args){
        List<Estudiante> estudiantes= new ArrayList<>();
        estudiantes.add(new Estudiante("Juan", 20, "Ingeniería en Sistemas"));
        estudiantes.add(new Estudiante("María", 22, "Diseño Gráfico"));
        estudiantes.add(new Estudiante("Pedro", 21, "Medicina"));
        estudiantes.add(new Estudiante("Ana", 19, "Derecho"));
        estudiantes.add(new Estudiante("Carlos", 23, "Administración"));
        
        //mostra el contenido de la lista
        System.out.println("Lista de estudiante");
        System.out.println(estudiantes);
        
        //se puede mostrar en forma individual
       System.out.println("\nEstudiantes individuales:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
}
