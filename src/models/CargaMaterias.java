package models;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class CargaMaterias {
    static Scanner entrada = new Scanner(System.in);
        static ArrayList<Materia> listaMaterias = new ArrayList();
        static Materia materia;
        static ArrayList<MateriaMan> listaMateriasMan = new ArrayList();
        static MateriaMan materiaMan;

    public static void registrarMaterias(){
        int cantidad;
        String nombreMat, grupo;
        do {
            System.out.println(">>> Materia que deseas realizar carga (maximo 7)    <");
            System.out.print(">>>                     >> : ");
            cantidad = entrada.nextInt();
        }while (cantidad >= 8 || cantidad <= 0);
                for(int i = 1; i <= cantidad; i++){
                    System.out.print(">>>                 Nombre: ");
                    nombreMat = entrada.next();
                    System.out.print(">>>       Grupo de materia: ");
                    grupo = entrada.next();
                    materia = new Materia();
                    materia.setNombreMateria(nombreMat);
                    materia.setGrupo(grupo);
                    listaMaterias.add(materia);
                }
    }

    public static void materiaManual() {
        int cantidad;
        String nombreMatMan, grupoMan;
        System.out.println("Carga de materias Manual");
        do {
            System.out.println(">>> Materia que deseas realizar carga MANUAL (maximo 7)    <");
            System.out.print(">>>                     >> : ");
            cantidad = entrada.nextInt();
        } while (cantidad >= 8 || cantidad <= 0);
        for (int i = 1; i <= cantidad; i++) {
            System.out.print(">>>                 Nombre: ");
            nombreMatMan = entrada.next();
            System.out.print(">>>       Grupo de materia: ");
            grupoMan = entrada.next();
            materiaMan = new MateriaMan();
            materiaMan.setNombreMateriaManual(nombreMatMan);
            materiaMan.setGrupoMan(grupoMan);
            listaMateriasMan.add(materiaMan);
            }
    }
    public static void mostrarCarga(){
        System.out.println(">      ---------Materias cargadas------------       <\n");
        Iterator<Materia> iterador1 = listaMaterias.iterator();
        while(iterador1.hasNext()){
            materia = iterador1.next();
            System.out.println(materia.getNombreMateria() + " " + materia.getGrupo());
        }
        System.out.println("> ---------Materias cargadas MANUALMENTE----------- <");
        Iterator<MateriaMan> iterador = listaMateriasMan.iterator();
        while(iterador.hasNext()){
            materiaMan = iterador.next();
            System.out.println(materiaMan.getNombreMateriaManual() + " " + materiaMan.getGrupoMan());
        }
    }
    public static void cargaMaster(){
        System.out.println(">>>                     UP CHIAPAS                <<<");
        System.out.println(">>>                 Carga Completada              <<<");
        for (int i = 1; i <= listaMateriasMan.size(); i++) {
            materia.setNombreMateria(listaMateriasMan.get(i).getNombreMateriaManual());
            materia.setGrupo(listaMateriasMan.get(i).getGrupoMan());
            listaMaterias.add(materia);
        }
        listaMateriasMan.clear();
    }
    public static void noCarga(){
        String texto;
        System.out.println(">>>                     UP CHIAPAS                <<<");
        System.out.print(">>> ¿porque?: ");
        texto = entrada.nextLine();
        materia = new Materia();
        materia.setNombreMateria(texto);
        listaMaterias.add(materia);
        Login.sesionOnDocente(Login.lista(), listaMaterias, listaMateriasMan);
    }
}
