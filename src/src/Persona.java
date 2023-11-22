package src;

import java.util.HashSet;
import java.util.Set;

public abstract class Persona implements Comparable<Persona>{

	private String nombre;
	private Set<Pagadora> mediosAsociados;

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

	public Set<Pagadora> getMediosAsociados() {
		return mediosAsociados;
	}

	public void setMediosAsociados(Set<Pagadora> mediosAsociados) {
		this.mediosAsociados = mediosAsociados;
	}
	
	public abstract Integer getID();
	
	@Override
	public int compareTo(Persona o) {
		return this.getID().compareTo(o.getID());
	}
	

	
}
