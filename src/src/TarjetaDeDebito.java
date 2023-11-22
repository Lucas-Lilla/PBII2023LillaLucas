package src;

public class TarjetaDeDebito extends MedioDePago implements Pagadora{

	private Double	dineroDisponible;
		
	public TarjetaDeDebito(Integer numero, Double dineroDisponible) {
		super(numero);
		this.dineroDisponible  = dineroDisponible;
	}

	public Double getDineroDisponible() {
		return dineroDisponible;
	}

	public void setDineroDisponible(Double dineroDisponible) {
		this.dineroDisponible = dineroDisponible;
	}

	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
