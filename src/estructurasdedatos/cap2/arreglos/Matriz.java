/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.arreglos;

/**
 *
 * @author tusk
 */
public class Matriz {

    public static Matriz mimatriz;

    int tFilas;
    int tColumnas;
    int matriz[][];

    public Matriz(int nFilas, int nColumnas) {

        this.tFilas = nFilas;
        this.tColumnas = nColumnas;
        this.matriz = new int[nFilas][nColumnas];
    }

    public Matriz() {

    }

    public void insert(int fila, int columna, int dato) {

        if (fila > tFilas || columna > tColumnas) {
            System.out.println("Error valor insertado no valido");
        } else {
            this.matriz[fila][columna] = dato;
        }
    }

    public void show() {
        for (int i = 0; i <= tFilas; i++) {
            for (int j = 0; j <= tColumnas; j++) {

                System.out.println(this.matriz[i][j]);
            }
        }
    }

    public int search(int fila, int columna) {

        if (fila > tFilas || fila < 0 || columna > tColumnas || columna < 0) {
            System.out.println("Error valor no valido");
        }
        return this.matriz[fila][columna];
    }

    public void update(int dato, int fila, int columna) {

        if (fila > tFilas || fila < 0 || columna > tColumnas || columna < 0) {
            System.out.println("Error valor no valido");
        } else {
            this.matriz[fila][columna] = dato;
        }
    }

    public void delete(int fila, int columna) {

        if (fila > tFilas || fila < 0 || columna > tColumnas || columna < 0) {
            System.out.println("Error valor no valido");
        } else {
            this.matriz[fila][columna] = 0;
        }
    }

}
