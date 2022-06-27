package models;

public class MateriaMan1 {
    private int posicionMan;
    private String nombreMateriaManual;
    private String grupoMan;

    public MateriaMan1(){
        this.nombreMateriaManual = nombreMateriaManual;
        this.grupoMan = grupoMan;
        this.posicionMan = posicionMan;
    }

    public MateriaMan1(String nombreMateriaManual, String grupoMan, int posicion) {
        this.nombreMateriaManual = nombreMateriaManual;
        this.grupoMan = grupoMan;
        this.posicionMan = posicion;
    }

    public String getNombreMateriaManual() {
        return nombreMateriaManual;
    }

    public String getGrupoMan() {
        return grupoMan;
    }

    public int getPosicionMan() {
        return posicionMan;
    }

    public void setNombreMateriaManual(String nombreMateriaManual) {
        this.nombreMateriaManual = nombreMateriaManual;
    }

    public void setGrupoMan(String grupoMan) {
        this.grupoMan = grupoMan;
    }

    public void setPosicionMan(int posicion) {
        this.posicionMan = posicion;
    }
}
