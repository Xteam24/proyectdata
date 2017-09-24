/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos;

import estructurasdedatos.cap1.complejidad.Ciclos;
import estructurasdedatos.cap1.complejidad.Condicionales;
import estructurasdedatos.cap1.complejidad.EjerciciosComplejidad;
import java.util.Scanner;
import estructurasdedatos.cap2.arreglos.Matriz;
import estructurasdedatos.cap2.arreglos.Vector;
import estructurasdedatos.cap2.listas.ListaDoble;
import estructurasdedatos.cap2.listas.ListaSimple;
import estructurasdedatos.cap2.listas.Pila;

/**
 *
 * @author tusk
 */
public class EstructurasDeDatos {

    /**
     * @param args the command line arguments
*/
    public static void main(String[] args) {
        Ciclos ejerciciociclo1 = new Ciclos();
        Ciclos ejerciciociclo2 = new Ciclos();
        Ciclos ejerciciociclo3 = new Ciclos();
        Ciclos ejerciciociclo4 = new Ciclos();
        Condicionales ejerciciocondicionales = new Condicionales();
        Condicionales ejerciciocondicionales2 = new Condicionales();
        Condicionales ejerciciocondicionales3 = new Condicionales();
        EjerciciosComplejidad complejidad2 = new EjerciciosComplejidad();
        EjerciciosComplejidad complejidad1 = new EjerciciosComplejidad();
        EjerciciosComplejidad complejidad3 = new EjerciciosComplejidad();
        Matriz miMatriz = new Matriz();
        Vector miVector = new Vector();
        ListaSimple miLista = new ListaSimple();
        ListaDoble listaDoble = new ListaDoble();
        Pila pila = new Pila();
        
        Scanner inicio = new Scanner(System.in);
        int menu;
        System.out.println("Elija por favor una opcion:");
        System.out.println("1. Complejidad     2. tipos de datos\n3. Arreglos        4. Listas\n5. Lista Doble        6. Pila  ");
        menu = inicio.nextInt();

        switch (menu) {

            case 1:
                //ejerciciociclo1.setfibonacci(3);
                //ejerciciociclo2.set1al100(0);
                //ejerciciociclo3.setnumpar(0);
                //ejerciciociclo4.settablamulti(0, 0);

                //
                //ejerciciocondicionales.setparescuantos(0, 0, 0);
                //ejerciciocondicionales.setpares();
                //ejerciciocondicionales.setnumeros();
                //complejidad1.SetComplejidad1();
                //complejidad2.SetComplejidad2(0,200);
                //complejidad3.SetComplejidad3(0, 0); 
                break;
            case 2:
                break;

            case 3:

                miMatriz.insert(3, 4, 2);
                miMatriz.show();
                miMatriz.update(3, 2, 2);
                miMatriz.delete(3, 2);
                break;
            case 4:
            {
        int submenu;        
        System.out.println("Elija por favor una opcion:");
        System.out.println("1. insertar al final     2. insertar al inicio\n3. listar             4. modificar\n5.Borar ");
        submenu = inicio.nextInt();
            switch(submenu){
        case 1:
            miLista.addini();
            break;
        case 2:
            miLista.addend();
            break;
        case 3:
            miLista.listar();
            break;
        case 4:
            miLista.editpos();
            break;
        case 5:
            miLista.ddeletenodo();
            break;
       }
                break;
            }
            case 5:
        int menudoble;        
        System.out.println("Elija por favor una opcion:");
        System.out.println("1. insertar al final     2. Listar\n3. Buscar             4. modificar\n5.Borar ");
        menudoble = inicio.nextInt();
            switch(menudoble) {
                
                case 1:
               listaDoble.addend();
                break;
                case 2:
                listaDoble.listar();
               break;
                case 3:
                listaDoble.search();
                break;
                case 4:
                listaDoble.delete();
                break;
           }   
            case 6:
             pila.insert(3);
             pila.insert(2);
             pila.insert(1);
             pila.list();
             
             break;
    }

    //private static void swicht(int menu) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
