package src;

public abstract class MedioDePago {

	private Integer numero;	
	
	public MedioDePago(Integer numero) {
		this.numero = numero;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	
	
}
