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
public class NodoArbolAVL {
    private int valor;
    private int fe;
    private NodoArbolAVL hDerecho;
    private NodoArbolAVL hIzquierdo;
    
    public NodoArbolAVL(int valor){
    this.valor=valor;
    this.fe=0;
    this.hDerecho=null;
    this.hIzquierdo=null;    
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
     * @return the fe
     */
    public int getFe() {
        return fe;
    }

    /**
     * @param fe the fe to set
     */
    public void setFe(int fe) {
        this.fe = fe;
    }

    /**
     * @return the hDerecho
     */
    public NodoArbolAVL gethDerecho() {
        return hDerecho;
    }

    /**
     * @param hDerecho the hDerecho to set
     */
    public void sethDerecho(NodoArbolAVL hDerecho) {
        this.hDerecho = hDerecho;
    }

    /**
     * @return the hIzquierdo
     */
    public NodoArbolAVL gethIzquierdo() {
        return hIzquierdo;
    }

    /**
     * @param hIzquierdo the hIzquierdo to set
     */
    public void sethIzquierdo(NodoArbolAVL hIzquierdo) {
        this.hIzquierdo = hIzquierdo;
    }
}
