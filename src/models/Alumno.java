package models;

public class Alumno {
    private String nombre;
    private int matricula;
    private int contrasena;

    public Alumno() {
        this.nombre = this.nombre;
        this.matricula = matricula;
    }

    public Alumno(String nombre, int matricula, int contrasena) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }
    public int getMatricula() {
        return matricula;
    }
    public int getContrasena(){
        return contrasena;
    }
}
