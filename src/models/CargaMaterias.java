package models;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class CargaMaterias {
    static Scanner entrada = new Scanner(System.in);
    //------------------------------------------------------------------------------------------------------------------
    //                                          ARRAYLIST
    static ArrayList<Materia1> listaMaterias1 = new ArrayList();
    static Materia1 materia1;

    static ArrayList<MateriaMan1> listaMateriasMan1 = new ArrayList();
    static MateriaMan1 materiaMan1;
    //------------------------------------------------------------------------------------------------------------------
    public static void registrarMaterias(int ingMatricula1, int posicion) {
            int cantidad;
            String nombreMat, grupo;

            do {
                System.out.println(">>> Materia que deseas realizar carga (maximo 7)    <");
                System.out.print(">>>                     >> : ");
                cantidad = entrada.nextInt();
            } while (cantidad >= 8 || cantidad <= 0);
            for(int i = 1; i <= cantidad; i++) {
                System.out.print(">>>                 Nombre: ");
                nombreMat = entrada.next();
                System.out.print(">>>       Grupo de materia: ");
                grupo = entrada.next();
                materia1 = new Materia1();
                materia1.setNombreMateria(nombreMat);
                materia1.setGrupo(grupo);
                listaMaterias1.add(materia1);
            }
        }

        public static void materiaManual(int ingMatricula1){
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
                    materiaMan1 = new MateriaMan1();
                    materiaMan1.setNombreMateriaManual(nombreMatMan);
                    materiaMan1.setGrupoMan(grupoMan);
                    listaMateriasMan1.add(materiaMan1);
            }
            Login.sesionOnAlumno(Login.lista(), ingMatricula1);
        }
        //------------------------------------------------------------------------------------------------------------------
        //                                                CARGAS
        public static void mostrarCarga() {
            System.out.println("> ---------      Materias cargadas      ----------- <");
            Iterator<Materia1> iterador = listaMaterias1.iterator();
            while(iterador.hasNext()){
                materia1 = iterador.next();
                System.out.println(materia1.getNombreMateria() + " " + materia1.getGrupo());
            }
            System.out.println("\n> ---------Materias cargadas MANUALMENTE----------- <");
            Iterator<MateriaMan1> iterador2 = listaMateriasMan1.iterator();
                while(iterador2.hasNext()){
                    materiaMan1 = iterador2.next();
                    System.out.println(materiaMan1.getNombreMateriaManual() + " " + materiaMan1.getGrupoMan());
                }
        }
        public static void cargaMaster() {
        int cantidad;
        String nombreMat, grupo;
            System.out.println(">>>                     UP CHIAPAS                <<<");
            do {
                System.out.println(">>> carga MANUAL (cantidad)    <");
                System.out.print(">>>                     >> : ");
                cantidad = entrada.nextInt();
            } while (cantidad >= 8 || cantidad <= 0);
            for (int h = 1; h <= cantidad; h++) {
                    System.out.print(">>>                 Nombre: ");
                    nombreMat = entrada.next();
                    System.out.print(">>>       Grupo de materia: ");
                    grupo = entrada.next();
                    materia1 = new Materia1();
                    materia1.setNombreMateria(nombreMat);
                    materia1.setGrupo(grupo);
                    listaMaterias1.add(materia1);
                }
                System.out.println(">>>                 Carga Completada              <<<");
                System.out.println("> ---------      Materias cargadas      ----------- <");
                Iterator<Materia1> iterador3 = listaMaterias1.iterator();
                while (iterador3.hasNext()) {
                    materia1 = iterador3.next();
                    System.out.println(materia1.getNombreMateria() + " " + materia1.getGrupo());
                }
                listaMateriasMan1.clear();
            }
        public static void noCarga () {
            String texto;
            System.out.println(">>>                     UP CHIAPAS                <<<");
            System.out.print(">>> ¿porque?: ");
            texto = entrada.next();
            materia1 = new Materia1();
            materia1.setNombreMateria(texto);
            listaMaterias1.add(materia1);
        }
}