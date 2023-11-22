package src;

public class CuentaVirtual implements Pagadora, Transferible{
	
	private Integer numero;
	private Double saldo;
	
	public CuentaVirtual(Integer numero, Double saldo) {
		this.saldo = saldo;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public Double getSaldo() {
		return this.saldo;
	}

	@Override
	public void depositar(Double importe) {
		this.saldo = saldo + importe;
	}

	@Override
	public Boolean estraer(Double importe) {
		if(this.saldo >= importe) {
			return true;
		}else return false;
	}

	@Override
	public Boolean pagar(Persona vendedor, Double importe) throws SaldoInsuficienteException {
		if(importe <= this.saldo) {
			return true;
		}else throw new SaldoInsuficienteException();
	}


	
}
