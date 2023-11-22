package src;

public class PersonaFisica extends Persona implements Comparable<PersonaFisica>{

	private Integer cuil;
	
	public PersonaFisica(String nombre, Integer cuil) {
		super(nombre);
		this.cuil = cuil;
	}

	public Integer getCuil() {
		return cuil;
	}

	public void setCuil(Integer cuil) {
		this.cuil = cuil;
	}

	@Override
	public int compareTo(PersonaFisica o) {
		return this.cuil.compareTo(o.cuil);
	}

	
}
