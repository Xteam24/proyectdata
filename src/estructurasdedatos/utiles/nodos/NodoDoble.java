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
public class NodoDoble {

    private Integer dato;
    private NodoDoble siguiente;
    private NodoDoble anterior;

    /**
     * @return the dato
     */
    public Integer getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Integer dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public NodoDoble getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoDoble getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

    public void getSiguiente(NodoDoble nodo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getAnterior(NodoDoble temp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getValor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
