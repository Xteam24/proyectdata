/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap1.complejidad;

import static javafx.scene.input.KeyCode.V;

/**
 *
 * @author tusk
 */
public class Ciclos {
    
   int x=0,y=1,z=0,cont=0;
   
   public Ciclos (){
       
   }
   //set=asignar
   //get=Obtener 
   public void setfibonacci (int a){
       for(cont=1;cont<=25;cont=cont+1){
           z=x+y;
           System.out.println(z);
           x=y;
         y=z;  
       }
    }
   
    public void set1al100 (int a){
        for(a=1;a<=100;a++){
            System.out.println(a);
        }
    }
    public void setnumpar (int n){
        for(n=1;n<=100;n++){
            if(n%2==0){
                System.out.println(n);
            }
        }
    }
    
    public void settablamulti(int c,int v){
       for(c=0;c<=10;c++){
           for(v=1;v<=10;v++){
               
               System.out.print(c+ "X" +v+ "=" +c*v+"  " );
           } System.out.println("");
           } System.out.println("");
       }
    }
        
    
       

