package src;

import java.util.HashSet;
import java.util.Set;

public abstract class Persona {

	private String nombre;
	private Set<MedioDePago> mediosAsociados;

	public Persona(String nombre) {
		this.nombre = nombre;
		this.mediosAsociados = new HashSet<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<MedioDePago> getMediosAsociados() {
		return mediosAsociados;
	}

	public void setMediosAsociados(Set<MedioDePago> mediosAsociados) {
		this.mediosAsociados = mediosAsociados;
	}

	
	

	
}
