package src;

public class PersonaJuridica extends Persona implements Comparable<PersonaJuridica>{

	private Integer cuit;
	
	public PersonaJuridica(String nombre, Integer cuit) {
		super(nombre);
		this.cuit = cuit;
	}

	public Integer getCuit() {
		return cuit;
	}

	public void setCuit(Integer cuit) {
		this.cuit = cuit;
	}

	@Override
	public int compareTo(PersonaJuridica o) {
		return this.cuit.compareTo(o.cuit);
	}

}
