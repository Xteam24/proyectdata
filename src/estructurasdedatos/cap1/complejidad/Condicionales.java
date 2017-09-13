
package estructurasdedatos.cap1.complejidad;
   import java.util.Scanner;

public class Condicionales {
    
    /**
     * * @author Xteam

     */
    public Condicionales(){
        
    }

public void setparescuantos(int x,int cont,int sum){

    for(x=1;x<=100;x++){
        if(x%2==0){
            {
                sum=sum+x;
                cont=cont+1;
            }
        }
        System.out.println("Tenemos: "+cont);
        System.out.println("la suma es: "+sum);
    }}    
    public void setpares (){
       Scanner inicio=new Scanner (System.in); 
        int dato1=0;
        int dato2=0;
        int m;
        
        System.out.println("Ingrese el primer numero ");
        
        dato1 = inicio.nextInt();
        System.out.println("Ingrese el ultimo numero ");
        dato2 = inicio.nextInt();
        
        if (dato1>dato2){
            System.out.println("Los valores itruducidos no son correctos ");
        }
        else 
        {for (m=dato1;m<=dato2;m++){
            if (m%2==0){
                System.out.println(m);
            }
          }
        }
    }
    public void setnumeros (){
      Scanner inicio=new Scanner (System.in); 
        
        
        int dato1=0;
        int dato2=0;
        int n;
        System.out.println("Ingrese el primer numero ");
        
        dato1 = inicio.nextInt();
        System.out.println("Ingrese el ultimo numero ");
        dato2 = inicio.nextInt();
        
        if(dato1>dato2)
        {
            System.out.println("Los valores introducidos no son correctos");
        }
        else
        {
            for(n=dato1;n<=dato2;n++){
                System.out.println(n);
            }
        }
            }
        }
    
    

