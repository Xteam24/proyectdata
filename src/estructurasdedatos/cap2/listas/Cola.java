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
public class Cola {

    private NodoEnteroSimple head;
    private NodoEnteroSimple tail;
    int dato;

    public Cola() {
        head = null;
        tail = null;
    }

    public void insert(int dato) {
        NodoEnteroSimple nodo = new NodoEnteroSimple();
        nodo.setValor(dato);
        if (head == null){
            head = nodo;
        }else{
            tail.setSiguiente(nodo);
        }
        tail = nodo;
    }
    public void list() {
        NodoEnteroSimple recorre = head;
        System.out.println("Se muestar los elementos de la cola como saldrian");
        while (recorre != null) {
            System.out.print(recorre.getValor()+"-");
            recorre = recorre.getSiguiente();
        }
     }
    public void remove () {
        NodoEnteroSimple temp = head;
        head = head.getSiguiente();
    }
    public void hacercola(){
        
    }
}
