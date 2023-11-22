package src;

public abstract class Transaccion {

	private Integer numero;
	private Persona personaOrigen;
	private Persona personaDestino;
	private Double monto;
	
	public Transaccion(Integer numero, Persona personaOrigen, Persona personaDestino, Double monto) {
		this.personaOrigen = personaOrigen;
		this.personaDestino = personaDestino;
		this.monto = monto;
		this.numero = numero;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Persona getPersonaOrigen() {
		return personaOrigen;
	}

	public void setPersonaOrigen(Persona personaOrigen) {
		this.personaOrigen = personaOrigen;
	}

	public Persona getPersonaDestino() {
		return personaDestino;
	}

	public void setPersonaDestino(Persona personaDestino) {
		this.personaDestino = personaDestino;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}
	
	
	
}
