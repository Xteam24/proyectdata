/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.utiles.nodos;

import estructurasdedatos.cap1.complejidad.Persona;

/**
 *
 * @author xteam
 */
public class NodoPersona {
    private Persona dato;
    private NodoPersona siguiente;

    /**
     * @return the dato
     */
    public Persona getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Persona dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public NodoPersona getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoPersona siguiente) {
        this.siguiente = siguiente;
    }
}
