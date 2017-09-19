/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;

import estructurasdedatos.utiles.nodos.NodoDoble;

/**
 *
 * @author tusk
 */
public class ListaDoble {

    private NodoDoble head;
    private NodoDoble tail;
    
    //Constructor
    public void ListaDoble() {
        this.head = null;
        this.tail = null;
        

    }

    public void addend(int dato) {
        NodoDoble nodo = new NodoDoble();
        nodo.setDato(dato);
        if (head.getSiguiente() == null) {

            head = nodo;
        } else {
            NodoDoble temp = head;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.getSiguiente(nodo);
            nodo.getAnterior(temp);

        }
    }
    
    public void listar() {

        if (head == null) {

            NodoDoble temp = head;

            int i = 0;

            while (temp != null) {

            System.out.print(i + ".[ " + temp.getValor() + " ]" + " ->  ");

            temp = temp.getSiguiente();

            i++;
         }
       }
    }
   public NodoDoble search(int dato){
        NodoDoble temp = head;
        while(temp.getDato()!=dato && temp != null){
            temp=temp.getSiguiente();
        }
        if(temp != null){
            return temp;
        }else{
            return null;
        }
        
    }}
