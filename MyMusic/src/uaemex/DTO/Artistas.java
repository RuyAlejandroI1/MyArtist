package uaemex.DTO;

public class Artistas extends Persona {
	
	private int id;
	private String Nombre;
	private String Ocupacion;
	
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
	public String getOcupacion() {
		return Ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		Ocupacion = ocupacion;
	}
	@Override
	public String toString() {
		return "\nArtistas [id=" + id + ", Nombre=" + Nombre + ", Ocupacion=" + Ocupacion + "]";
	}
	
	
}
