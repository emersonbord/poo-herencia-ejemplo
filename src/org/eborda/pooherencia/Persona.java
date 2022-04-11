package org.eborda.pooherencia;
//NOTA: En java no se soporta la herencia multiple, una clase no puede heredar de varias clases al mismo tiempo, siempre una sola, Ej, extends Persona
/**Todo atributo protected en la clase padre, se pueden acceder en la clase hija*/
public class Persona {
//Protected se debe utilizar en package distintos, para que no se pueda acceder, manipular de forma directa
    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    public Persona(){
        System.out.println("Persona: inicializando constructor... ");
    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, int edad){
        this(nombre, apellido); //SOBRECARGA DE CONSTRUCTORES, reutilizamos el constructor de arriba con los 2 parámetros
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String saludar(){
        return "Hola que tal!!";
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'' +
                ", saludo= " + this.saludar();
    }
}
