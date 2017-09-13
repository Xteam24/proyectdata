public class Persona
{
    private String cedula;
    private String nombre;
    private String direccion;
    
  
  public void SetCedula(String cedula){             
    this.cedula= cedula;    
   } 
  public String getCedula(){
  return cedula;
  }
   
  public void setNombre(String nombre){
                   
    this.nombre= nombre;             
   }
  public String getNombre(){
  return nombre;
  }
  public void setDireccion(String direccion){
   this.direccion= direccion;             
   }
  public String getDireccion(){
  return direccion;
  }
  
}
