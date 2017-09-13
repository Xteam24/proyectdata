/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap1.complejidad;

import java.util.Arrays;

/**
 *
 * @author tusk
 */
public class EjerciciosComplejidad {


    //Este ejercicio complejidad O(1);
    //Puesto que solo tiene que imprimir algo en pantalla
    public void SetComplejidad1(){
        System.out.println("Hola Mundo");
        }
    //ejercicio con compejidad O(n)
    //ya que tiene un ciclo y en el peor de los casos toca ir hasta n
    public void SetComplejidad2(int a,int n){
              for(a=1;a<=n;a++){
              System.out.println(a);
            }
    }
    //complejidad O(n2)
    //tiene dos ciclos en donde tiene 2 veces n para revisar 
    public void SetComplejidad3(int c,int v){
       for(c=0;c<=10;c++){
           for(v=1;v<=10;v++){
               
               System.out.print(c+ "X" +v+ "=" +c*v+"  " );
           } System.out.println("");
           } System.out.println("");
       }   
   
    
    class BusquedaBinaria{
 /**
 * Busca un valor numerico dentro de un arreglo numerico...
 * previamente ordenado usando el metodo de busqueda binaria 
 * 
 * @param arreglo con los elementos; dato a buscar
 * @return posicion del elemento buscado, en caso de no existir retorna -1
    */
 public  int busquedaBinaria(int  vector[], int dato){
  int n = vector.length;
  int centro,inf=0,sup=n-1;
   while(inf<=sup){
     centro=(sup+inf)/2;
     if(vector[centro]==dato) return centro;
     else if(dato < vector [centro] ){
        sup=centro-1;
     }
     else {
       inf=centro+1;
     }
   }
   return -1;
 }
 public void complegidadLog() { //Complejidad Logaritmica O(log n)
        int num[] = {75, 2, 44, 56, 66, 83, 90, 23, 66};
        int posicion, buscar = 83;
        posicion = Arrays.binarySearch(num, buscar);
        // Si el array no esta ordenado nos puede dar un valor erroneo
        System.out.println("Array no ordenado. Encontrado en el indice: " + posicion);
        Arrays.sort(num); // Ordenamos el array
        // Buscamos la posicion del primer valor
        posicion = Arrays.binarySearch(num, buscar);
        System.out.println("Array ordenado. Encontrado en el indice: " + posicion);
        System.out.println("Complejidad Logaritmica O(log n)");
    }
    //quicksort Complegidad n log n
    public void complegidadNlogaritmoN(int A[], int izq, int der) { 

        int pivote = A[izq]; // tomamos primer elemento como pivote
        int i = izq; // i realiza la búsqueda de izquierda a derecha
        int j = der; // j realiza la búsqueda de derecha a izquierda
        int aux;
        
        while (i < j) {            // mientras no se crucen las búsquedas
            while (A[i] <= pivote && i < j) {
                i++; // busca elemento mayor que pivote
            }
            while (A[j] > pivote) {
                j--;         // busca elemento menor que pivote
            }
            if (i < j) {                      // si no se han cruzado                      
                aux = A[i];                  // los intercambia
                A[i] = A[j];
                A[j] = aux;
            }
        }
        A[izq] = A[j]; // se coloca el pivote en su lugar de forma que tendremos
        A[j] = pivote; // los menores a su izquierda y los mayores a su derecha
        if (izq < j - 1) {
            complegidadNlogaritmoN(A, izq, j - 1); // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            complegidadNlogaritmoN(A, j + 1, der); // ordenamos subarray derecho
        }
        
    }
}
   

    
   
          
    
    
}
