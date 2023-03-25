package uaemex.DAO;

import java.util.ArrayList;
import java.util.List;

import uaemex.DTO.Grupos;


public class GruposDao {

    public  List<Grupos> grupos = new ArrayList<>();

    
   public void agragarGrupo(Grupos grupo) {
	   grupos.add(grupo);

   }

   public void eliminarGrupo(Grupos grupo) {
	   grupos.remove(grupo);
   }

   public Grupos buscarGrupo(int id) {
       for (int i = 0; i < grupos.size(); i++) {
    	   Grupos a= grupos.get(i);
           if(a.getId()== id ){
                System.out.println(a.getId());
                return a;
           }
       }
        return null;
    
   }
   
   
       public void  actualizarGrupo(Grupos grupo) {
    	   for (int i = 0; i < grupos.size(); i++) {
         if(grupos.get(i).getId()== grupo.getId()){
        	 grupos.get(i).setNombre(grupo.getNombre());
        	 grupos.get(i).setNacionalidad(grupo.getNacionalidad());
        	 grupos.get(i).setF_Fundacion(grupo.getF_Fundacion());
        	 
         }
           }
       }
    
   
   public void imprimirGrupo(ArrayList<Grupos> lista){
      for (int i = 0; i < lista.size(); i++) {
          System.out.println(lista.get(i).toString());
      
       } 
        
      

   }
}
