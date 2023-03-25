package uaemex.DTO;

import java.util.List;

public class Album extends Cancion{
	

		private int id;
		private String Nombre;
		private List<Persona> identidades;
		private List<Artistas> Integrantes;
		private List<Cancion> canciones;
		
	
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNombre() {
			return Nombre;
		}
		public void setNombre(String nombre) {
			Nombre = nombre;
		}
		public List<Persona> getIdentidades() {
			return identidades;
		}
		public void setIdentidades(List<Persona> identidades) {
			this.identidades = identidades;
		}
		public List<Artistas> getIntegrantes() {
			return Integrantes;
		}
		public void setIntegrantes(List<Artistas> integrantes) {
			Integrantes = integrantes;
		}
		public List<Cancion> getCanciones() {
			return canciones;
		}
		public void setCanciones(List<Cancion> canciones) {
			this.canciones = canciones;
		}
		
		@Override
		public String toString() {
			return "\nAlbum [id=" + id + ", Nombre=" + Nombre + "]" + identidades + ""
					+ Integrantes + "" + canciones + "]";
		}

}
