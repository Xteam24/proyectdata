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
public class NodoArbolB {
    
    private int valor;
    
    private NodoArbolB padre;
    private NodoArbolB hijoIzquierdo;
    private NodoArbolB hijoDerecho;
    
    public NodoArbolB (int valor){
    
     this.valor = valor;
    }

    public NodoArbolB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
     * @return the padre
     */
    public NodoArbolB getPadre() {
        return padre;
    }

    /**
     * @param padre the padre to set
     */
    public void setPadre(NodoArbolB padre) {
        this.padre = padre;
    }

    /**
     * @return the hijoIzquierdo
     */
    public NodoArbolB getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    /**
     * @param hijoIzquierdo the hijoIzquierdo to set
     */
    public void setHijoIzquierdo(NodoArbolB hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    /**
     * @return the hijoDerecho
     */
    public NodoArbolB getHijoDerecho() {
        return hijoDerecho;
    }

    /**
     * @param hijoDerecho the hijoDerecho to set
     */
    public void setHijoDerecho(NodoArbolB hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }
    
    
    
    
    
    
    
    
    
    
}
