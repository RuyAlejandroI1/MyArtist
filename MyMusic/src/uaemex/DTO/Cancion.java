package uaemex.DTO;

public class Cancion {
	
	private int id;
	private String Nombre;
	private String Genero;
	
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
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	@Override
	public String toString() {
		return "\nCancion [id=" + id + ", Nombre=" + Nombre + ", Genero=" + Genero + "]";
	}

}
