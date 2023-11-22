package src;

public class CuentaVirtual extends MedioDePago implements Pagadora, Transferible{

	public CuentaVirtual(Integer numero) {
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

	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
