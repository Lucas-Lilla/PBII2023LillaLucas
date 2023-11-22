package src;

public class CuentaBancaria extends MedioDePago implements Transferible{

	public CuentaBancaria(Integer numero) {
		super(numero);
	}

	@Override
	public Double getSaldo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void depositar(Double importe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean estraer(Double importe) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
