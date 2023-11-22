package src;

public interface Transferible {

	Double getSaldo();
	void depositar(Double importe);
	Boolean estraer(Double importe);
	
}
