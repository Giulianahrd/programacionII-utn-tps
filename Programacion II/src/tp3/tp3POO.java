/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author giu
 */


/**
// 1. Registro de Estudiantes
public class tp3POO {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Juan", "Pérez", "Programación", 85);

        estudiante1.mostrarInfo();

        estudiante1.subirCalificacion(5);

        estudiante1.bajarCalificacion(10);
    }
}

class Estudiante {

    private final String nombre;
    private final String apellido;
    private final String curso;
    private int calificacion;

    public Estudiante(String nombre, String apellido, String curso, int calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public void mostrarInfo() {
        System.out.println("Información del Estudiante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }

    public void subirCalificacion(int puntos) {
        this.calificacion += puntos;
        System.out.println("\nCalificación aumentada en " + puntos + " puntos.");
        System.out.println("Nueva calificación: " + this.calificacion);
    }

    public void bajarCalificacion(int puntos) {
        this.calificacion -= puntos;
        System.out.println("\nCalificación disminuida en " + puntos + " puntos.");
        System.out.println("Nueva calificación: " + this.calificacion);
    }
}



// 2. Registro de Mascotas
public class tp3POO {
    public static void main(String[] args) {
        Mascota miMascota = new Mascota("Hugo", "Conejo", 3);

        miMascota.mostrarInfo();

        miMascota.cumplirAnios();
        miMascota.mostrarInfo();
    }
}


class Mascota {
    String nombre;
    String especie;
    int edad;
    
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
 
    public void mostrarInfo() {
        System.out.println("\n--- Información de la mascota ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    public void cumplirAnios() {
        this.edad += 1;
        System.out.println(nombre + " cumplio años!");
    }
}




// 3. Encapsulamiento con la Clase Libro
public class tp3POO {
    public static void main(String[] args) {
        Libro miLibro = new Libro("Libro", "Autor", 1943);

        miLibro.mostrarInfo();

        miLibro.setAnioPublicacion(2030);

        miLibro.setAnioPublicacion(2005);
        
        miLibro.mostrarInfo();
    }
}

class Libro {
    String titulo;
    String autor;
    int anioPublicacion;
    
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion <= 2025) { 
            this.anioPublicacion = anioPublicacion;
            System.out.println("El año de publicación se actualizo a " + this.anioPublicacion);
        } else {
            System.out.println("El año de publicación es incorrecto");
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + anioPublicacion);
    }
}





// 4. Gestión de Gallinas en Granja Digital
public class tp3POO {
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina(1, 1, 0); // id: 1, edad: 1, huevos: 0
        Gallina gallina2 = new Gallina(2, 2, 5); // id: 2, edad: 2, huevos: 5

        System.out.println("--- Estado inicial de las gallinas ---");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();

        gallina1.ponerHuevo();
        gallina1.envejecer();
        
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.envejecer();

        System.out.println("\n--- Estado final de las gallinas ---");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}

class Gallina {
    int idGallina;
    int huevosPuestos;
    int edad;
        
    public Gallina(int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    public void ponerHuevo() {
        this.huevosPuestos++;
        System.out.println("La gallina " + this.idGallina + " puso un huevo.");
    }

    public void envejecer() {
        this.edad++;
        System.out.println("La gallina " + this.idGallina + " ahora tiene " + this.edad + " años.");
    }

    public void mostrarEstado() {
        System.out.println("Estado de la gallina " + idGallina + ":");
        System.out.println("  Edad: " + edad + " años");
        System.out.println("  Huevos puestos: " + huevosPuestos);
    }
}



// 5. Simulación de Nave Espacial

public class tp3POO {

    public static void main(String[] args) {
        NaveEspacial nave1 = new NaveEspacial("NAVE", 50);

        nave1.mostrarEstado();
        nave1.despegar();

        System.out.println("\n--- Intentando avanzar sin  combustible ---");
        nave1.avanzar(60);

        System.out.println("\n--- Cargando combustible ---");
        nave1.recargarCombustible(80); 
        nave1.recargarCombustible(25); 

        System.out.println("\n--- Avannzando con combustible suficiente ---");
        nave1.avanzar(60);

        nave1.mostrarEstado();
    }
}

class NaveEspacial {

    private String nombre;
    private int combustible;
    private static final int MAX_COMBUSTIBLE = 100;

    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = Math.min(combustibleInicial, MAX_COMBUSTIBLE);
        System.out.println("Nave '" + nombre + "' creada con " + this.combustible + " unidades de combustible.");
    }

    public void despegar() {
        System.out.println("La nave '" + nombre + "' ha despegado.");
    }

    public void avanzar(int distancia) {
        if (this.combustible >= distancia) {
            this.combustible -= distancia;
            System.out.println("La nave '" + nombre + "' ha avanzado " + distancia + " unidades.");
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " unidades. Combustible actual: " + this.combustible);
        }
    }

    public void recargarCombustible(int cantidad) {
        int nuevoCombustible = this.combustible + cantidad;
        if (nuevoCombustible > MAX_COMBUSTIBLE) {
            int recargado = MAX_COMBUSTIBLE - this.combustible;
            this.combustible = MAX_COMBUSTIBLE;
            System.out.println("Recarga limitada. Solo se recargaron " + recargado + " unidades. Combustible al máximo: " + this.combustible);
        } else {
            this.combustible = nuevoCombustible;
            System.out.println("Recargando " + cantidad + " unidades. Combustible actual: " + this.combustible);
        }
    }

    public void mostrarEstado() {
        System.out.println("\n--- Estado de la nave " + nombre + " ---");
        System.out.println("Combustible: " + combustible + " unidades.");
    }
}
*/
