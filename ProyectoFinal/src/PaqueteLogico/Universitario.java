import java.util.ArrayList;

import PaqueteLogico.Persona;

public class Universitario extends Persona {
	
	private ArrayList<String> idiomas;
	private String universidad;
	private String carrera;
	
	public Universitario(String nombre, String cedula, String pais, String telefono, String estadoC, String ciudad,
			String genero, ArrayList<String> idiomas, String universidad, String carrera) {
		super(nombre, cedula, pais, telefono, estadoC, ciudad, genero);
		this.idiomas = idiomas;
		this.universidad = universidad;
		this.carrera = carrera;
	}

	public ArrayList<String> getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(ArrayList<String> idiomas) {
		this.idiomas = idiomas;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	
	
	
}