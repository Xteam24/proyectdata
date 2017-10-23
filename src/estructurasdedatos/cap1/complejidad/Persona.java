/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap1.complejidad;

/**
 *
 * @author xteam
 */
  public class Persona {

    private int dato;
    private String tipodato;

    public Persona() {
       
    }

    /**
     * @return the dato
     */
    public int getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int dato) {
        this.dato = dato;
    }

    /**
     * @return the tipodato
     */
    public String getTipodato() {
        return tipodato;
    }

    /**
     * @param tipodato the tipodato to set
     */
    public void setTipodato(String tipodato) {
        this.tipodato = tipodato;
    }
}
