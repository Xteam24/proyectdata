/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;

import estructurasdedatos.utiles.nodos.NodoDoble;
import java.util.Objects;

/**
 *
 * @author tusk
 */
public class ListaDoble {

    private NodoDoble head;
    private NodoDoble tail;

    //Constructor
    public void ListaDoble() {
        this.setHead(null);
        this.setTail(null);

    }

    public void addend(int dato) {
        NodoDoble nodo = new NodoDoble();
        nodo.setDato(dato);
        if (getHead().getSiguiente() == null) {

            setHead(nodo);
        } else {
            NodoDoble temp = getHead();
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.getSiguiente(nodo);
            nodo.getAnterior(temp);

        }
    }

    public void listar() {

        if (getHead() == null) {

            NodoDoble temp = getHead();

            int i = 0;

            while (temp != null) {

                System.out.print(i + ".[ " + temp.getValor() + " ]" + " ->  ");

                temp = temp.getSiguiente();

                i++;
            }
        }
    }

    public NodoDoble search(Integer dato) {
        NodoDoble temp = getHead();
        while ((!Objects.equals(temp.getDato(), dato)) && (temp != null)) {
            temp = temp.getSiguiente();
        }
        if (temp != null) {
            return temp;
        } else {
            return null;
        }

    }

    public void delete(Integer dato) {
        if (getHead() != null) {
            NodoDoble temp = getHead();
            NodoDoble ant = null;
            while (temp != null) {
                if (Objects.equals(temp.getDato(), dato)) {
                    if (ant == null) {
                        setHead(getHead().getSiguiente());
                        temp.getSiguiente(null);
                        temp = getHead();

                    } else {
                        ant.setSiguiente(temp.getSiguiente());
                        temp.setSiguiente(null);
                        temp = ant.getSiguiente();
                    }
                } else {
                    ant = temp;
                    temp = temp.getSiguiente();
                }
            }
        }

    }

    /**
     * @return the head
     */
    public NodoDoble getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(NodoDoble head) {
        this.head = head;
    }

    /**
     * @return the tail
     */
    public NodoDoble getTail() {
        return tail;
    }

    /**
     * @param tail the tail to set
     */
    public void setTail(NodoDoble tail) {
        this.tail = tail;
    }

    public void addend() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void search() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
