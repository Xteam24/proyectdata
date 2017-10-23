/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;

import estructurasdedatos.utiles.nodos.NodoPersona;

/**
 *
 * @author xteam
 */
public class ColaBanco {
    
    NodoPersona primero;
    NodoPersona ultimo;
    String tipoDato;
    
    public ColaBanco () {
        primero = null;
        ultimo = null;
    }
    public void listar(){
        NodoPersona recorre = primero;
        System.out.println("Fila Banco");
        while (recorre != null){
            System.out.println(recorre.getDato()+"\n");
            recorre = recorre.getSiguiente();
        }
     }
    
}
