package src;

public class Compra extends Transaccion {

	private Integer codigoQR;
	
	public Compra(Integer numero, Persona personaOrigen, Persona personaDestino, Double monto, Integer codigoQR) {
		super(numero, personaOrigen, personaDestino, monto);
		this.codigoQR = codigoQR;
	}

	public Integer getCodigoQR() {
		return codigoQR;
	}

	public void setCodigoQR(Integer codigoQR) {
		this.codigoQR = codigoQR;
	}
}
