package src;

public class PersonaFisica extends Persona {

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
	public Integer getID() {
		return this.cuil;
	}

	
}
