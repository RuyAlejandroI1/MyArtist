package uaemex.DTO;

import java.util.List;


public class Grupos {

	private int id;
	private String Nombre;
	private List<Persona>Iidentidad;
	private List<Artistas>Integrantes;
	private String Nacionalidad;
	private int F_Fundacion;
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
	public List<Persona> getIidentidad() {
		return Iidentidad;
	}
	public void setIidentidad(List<Persona> iidentidad) {
		Iidentidad = iidentidad;
	}
	public List<Artistas> getIntegrantes() {
		return Integrantes;
	}
	public void setIntegrantes(List<Artistas> integrantes) {
		Integrantes = integrantes;
	}
	public String getNacionalidad() {
		return Nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}
	public int getF_Fundacion() {
		return F_Fundacion;
	}
	public void setF_Fundacion(int f_Fundacion) {
		F_Fundacion = f_Fundacion;
	}
	@Override
	public String toString() {
		return "\nGrupos [id=" + id + ", Nombre=" + Nombre + ", Iidentidad=" + Iidentidad + ", Integrantes=" + Integrantes
				+ ", Nacionalidad=" + Nacionalidad + ", Fecha de Fundacion=" + F_Fundacion + "]";
	}
	
	
}
