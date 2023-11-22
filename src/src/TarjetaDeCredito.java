package src;

public class TarjetaDeCredito implements Pagadora{

	private Integer numero;
	private Double limite;
	
	public TarjetaDeCredito(Integer numero, Double limite) {
		this.limite = limite;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	@Override
	public Boolean pagar(Persona vendedor, Double importe) throws ExcedeLimiteDeCompraException {
		if(importe <= this.limite) {
			return true;
		}else throw new ExcedeLimiteDeCompraException();
	}
	
	
}
