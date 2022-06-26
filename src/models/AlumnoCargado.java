package models;

public class AlumnoCargado {
    private String nombre;
    private int matricula;
    private String materia;
    private String grupo;

    public AlumnoCargado(){
        this.nombre = nombre;
        this.matricula = matricula;
        this.materia = materia;
        this.grupo = grupo;
    }

    public AlumnoCargado(String nombre, int matricula, String materia, String grupo) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.materia = materia;
        this.grupo = grupo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getMateria() {
        return materia;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}
