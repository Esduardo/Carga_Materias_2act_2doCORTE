package models;

public class Materia1 {
    private String nombreMateria;
    private String grupo;
    private int posicion;


    public Materia1() {
        this.nombreMateria = nombreMateria;
        this.grupo = grupo;
        this.posicion = posicion;
    }

    public Materia1(String nombreMateria, String grupo, int posicion) {
        this.nombreMateria = nombreMateria;
        this.grupo = grupo;
        this.posicion = posicion;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public String getGrupo() {
        return grupo;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}
