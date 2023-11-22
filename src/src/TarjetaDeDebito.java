package src;

public class TarjetaDeDebito implements Pagadora{

	private Integer numero;
	private Double	dineroDisponible;
		
	public TarjetaDeDebito(Integer numero, Double dineroDisponible) {
		this.dineroDisponible  = dineroDisponible;
	}

	public Double getDineroDisponible() {
		return dineroDisponible;
	}

	public void setDineroDisponible(Double dineroDisponible) {
		this.dineroDisponible = dineroDisponible;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Override
	public Boolean pagar(Persona vendedor, Double importe) throws SaldoInsuficienteException {
		if(importe <= this.dineroDisponible) {
			return true;
		}else throw new SaldoInsuficienteException();
	}
	
	
}
