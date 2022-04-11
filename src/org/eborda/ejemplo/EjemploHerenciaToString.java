package org.eborda.ejemplo;

import org.eborda.pooherencia.Alumno;
import org.eborda.pooherencia.AlumnoInternacional;
import org.eborda.pooherencia.Persona;
import org.eborda.pooherencia.Profesor;

public class EjemploHerenciaToString {

    public static void main(String[] args) {

        System.out.println("===== Creando la instancia de la clase Alumno =====");
        Alumno alumno = new Alumno("Emerson", "Borda", 27, "Instituto nacional");
        alumno.setNotaLen(5.5);
        alumno.setNotaHist(6.3);
        alumno.setNotaMate(4.9);
        alumno.setEmail("emerson@gmail.com");

        System.out.println("===== Creando la instancia de la clase AlumnoInternacional =====");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaLen(6.2);
        alumnoInt.setNotaHist(5.8);
        alumnoInt.setNotaMate(6.5);
        alumnoInt.setEmail("peter@email.com");

        System.out.println("===== Creando la instancia de la clase Profesor =====");
        Profesor profesor = new Profesor("Roberto", "Borda", "Matematicas");
        profesor.setEdad(67);
        profesor.setEmail("roberto@gmail.com");

        System.out.println("==== - ====");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

    }
    public static void imprimir(Persona persona){
        System.out.println("=======================");
        System.out.println(persona);

    }
}
