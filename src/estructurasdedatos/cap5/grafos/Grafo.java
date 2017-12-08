/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap5.grafos;

import java.util.List;

/**
 *
 * @author tusk
 */
public class Grafo {
    List<VerticeNoDirigido> vertices;
    List<ArcoNoDirigido> matrizDeAdyacencia;

    public void insertarVertice(String dato) {
        VerticeNoDirigido nuevoVertice = new VerticeNoDirigido();
        nuevoVertice.setDato(dato);
        this.vertices.add(nuevoVertice);
    }

    public void insertarArco(VerticeNoDirigido vertice1, VerticeNoDirigido vertice2) {
        ArcoNoDirigido nuevoArco = new ArcoNoDirigido();
        nuevoArco.setVertice1(vertice1);
        nuevoArco.setVertice1(vertice2);
        this.matrizDeAdyacencia.add(nuevoArco);
    }

    public void eliminarVertice(String dato) {
        for (VerticeNoDirigido elemento : vertices) {
            if (elemento.getDato().compareTo(dato) == 0) {
                vertices.remove(elemento);
            }
        }
    }

    public void eliminarArco(VerticeNoDirigido borrar) {
        for (ArcoNoDirigido elemento : matrizDeAdyacencia) {
            if (elemento.getVertice1().equals(borrar) || elemento.getVertice2().equals(borrar)) {
                matrizDeAdyacencia.remove(elemento);
            }
            

        }

        
    }

   

//}
