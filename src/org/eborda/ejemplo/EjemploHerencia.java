package org.eborda.ejemplo;

import org.eborda.pooherencia.*;

public class EjemploHerencia {

    public static void main(String[] args) {

        System.out.println("===== Creando la instancia de la clase Alumno =====");
        Alumno alumno = new Alumno();
        //Persona alumno = new Alumno(); en la clase hija no se pueden acceder a los atributos de la clase padre, a no ser que se haga un cast
        //Ej: ((Alumno)alumno).setInstitucion("Instituto Nacional");
        alumno.setNombre("Emerson");
        //cuando el modificador de acceso es protected en la clase padre alumno.nombre = "Emerson"; se accede de forma directa
        alumno.setApellido("Borda");
        alumno.setInstitucion("Instituto Nacional");
        alumno.setNotaLen(5.5);
        alumno.setNotaHist(6.3);
        alumno.setNotaMate(4.9);

        System.out.println("===== Creando la instancia de la clase AlumnoInternacional =====");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaLen(6.2);
        alumnoInt.setNotaHist(5.8);
        alumnoInt.setNotaMate(6.5);

        System.out.println("===== Creando la instancia de la clase Profesor =====");
        Profesor profesor = new Profesor();
        profesor.setNombre("Roberto");
        profesor.setApellido("Borda");
        profesor.setAsignatura("Matemáticas");

        System.out.println("==== - ====");

        System.out.println(alumno.getNombre()
                + " " + alumno.getApellido()
                + " " + alumno.getInstitucion());

        System.out.println("Profesor " + profesor.getAsignatura()
                + ": " + profesor.getNombre()
                + " " + profesor.getApellido());

        System.out.println(alumnoInt.getNombre()
        + " " + alumnoInt.getApellido()
        + " " + alumnoInt.getInstitucion()
        + " " + alumnoInt.getPais());

        //ITERAR EN LA JERARQUÍA DE CLASES
        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}
