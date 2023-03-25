package uaemex.DAO;

import java.util.ArrayList;
import java.util.List;

import uaemex.DTO.Artistas;


public class ArtistasDao {
	
    public  List<Artistas> artistas = new ArrayList<>();

    
   public void agragarArtista(Artistas artista) {
	   artistas.add(artista);

   }

   public void eliminarArtista(Artistas artista) {
	   artistas.remove(artista);
   }

   public Artistas buscarArtista(int id) {
       for (int i = 0; i < artistas.size(); i++) {
    	   Artistas a= artistas.get(i);
           if(a.getId()== id ){
                System.out.println(a.getId());
                return a;
           }
       }
        return null;
    
   }
   
   
       public void  actualizarArtista(Artistas artista) {
    	   for (int i = 0; i < artistas.size(); i++) {
         if(artistas.get(i).getId()== artista.getId()){
        	 artistas.get(i).setNombre(artista.getNombre());
        	 artistas.get(i).setOcupacion(artista.getOcupacion());
         }
           }
       }
    
   
   public void imprimirArtista (ArrayList<Artistas> lista){
      for (int i = 0; i < lista.size(); i++) {
          System.out.println(lista.get(i).toString());
      
       } 
        
      

   }
}


