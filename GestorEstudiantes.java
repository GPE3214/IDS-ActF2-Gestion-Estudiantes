import java.util.ArrayList;
import java.util.List;

/**
 * Administra la colección de estudiantes y las operaciones principales.
 */
public class GestorEstudiantes {
    // ArrayList permite agregar estudiantes durante la ejecución.
    private final List<Estudiante> estudiantes;

    public GestorEstudiantes() {
        estudiantes = new ArrayList<>();
    }

    /**
     * Agrega un estudiante si su matrícula no está registrada.
     * Devuelve true si se agregó y false si ya existía.
     */
    public boolean agregarEstudiante(Estudiante estudiante) {
        if (buscarPorMatricula(estudiante.getMatricula()) != null) {
            return false;
        }
        estudiantes.add(estudiante);
        return true;
    }

    /**
     * Busca un estudiante por matrícula; devuelve null si no existe.
     */
    public Estudiante buscarPorMatricula(String matricula) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getMatricula().equalsIgnoreCase(matricula)) {
                return estudiante;
            }
        }
        return null;
    }

    /**
     * Muestra la información de todos los estudiantes registrados.
     */
    public void listarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.mostrarInformacion());
        }
    }

    public int cantidadEstudiantes() {
        return estudiantes.size();
    }
}
