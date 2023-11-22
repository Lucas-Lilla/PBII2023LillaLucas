package src;

public class CuentaCorriente extends CuentaBancaria {

	private Double sobregiro;
	
	public CuentaCorriente(Integer numero, Double saldo, Double sobregiro) {
		super(numero, saldo);
		this.sobregiro = sobregiro;
	}

	@Override
	public Boolean estraer(Double importe) {
		if(super.getSaldo() >= importe) {
			return true;
		}else if(this.sobregiro >= importe) {
			return true;
		}else return false;
			
	}
	

}
