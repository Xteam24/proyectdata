/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap4.arboles;

import estructurasdedatos.utiles.nodos.NodoArbolB;
import static java.util.Arrays.equals;
import static java.util.Arrays.equals;
import static java.util.Arrays.equals;

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
    public boolean esvacia(){
        return(raiz == null);
    }
    
    private void addNodoArbolB(NodoArbolB nodo,NodoArbolB raiz){
        if (esvacia()){
            this.setRaiz(nodo);
        }
        else{
            if(nodo.getValor()<= raiz.getValor()){
                if(raiz.getHijoIzquierdo()== null){
                    raiz.setHijoIzquierdo(nodo);
                }
                else{
                    addNodoArbolB(nodo,raiz.getHijoIzquierdo());
                }    
            }
            else{
                if (raiz.getHijoDerecho()==null){
                    raiz.setHijoDerecho(nodo);
                }
                else{
                    addNodoArbolB(nodo,raiz.getHijoDerecho());     
                }
            }
        }
    }
    public void addNodoArbolB(NodoArbolB nodo){
            this.addNodoArbolB(nodo,this.raiz);
    }
    // Metodos de ordenamiento Preorden,Orden y postorden
    public void preorden(NodoArbolB raiz){
        if(raiz != null){
            System.out.println(raiz.getValor());
            preorden(raiz.getHijoIzquierdo());
            preorden(raiz.getHijoDerecho());
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
            }
