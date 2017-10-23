/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap4.arboles;

import estructurasdedatos.utiles.nodos.NodoArbolB;

/**
 *
 * @author tusk
 */
public class ArbolB{
    NodoArbolB nodo = new NodoArbolB(1);
    private NodoArbolB raiz;
    
     
    public ArbolB (int valor){
    this.raiz = new NodoArbolB(valor);
    }
    public ArbolB(NodoArbolB raiz){
        this.raiz = raiz;
    }
    private void addNodoArbolB(NodoArbolB nodo,NodoArbolB raiz){
        if (raiz == null){
            this.setRaiz(nodo);
        }
        
    }    

    /**
     * @return the raiz
     */
    public NodoArbolB getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(NodoArbolB raiz) {
        this.raiz = raiz;
    }
    
    
    
    
    
    
    
    
    
    
    
}

    /**
     * @return the raiz
     */
    public NodoArbolB getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(NodoArbolB raiz) {
        this.raiz = raiz;
    }

    /**
     * @return the nodo
     */
    public NodoArbolB getNodo() {
        return nodo;
    }

    /**
     * @param nodo the nodo to set
     */
    public void setNodo(NodoArbolB nodo) {
        this.nodo = nodo;
    }
