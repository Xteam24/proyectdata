/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.utiles.nodos;

/**
 *
 * @author tusk
 */
public class NodoEnteroSimple {

    
    private int valor;
    
    private NodoEnteroSimple siguiente;

 
    public void NodoEnteroSimple() {
        this.setValor(0);
        this.setSiguiente(null);
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * @return the siguiente
     */
    public NodoEnteroSimple getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoEnteroSimple siguiente) {
        this.siguiente = siguiente;
    }

    public void getSiguiente(Object object) {
        
    }
}
