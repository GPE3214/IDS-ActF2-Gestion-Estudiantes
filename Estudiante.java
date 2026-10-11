/**
 * Representa a un estudiante dentro de la aplicación.
 * Contiene sus datos básicos y métodos para consultarlos o actualizarlos.
 */
public class Estudiante {
    // Atributos privados: protegen los datos del objeto.
    private String matricula;
    private String nombre;
    private String carrera;
    private double promedio;

    /**
     * Constructor: inicializa un estudiante con sus datos.
     */
    public Estudiante(String matricula, String nombre, String carrera, double promedio) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrera = carrera;
        setPromedio(promedio);
    }

    // Métodos de acceso (getters).
    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    // Métodos de modificación (setters).
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * Valida que el promedio se encuentre en el rango de 0 a 100.
     */
    public void setPromedio(double promedio) {
        if (promedio < 0 || promedio > 100) {
            throw new IllegalArgumentException("El promedio debe estar entre 0 y 100.");
        }
        this.promedio = promedio;
    }

    /**
     * Devuelve true cuando el promedio es aprobatorio (60 o más).
     */
    public boolean estaAprobado() {
        return promedio >= 60;
    }

    /**
     * Presenta los datos del estudiante en una sola cadena.
     */
    public String mostrarInformacion() {
        return String.format(
            "Matrícula: %s | Nombre: %s | Carrera: %s | Promedio: %.1f | Estado: %s",
            matricula, nombre, carrera, promedio, estaAprobado() ? "Aprobado" : "No aprobado"
        );
    }
}
