package Test;

import java.util.List;

import uaemex.DAO.AlbumsDao;
import uaemex.DAO.ArtistasDao;
import uaemex.DAO.CancionesDao;
import uaemex.DAO.GruposDao;
import uaemex.DAO.PersonasDao;
import uaemex.DTO.Album;
import uaemex.DTO.Artistas;
import uaemex.DTO.Cancion;
import uaemex.DTO.Grupos;
import uaemex.DTO.Persona;

public class TestAlbum {

	PersonasDao personaDao = new PersonasDao();
	ArtistasDao artistaDao = new ArtistasDao();
	CancionesDao cancionDao = new CancionesDao();
	GruposDao GrupoDao = new GruposDao();
	AlbumsDao albumsDao = new AlbumsDao();

	public void testCrearAlbum(Album album) {
		albumsDao.Agregar(album);
		System.out.println("Fin agregar Album");
	}
	public void testCrearPersona(Persona persona) {
		personaDao.agragarPersona(persona);
		System.out.println("agrego identidad");
	}
	public void testCrearArtista(Artistas artista) {
		artistaDao.agragarArtista(artista);
		System.out.println("Fin agregar Artista");
	}
	public void testCrearGrupo(Grupos grupo) {
		GrupoDao.agragarGrupo(grupo);
		System.out.println("Fin agregar Grupo");
	}
	public void testCrearCancion(Cancion cancion) {
		cancionDao.agragarCancion(cancion);
		System.out.println("agrego Cancion");
	}
	  public void consultarAlbum() {


	        Album A = albumsDao.Buscar(1);
	        System.out.println("Bsqueda por id  " + A.toString());
	    }

	    public void consultarTodos() {
	        List<Album> album = albumsDao.imprimirtListaAlbums();

	        for (Album A : album) {
	            System.out.println(A.toString());
	        }

	    }
}
