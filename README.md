# Gestión de estudiantes — Actividad Formativa 2

**Estudiante:** Guadalupe Salazar Melchor  
**Lenguaje:** Java  
**Tipo:** Aplicación de consola orientada a objetos

## Descripción
Aplicación sencilla para registrar estudiantes, evitar matrículas duplicadas, buscar por matrícula y mostrar sus datos y estado académico.

## Requisitos
- JDK 17 o posterior (también puede funcionar con versiones modernas compatibles).
- Terminal o IDE como IntelliJ IDEA, Eclipse o NetBeans.

## Estructura
```text
IDS-ActF2-Guadalupe-Salazar-Melchor/
├── src/
│   ├── Estudiante.java
│   ├── GestorEstudiantes.java
│   └── Main.java
├── README.md
└── .gitignore
```

## Ejecutar desde una terminal
Abre una terminal en la carpeta del proyecto y ejecuta:

```bash
javac -encoding UTF-8 -d out src/Estudiante.java src/GestorEstudiantes.java src/Main.java
java -cp out Main
```

El programa imprime tres estudiantes de ejemplo, prueba el rechazo de una matrícula duplicada, lista los registros y busca la matrícula `A002`.

## Conceptos de programación orientada a objetos
- **Clases:** `Estudiante`, `GestorEstudiantes` y `Main`.
- **Atributos:** matrícula, nombre, carrera y promedio.
- **Constructor:** inicializa los atributos de cada estudiante.
- **Instanciación:** `new Estudiante(...)` crea objetos concretos.
- **Métodos:** `estaAprobado`, `mostrarInformacion`, `agregarEstudiante`, `buscarPorMatricula` y `listarEstudiantes`.
- **Encapsulamiento:** atributos privados y métodos de acceso.
- **Validación:** el promedio debe estar entre 0 y 100 y no se aceptan matrículas duplicadas.

## Subir el proyecto a GitHub
1. Inicia sesión o crea una cuenta en https://github.com/.
2. Crea un repositorio nuevo, por ejemplo `IDS-ActF2-Gestion-Estudiantes`. Puedes dejarlo vacío para evitar conflictos con los archivos locales.
3. En una terminal, dentro de esta carpeta, ejecuta:

```bash
git init
git add .
git commit -m "Primera versión: gestión de estudiantes"
git branch -M main
git remote add origin https://github.com/TU-USUARIO/IDS-ActF2-Gestion-Estudiantes.git
git push -u origin main
```

4. Sustituye `TU-USUARIO` por tu usuario de GitHub y usa la URL real que GitHub muestre para tu repositorio.
5. Abre el repositorio en el navegador y verifica que aparezcan los archivos. Copia el enlace real para incluirlo en el informe.

> No se ha creado ni publicado automáticamente un repositorio. Debes ejecutar los pasos anteriores con tu cuenta.

## Guion breve para la grabación
1. Presenta el objetivo de la aplicación.
2. Abre `Estudiante.java` y explica sus atributos, constructor y métodos.
3. Explica cómo `GestorEstudiantes` administra la lista y evita matrículas duplicadas.
4. Ejecuta `Main.java` y muestra la salida.
5. Abre el repositorio publicado en GitHub y explica cómo organizaste los archivos.
6. Menciona una posible mejora: añadir un menú interactivo o guardar datos en un archivo/base de datos.

## Referencias
Oracle. (s. f.). *Classes*. The Java Tutorials. https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html

Oracle. (s. f.). *Defining methods*. The Java Tutorials. https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html

GitHub Docs. (s. f.). *Quickstart for repositories*. https://docs.github.com/en/repositories/creating-and-managing-repositories/quickstart-for-repositories
