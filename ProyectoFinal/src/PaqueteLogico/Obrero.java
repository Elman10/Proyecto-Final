import java.util.ArrayList;

import PaqueteLogico.Persona;

public class Obrero extends Persona {
	private ArrayList<String> habilidades;
	private String experiencia;
	
	public Obrero(String nombre, String cedula, String pais, String telefono, String estadoC, String ciudad,
			String genero, ArrayList<String> habilidades, String experiencia) {
		super(nombre, cedula, pais, telefono, estadoC, ciudad, genero);
		this.habilidades = habilidades;
		this.experiencia = experiencia;
	}

	public ArrayList<String> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(ArrayList<String> habilidades) {
		this.habilidades = habilidades;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	
	
	
}

