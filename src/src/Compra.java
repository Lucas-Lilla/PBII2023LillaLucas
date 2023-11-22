package src;

public class Compra extends Transaccion {

	private Integer codigoQR;
	private Persona personaOrigen;
	private Persona personaDestino;
	private Double monto;
	private Pagadora medio;
	
	public Compra(Integer numero, Integer codigoQR, Persona personaOrigen, Persona personaDestino, Double monto,
			Pagadora medio) {
		super(numero);
		this.codigoQR = codigoQR;
		this.personaOrigen = personaOrigen;
		this.personaDestino = personaDestino;
		this.monto = monto;
		this.medio = medio;
	}

	public Integer getCodigoQR() {
		return codigoQR;
	}

	public void setCodigoQR(Integer codigoQR) {
		this.codigoQR = codigoQR;
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

	public Pagadora getMedio() {
		return medio;
	}

	public void setMedio(Pagadora medio) {
		this.medio = medio;
	}

	
	
	
	
	

	
}
