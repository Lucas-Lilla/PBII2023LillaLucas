package src;

public class TarjetaDeCredito extends MedioDePago implements Pagadora{

	private Double limite;
	
	public TarjetaDeCredito(Integer numero, Double limite) {
		super(numero);
		this.limite = limite;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
