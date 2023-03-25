package uaemex.DTO;

public class Persona extends Grupos{
	
	private int id;
	private String Nombre;
	private String Apellido;
	private String Nacionalidad;
	private String Genero;
	private int F_nacimiento;
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
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getNacionalidad() {
		return Nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	public int getF_nacimiento() {
		return F_nacimiento;
	}
	public void setF_nacimiento(int f_nacimiento) {
		F_nacimiento = f_nacimiento;
	}
	@Override
	public String toString() {
		return "\nIntegrantes [id=" + id + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Nacionalidad=" + Nacionalidad
				+ ", Genero=" + Genero + ", Edad=" + F_nacimiento + "]";
	}

}
