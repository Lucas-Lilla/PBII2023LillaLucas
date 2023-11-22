package src;

public class Transferencia extends Transaccion {

	private Transferible origen;
	private Transferible destino;
	private Double monto;
	
	public Transferencia(Integer numero, Transferible origen, Transferible destino, Double monto) {
		super(numero);
		this.origen = origen;
		this.destino = destino;
		this.monto = monto;
	}

	public Transferible getOrigen() {
		return origen;
	}

	public void setOrigen(Transferible origen) {
		this.origen = origen;
	}

	public Transferible getDestino() {
		return destino;
	}

	public void setDestino(Transferible destino) {
		this.destino = destino;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}
	
	
	
	

	

	
}
