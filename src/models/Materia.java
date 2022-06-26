package models;

public class Materia {
    private String nombreMateria;
    private String grupo;


    public Materia() {
        this.nombreMateria = nombreMateria;
        this.grupo = grupo;
    }

    public Materia(String nombreMateria, String grupo) {
        this.nombreMateria = nombreMateria;
        this.grupo = grupo;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}
