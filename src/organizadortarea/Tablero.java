
package organizadortarea;


public class Tablero {
    
   String nombre="[C][L][0-9][0-9]";
   String descripcion ="[a-zA-Z]";
   String estado = "[a-zAZ]";
    
   
   public Tablero (String nombre, String descripcion, String estado){
       this.nombre=nombre;
       this.descripcion=descripcion;
       this.estado=estado;
   
   }
   
   
   public boolean Vnombre (){
   if (nombre == null){
       return false;
   }
   return true;
   }
   
      public boolean Vdescripcion (){
   if (descripcion == null){
       return false;
   }
   return true;
   }
    
       public boolean Vestado (){
   if (estado == null){
       return false;
   }
   return true;
   }
      
    public String RegistrarTablero(){
        String mensaje="";
        if(Vnombre()==false){
            mensaje ="Nombre Incorrecto";
            }
        else{
            if(Vdescripcion()==false){
                 mensaje ="descripcion incorrecta";
            }
            else{
                if(Vestado()==false){
                mensaje ="estado incorecto";
                }
                else{
                    mensaje= ("Regristrado");
                }
            }
        }
        return mensaje;
    }

    boolean OrganizadorTarea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

