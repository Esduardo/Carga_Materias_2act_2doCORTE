package models;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Login {
    static int  posicion = 0;
    static Scanner entrada = new Scanner(System.in);                    //listaAlumnos.get(i).getMatricula
    //------------------------------------------------------------------------------------------------------------------
    //                                          ARRAYLIST
    public static ArrayList<Alumno> lista() {
        ArrayList<Alumno> listaAlumnos = new ArrayList();
        listaAlumnos.add(new Alumno("Esduardo", 221214, 412122 ));
        listaAlumnos.add(new Alumno("Jissel", 221215, 512122));
        listaAlumnos.add(new Alumno("Alberto", 221216, 612122));
        listaAlumnos.add(new Alumno("John", 221217, 712122));
        listaAlumnos.add(new Alumno("Samantha", 221218, 812122));
        return listaAlumnos;
    }
    //------------------------------------------------------------------------------------------------------------------
    //                                                  INICIO DE SESION
    public static void iniciarSesion(){
        int opcion;
        do {
            System.out.println(">>>                 UP CHIAPAS                <<<"
                    + "\n**               Iniciar Sesion                **"
                    + "\n*                 1. Usuario                   *"
                    + "\n*                 2. Docente                    *"
                    + "\n*                 3. Salir                      *");
            System.out.printf("*                 opcion: ");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    Login.sesionAlumno(lista());
                    break;
                case 2:
                    Login.sesionDocente();
                    break;
                case 3:
                    System.out.print("Nos vemos byeee :)");
                    break;
                default: System.out.println("Esta opcion no existe >:|");
            }
        }while(opcion != 3);
    }
    //------------------------------------------------------------------------------------------------------------------
    //                                            SESIONES ALUMNO Y DOCENTE
    public static int sesionAlumno(ArrayList<Alumno> listaAlumnos) {
        int contrasena;
        int ingMatricula;
        System.out.println(">>>                 UP CHIAPAS                <<<");
        System.out.println(">                     Usuiario                  <");
        System.out.println(">          Ingresa matricula                    <");
        System.out.printf("*                       : ");
        ingMatricula = entrada.nextInt();
        for(int i = 0; i < listaAlumnos.size(); i++)
            if(listaAlumnos.get(i).getMatricula() == ingMatricula){
                posicion = i;
                System.out.println(">          Ingresa contrasena                   <");
                System.out.printf("*                      : ");
                contrasena = entrada.nextInt();
                if (listaAlumnos.get(i).getContrasena() == contrasena){
                    sesionOnAlumno(listaAlumnos, ingMatricula);
                }
                return ingMatricula;
            }
        return posicion;
        }

    public static void sesionDocente(){
        String nombreDocente, contrasena;
        System.out.println(">>>                 UP CHIAPAS                <<<");
        System.out.println(">                     Docente                   <");
        System.out.println(">               Ingresa Nombre                  <");
        System.out.printf("*                      : ");
        nombreDocente = entrada.next();
        if("Diana".equals(nombreDocente) ){
            System.out.println(">          Ingresa contrasena                   <");
            System.out.printf("*                      : ");
            contrasena = entrada.next();
            if("Diana123".equals(contrasena))
                sesionOnDocente(lista(), CargaMaterias.listaMaterias1, CargaMaterias.listaMateriasMan1);
        }
    }
    //-----------------------------------------------------------------------------------------------------------------
    //                                                  INICIO REALIZADO
    public static int sesionOnAlumno(ArrayList<Alumno> listaAlumnos, int ingMatricula) {
        int opc, opci;
        int ingMatricula1 = ingMatricula;
        do {
            System.out.println(">>>                    UP CHIAPAS                 <<<");
            System.out.println(">>>     Usuario: " + listaAlumnos.get(posicion).getNombre() +
                    "\n>>>      Matricula: " + listaAlumnos.get(posicion).getMatricula() +
                    "\n>                                                   <" +
                    "\n>       1.Realisar carga de materias?               <");
            System.out.println(">       2.Carga de materias Manual?                 <");
            System.out.println(">       3.Ver carga de materias                     <");
            System.out.println(">       4. Cerrar Sesion                            <");
            System.out.printf("*                      : ");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    CargaMaterias.registrarMaterias(ingMatricula1, posicion);
                    break;
                case 2:
                    do {
                        System.out.println(">       En verdad deseas hacer carga manual?:       <");
                        System.out.println(">                    1. SI                          <");
                        System.out.println(">                    2. Regresar                    <");
                        System.out.printf("*                      : ");
                        opci = entrada.nextInt();
                        switch (opci) {
                            case 1:
                                CargaMaterias.materiaManual(ingMatricula1);
                                break;
                            case 2:
                                System.out.println("OK! >:|");
                                sesionOnAlumno(listaAlumnos, ingMatricula);
                                break;
                            default:
                                System.out.println("Esta opcion no existe >:|");
                        }
                    } while (opci != 2);
                    sesionOnAlumno(listaAlumnos, ingMatricula);
                    break;
                case 3:
                    CargaMaterias.mostrarCarga();
                    break;
                case 4:
                    iniciarSesion();
                    break;
                default:
                    System.out.println("Esta opcion no existe >:|");
            }

        } while (opc != 4);
        return ingMatricula1;
    }

        public static void sesionOnDocente(ArrayList<Alumno> listaAlumnos, ArrayList<Materia1> listaMaterias1, ArrayList<MateriaMan1> listaMateriasMan1) {
            int buscar, opc, opc2;
            do {
                System.out.println(">>>                     UP CHIAPAS                <<<");
                System.out.println(">>>         Docente: Diana Beatriz                <<<");
                System.out.println(">>>            1. Buscar matricula                <<<");
                System.out.println(">              2. Cerrar Sesion                     <");
                System.out.printf("*                      : ");
                opc = entrada.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println(">>>            1. Buscar matricula            <");
                        System.out.printf("*                      : ");
                        buscar = entrada.nextInt();
                        for (int i = 0; i < listaAlumnos.size(); i++) {
                            if (listaAlumnos.get(i).getMatricula() == buscar)
                                System.out.printf("Alumno: " + listaAlumnos.get(i).getNombre() +
                                        "\nMatricula: " + listaAlumnos.get(i).getMatricula());
                            }
                            System.out.printf("\n>      ---------Materias cargadas------------       <\n");
                        Iterator<Materia1> iterador5 = CargaMaterias.listaMaterias1.iterator();
                        while(iterador5.hasNext()){
                            CargaMaterias.materia1 = iterador5.next();
                            System.out.println(CargaMaterias.materia1.getNombreMateria() + " " + CargaMaterias.materia1.getGrupo());
                        }
                            System.out.printf("\n> -----Solicitud Materias a cargar MANUALMENTE----- <\n");
                        Iterator<MateriaMan1> iterador6 = CargaMaterias.listaMateriasMan1.iterator();
                        while(iterador6.hasNext()){
                            CargaMaterias.materiaMan1 = iterador6.next();
                            System.out.println(CargaMaterias.materiaMan1.getNombreMateriaManual() + " " + CargaMaterias.materiaMan1.getGrupoMan());
                        }
                                    do {
                                        System.out.println(">>>         1. Hacer carga?              <<<");
                                        System.out.println(">>>         2. Regresar                  <<<");
                                        System.out.printf("*                      : ");
                                        opc2 = entrada.nextInt();
                                        switch (opc2) {
                                            case 1:
                                                do {
                                                    System.out.println(">>>         1. SI                        <<<");
                                                    System.out.println(">>>         2. NO                        <<<");
                                                    System.out.printf("*                      : ");
                                                    opc = entrada.nextInt();
                                                    switch (opc) {
                                                        case 1:
                                                            CargaMaterias.cargaMaster();
                                                            break;
                                                        case 2:
                                                            CargaMaterias.noCarga();
                                                            break;
                                                        default:
                                                            System.out.println("Esta opcion no existe >:|");
                                                    }
                                                } while (opc != 2);
                                                break;
                                            case 2:
                                                sesionOnDocente(listaAlumnos, listaMaterias1, listaMateriasMan1);
                                                break;
                                            default:
                                                System.out.println("Esta opcion no existe >:|");
                                        }
                                    } while (opc2 != 2);
                        break;
                    case 2:
                        iniciarSesion();
                        break;
                    default:
                        System.out.println("Esta opcion no existe >:|");
                }
            }while (opc != 2);
        }
    //------------------------------------------------------------------------------------------------------------------
}
