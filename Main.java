/**
 * Clase principal: crea objetos y demuestra las funciones de la aplicación.
 */
public class Main {
    public static void main(String[] args) {
        // Instanciación: se crean objetos usando el constructor de Estudiante.
        Estudiante e1 = new Estudiante("A001", "Ana López", "Informática", 92.5);
        Estudiante e2 = new Estudiante("A002", "Carlos Pérez", "Administración", 78.0);
        Estudiante e3 = new Estudiante("A003", "María Torres", "Informática", 55.5);

        // Se crea el objeto que administra el registro.
        GestorEstudiantes gestor = new GestorEstudiantes();

        // Se invocan métodos para agregar los objetos al registro.
        gestor.agregarEstudiante(e1);
        gestor.agregarEstudiante(e2);
        gestor.agregarEstudiante(e3);

        // Se intenta agregar una matrícula repetida para mostrar la validación.
        boolean agregado = gestor.agregarEstudiante(
            new Estudiante("A001", "Otro Nombre", "Diseño", 80.0)
        );
        System.out.println("¿Se agregó la matrícula repetida? " + agregado);
        System.out.println();

        // Se invoca el método para listar la información.
        System.out.println("=== LISTA DE ESTUDIANTES ===");
        gestor.listarEstudiantes();

        // Se demuestra la búsqueda por matrícula.
        System.out.println();
        System.out.println("=== BÚSQUEDA DE A002 ===");
        Estudiante encontrado = gestor.buscarPorMatricula("A002");
        if (encontrado != null) {
            System.out.println(encontrado.mostrarInformacion());
        } else {
            System.out.println("No se encontró el estudiante.");
        }

        System.out.println();
        System.out.println("Total de estudiantes registrados: " + gestor.cantidadEstudiantes());
    }
}
