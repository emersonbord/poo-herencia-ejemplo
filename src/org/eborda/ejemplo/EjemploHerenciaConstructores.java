package org.eborda.ejemplo;

import org.eborda.pooherencia.Alumno;
import org.eborda.pooherencia.AlumnoInternacional;
import org.eborda.pooherencia.Persona;
import org.eborda.pooherencia.Profesor;

public class EjemploHerenciaConstructores {

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
    //CONTROL DE TIPO MUESTRA LOS DATOS, FILTRANDO SEGÚN EL TIPO DE OBJETO, MOSTRATO INFO SOLAMENTE DE ESE TIPO, PRIMERO DE LO ESPECÍFICO A LO MÁS PARTICULAR
    public static void imprimir(Persona persona){//void no retorna nada, vamos a imprimir
        System.out.println("Imprimiendo datos en común del tipo Persona");
        System.out.println();
        System.out.println("nombre: " + persona.getNombre()
                + ", apellido: " + persona.getApellido()
                + ", edad: " + persona.getEdad()
                + ", email: " + persona.getEmail());
//aplicar filtro, utilizando control de tipos instanceOf
        if (persona instanceof Alumno){
            System.out.println("Imprimiendo los datos del tipo Alumno");
            System.out.println();
            System.out.println("Institución: " + ((Alumno) persona).getInstitucion()); //se hace el cast de aluymno
            System.out.println("Nota matemáticas: " + ((Alumno) persona).getNotaMate());
            System.out.println("Nota historia: " + ((Alumno) persona).getNotaHist());
            System.out.println("Nota lenguaje: " + ((Alumno) persona).getNotaLen());

            if (persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo los datos del timpo AlumnoInternacional: ");
                System.out.println();
                System.out.println("Imprimiendo los datos del tipo AlumnoInternacional: ");
                System.out.println("Nota idioma: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("País: " + ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("===== sobre escritura promedio ======");
            System.out.println("Promedio: "+ ((Alumno) persona).calcularPromedio());
            System.out.println("===== sobre escritura promedio ======");
        }

        if (persona instanceof Profesor){
            System.out.println("Imprimiendo los datos del tipo Profesor: ");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }
        System.out.println("====== sobrescritura saludar ======");
        System.out.println(persona.saludar());
    }
}
