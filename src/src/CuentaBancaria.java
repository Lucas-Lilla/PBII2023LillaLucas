package src;

public class CuentaBancaria implements Transferible{

	private Integer numero;
	private Double saldo;
	
	public CuentaBancaria(Integer numero, Double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
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

	
	
	
}
