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
public class NodoEntero {
    
    private int valor, llave;
    
    private NodoEntero siguiente;
    
    public void NodoEntero(){
        setValor(0);
        setLlave(0);
        setSiguiente(null);
        
        
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
     * @return the llave
     */
    public int getLlave() {
        return llave;
    }

    /**
     * @param llave the llave to set
     */
    public void setLlave(int llave) {
        this.llave = llave;
    }

    /**
     * @return the siguiente
     */
    public NodoEntero getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoEntero siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
