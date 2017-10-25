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
    
    private NodoArbolB raiz;
    
  public ArbolB() {
        raiz = null;         
    }
    
    public boolean esvacia(){
        return getRaiz() == null;
    }
    
    public void addNodoArbolB(int valor){
       NodoArbolB nodo = new NodoArbolB(valor);
       if(esvacia()){
            setRaiz(nodo);
       }
       else{
           NodoArbolB temp=getRaiz();
           NodoArbolB padre;
           while(true){
               padre=temp;
               if(valor<temp.getValor()){
                   temp=temp.getHijoIzquierdo();
                   if(temp==null){
                       padre.setHijoIzquierdo(nodo);
                       return;
                   }
               }
               else{
                   temp=temp.getHijoDerecho();
                   if(temp==null){
                       padre.setHijoDerecho(nodo);
                       return;
                   }
               }
           }
       }
    
    
    }
    // Metodos de ordenamiento Preorden,Orden y postorden
    public void preorden(NodoArbolB ra){
        if(ra != null){
            System.out.println(ra.getValor());
            preorden(ra.getHijoIzquierdo());
            preorden(ra.getHijoDerecho());
        }
    }
    public void orden (NodoArbolB raiz){
        if(raiz != null){
            orden(raiz.getHijoIzquierdo());
            System.out.println(raiz.getValor());
            orden(raiz.getHijoDerecho());
        }
    }
    public void postorden(NodoArbolB raiz){
        if(raiz!=null){
            postorden(raiz.getHijoIzquierdo());
            postorden(raiz.getHijoDerecho());
            System.out.println(raiz.getValor());
        } 
    }
     public int altura (NodoArbolB nodo){ 
	if (esvacia())
         return -1;
    else
         return 1+Math.max(altura(nodo.getHijoIzquierdo()),altura(nodo.getHijoDerecho()));
	}
     public NodoArbolB buscarNodo8(int valor){
         NodoArbolB temp = raiz;
         while(temp.getValor()!=valor){
             if(valor<temp.getValor()){
                 temp=temp.getHijoIzquierdo();
            }
             else{
                 temp=temp.getHijoDerecho();
            }
            if(temp==null){
                return null;
            } 
         }
         return temp;
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
