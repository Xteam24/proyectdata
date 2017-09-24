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
public class Pila {

    private NodoEnteroSimple last;
    private int dato;

    public Pila() {
        last = null;
    }

    public void insert(int dato) {
        NodoEnteroSimple nodo = new NodoEnteroSimple();
        nodo.setValor(dato);
        if (last == null) {
            nodo.setSiguiente(null);
            last = nodo;
        } else {
            nodo.setSiguiente(last);
            last = nodo;
        }
    }

    public void list() {
        NodoEnteroSimple recorre = last;
        System.out.println("Se muestar los elementos de la pila");
        while (recorre != null) {
            System.out.print(recorre.getValor()+"-");
            recorre = recorre.getSiguiente();
        }
     }
    

}
