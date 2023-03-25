package uaemex.DAO;

import java.util.ArrayList;
import java.util.List;

import uaemex.DTO.Persona;



public class PersonasDao {

    public  List<Persona> personas = new ArrayList<>();

    
   public void agragarPersona(Persona persona) {
	   personas.add(persona);

   }

   public void eliminarPersona(Persona persona) {
	   personas.remove(persona);
   }

   public Persona buscarPersona(int id) {
       for (int i = 0; i <personas.size(); i++) {
    	   Persona a= personas.get(i);
           if(a.getId()== id ){
                System.out.println(a.getId());
                return a;
           }
       }
        return null;
    
   }
   
   
       public void  actualizarPersona(Persona persona) {
    	   for (int i = 0; i <personas.size(); i++) {
         if(personas.get(i).getId()== persona.getId()){
        	 personas.get(i).setNombre(persona.getNombre());
        	 personas.get(i).setApellido(persona.getApellido());
        	 personas.get(i).setF_nacimiento(persona.getF_nacimiento());
        	 personas.get(i).setNacionalidad(persona.getNacionalidad());
        	 personas.get(i).setGenero(persona.getGenero());
        	 
         }
           }
       }
    
   
   public void imprimirPersona(ArrayList<Persona> lista){
      for (int i = 0; i < lista.size(); i++) {
          System.out.println(lista.get(i).toString());
      
       } 
        
      

   }
}

