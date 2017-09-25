/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;

import estructurasdedatos.utiles.nodos.NodoEnteroSimple;

/**
 *
 * @author tusk
 */
public class ListaSimple {

    //indica a cabeza y la cola de la lista
    private NodoEnteroSimple head;
    private NodoEnteroSimple tail;
    //agrego para saber tamaño de la lista
    private int size;

    //constructor 
    public void ListaSimple() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean vacia() {
        return head == null;
    }

    //agrega nodo al final
    public void addend(int dato) {
        //agrega nuevo nodo 
        NodoEnteroSimple nodo = new NodoEnteroSimple();

        nodo.setValor(dato);

        if (vacia()) {

            head = nodo;
        } else {
            //un temporal de la lista 
            NodoEnteroSimple temp = head;

            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();

            }
            temp.getSiguiente();
        }
        size++;
    }

    // no al inicio 
    public void addini(int dato) {

        NodoEnteroSimple nodo = new NodoEnteroSimple();
        nodo.setValor(dato);

        if (vacia()) {
            head = nodo;
        } else {
            nodo.setSiguiente(head);
            head = nodo;
        }
        size++;
    }

    //Busca si esta el nodo
    public void listar() {

        if (!vacia()) {

            NodoEnteroSimple temp = head;

            int i = 0;

            while (temp != null) {

                System.out.print(i + ".[ " + temp.getValor() + " ]" + " ->  ");

                temp = temp.getSiguiente();

                i++;
            }
        }
                
    }

    public void editpos(int posicion, int valor) {

        if (posicion >= 0 && posicion < size) {

            if (posicion == 0) {

                head.setValor(valor);
            } else {

                NodoEnteroSimple temp = head;

                for (int i = 0; i < posicion; i++) {
                    temp = temp.getSiguiente();
                }
                // Alctualiza el valor del nodo.
                temp.setValor(valor);
            }
        }
    }

    public void deletenodo(int posicion) {

        if (posicion >= 0 && posicion < size) {

            if (posicion == 0) {

                head = head.getSiguiente();
            } else {

                NodoEnteroSimple temp = head;

                for (int i = 0; i < posicion - 1; i++) {
                    temp = temp.getSiguiente();
                }

                NodoEnteroSimple siguiente = temp.getSiguiente();

                temp.setSiguiente(siguiente.getSiguiente());
            }

            size--;
        }
    }

    public void addini() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addend() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void editpos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void ddeletenodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
