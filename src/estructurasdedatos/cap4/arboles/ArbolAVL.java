/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap4.arboles;

import estructurasdedatos.utiles.nodos.NodoArbolAVL;

/**
 *
 * @author tusk
 */
public class ArbolAVL {
  private NodoArbolAVL raiz;
  public ArbolAVL(){
      raiz=null;
    }
    public NodoArbolAVL search(int dato,NodoArbolAVL r){
        if(raiz==null){
            return null;
        }else if(r.getValor()==dato){
            return r;
        }else if(r.getValor()<dato){
            return search(dato,r.gethDerecho());
        }else{
         return search(dato,r.gethIzquierdo());   
        }
    }      

//Factor de equilibrio
   public int fe(NodoArbolAVL x){
   if(x!=null){
       return -1;
    }else{
    return x.getFe();
  }
   }
}