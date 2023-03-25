package uaemex.DAO;

import java.util.ArrayList;
import java.util.List;

import uaemex.DTO.Album;

public class AlbumsDao {

    public List<Album> albums = new ArrayList<>();

    public void Agregar(Album album) {
    	albums.add(album);

    }

    public void Eliminar(Album album) {
    	albums.remove(album);
    }

    public Album Buscar(int id) {
        for (int i = 0; i < albums.size(); i++) {
            Album a = albums.get(i);
            if (a.getId() == id) {
                System.out.println(a.getId());
                return a;
            }
        }
        return null;

    }

    public void Actualizar(Album album) {
        for (int i = 0; i <albums.size(); i++) {
            if (albums.get(i).getId() == album.getId()) {
            	albums.get(i).setNombre(album.getNombre());
            	albums.get(i).setCanciones(album.getCanciones());
            }
        }
    }

    public List<Album> imprimirtListaAlbums() {
        return albums;
      
    }
}