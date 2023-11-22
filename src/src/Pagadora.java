package src;

public interface Pagadora {
	
	Boolean pagar (Persona vendedor, Double importe) throws SaldoInsuficienteException, ExcedeLimiteDeCompraException;

}
