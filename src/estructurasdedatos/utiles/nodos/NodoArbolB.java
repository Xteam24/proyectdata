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
    
    private NodoArbolB hijoIzquierdo;
    private NodoArbolB hijoDerecho;
    
    public NodoArbolB (int valor){
     this.hijoDerecho=null;
     this.hijoIzquierdo=null;
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
