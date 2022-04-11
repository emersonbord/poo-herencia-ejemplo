package org.eborda.pooherencia;

public class Alumno extends Persona{

    private String institucion;
    private double notaMate;
    private double notaLen;
    private double notaHist;

    public Alumno(){
        //super(); //Invoco el constructor del padre. Si no existe, lo hace de igual modo detrás de escena como constructor vacío, y debe ser la primera sentencia, debe ir arriba, como primera instancia
        System.out.println("Alumno: inicializando constructor...");
    }

    public Alumno(String nombre, String apellido){
        super(nombre, apellido); //CON SUPER HAGO REFERENCIA AL CONSTRUCTOR DEL PADRE. Aquí utilizo los atributos, y en la clase padre se almacenan
    }

    public Alumno(String nombre, String apellido, int edad){
        super(nombre,apellido,edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion){
        super(nombre, apellido, edad); //LE PASAMOS los atributos AL PADRE
        this.institucion = institucion;
    }

    public Alumno(String nombre, String apellido, int edad,
                  String institucion, double notaMate,
                  double notaHist, double notaLen){
        this(nombre, apellido, edad, institucion);
        this.notaMate = notaMate;
        this.notaLen = notaLen;
        this.notaHist = notaHist;

    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMate() {
        return notaMate;
    }

    public void setNotaMate(double notaMate) {
        this.notaMate = notaMate;
    }

    public double getNotaLen() {
        return notaLen;
    }

    public void setNotaLen(double notaLen) {
        this.notaLen = notaLen;
    }

    public double getNotaHist() {
        return notaHist;
    }

    public void setNotaHist(double notaHist) {
        this.notaHist = notaHist;
    }

    @Override
    public String saludar(){
        String saludar = super.saludar();
        return saludar + " soy alumno y mi nombre es " + getNombre();
    }

    public double calcularPromedio(){
        //System.out.println("Calcular promedio "+ Alumno.class.getCanonicalName());
        return (notaHist + notaLen + notaMate) / 3;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ninstitucion='" + institucion + '\'' +
                ", notaMate=" + notaMate +
                ", notaLen=" + notaLen +
                ", notaHist=" + notaHist +
                ", promedio=" + this.calcularPromedio();
    }
}
