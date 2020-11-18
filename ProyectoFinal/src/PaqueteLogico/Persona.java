
public abstract class Persona {
	protected String nombre;
	protected String cedula;
	protected String pais;
	protected String telefono;
	protected String EstadoC;
	protected String ciudad;
	protected String genero;
	
	public Persona(String nombre, String cedula, String pais, String telefono, String estadoC, String ciudad,
			String genero) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.pais = pais;
		this.telefono = telefono;
		EstadoC = estadoC;
		this.ciudad = ciudad;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEstadoC() {
		return EstadoC;
	}

	public void setEstadoC(String estadoC) {
		EstadoC = estadoC;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
}