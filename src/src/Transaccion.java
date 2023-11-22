package src;

public abstract class Transaccion {

	private Integer numero;
		
	public Transaccion(Integer numero) {
		this.numero = numero;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	

}
