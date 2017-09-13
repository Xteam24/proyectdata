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
public class Vector {

    Integer vector[];
    int tFilas;

    public Vector(int nFilas) {

        this.tFilas = nFilas;
        this.vector = new Integer[nFilas];
    }

    public Vector() {

    }

    public void insert(int fila, int dato) {

        if (fila > tFilas || fila > 0) {
            System.out.println("Error valos no valido");
        } else {
            this.vector[fila] = dato;
        }
    }

    public void show() {
        for (int i = 0; i <= tFilas; i++) {
            System.out.println(this.vector[i]);
        }
    }

    public void update(int dato, int fila) {

        if (fila > tFilas || fila < 0) {
            System.out.println("Error valor no valido");
        } else {
            this.vector[fila] = dato;
        }
    }

    public void delete(int dato, int fila) {

        if (fila > tFilas || fila < 0) {
            System.out.println("Error valor no valido");
        } else {
            this.vector[fila] = null;
        }
    }

    public void order() {
        for (int i = 0; i < tFilas; i++) {
            for (int j = i + 1; j < tFilas; j++) {

                if (this.vector[i] > this.vector[j]) {
                    int tem = vector[i];
                    this.vector[i] = vector[j];
                    this.vector[j] = tem;
                }
            }
        }
    }

    public void buscar(int dato) {

        if (dato <= (tFilas / 2)) {
            for (int i = 0; i <= (tFilas / 2); i++) {
                if (this.vector[i] == dato) {
                    System.out.println("La ubicaciòn que busca es " + i);
                }
            }
        } else {
            for (int i = (tFilas / 2); i <= tFilas; i++) {
                if (this.vector[i] == dato) {
                    System.out.println("La ubicaciòn es :" + i);
                }
            }
        }
    }

}
