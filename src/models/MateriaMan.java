package models;

public class MateriaMan {
    private String nombreMateriaManual;
    private String grupoMan;

    public MateriaMan(){
        this.nombreMateriaManual = nombreMateriaManual;
        this.grupoMan = grupoMan;
    }

    public MateriaMan(String nombreMateriaManual, String grupoMan) {
        this.nombreMateriaManual = nombreMateriaManual;
        this.grupoMan = grupoMan;
    }

    public String getNombreMateriaManual() {
        return nombreMateriaManual;
    }

    public String getGrupoMan() {
        return grupoMan;
    }

    public void setNombreMateriaManual(String nombreMateriaManual) {
        this.nombreMateriaManual = nombreMateriaManual;
    }

    public void setGrupoMan(String grupoMan) {
        this.grupoMan = grupoMan;
    }
}
