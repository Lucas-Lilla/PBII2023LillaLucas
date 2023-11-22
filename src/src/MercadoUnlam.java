package src;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MercadoUnlam {

	private Set<Persona> personas;
	private Set<Transaccion> transacciones;
	
	public MercadoUnlam() {
		this.personas = new TreeSet<>() ;
		this.transacciones = new HashSet<>();
	}
	
	public Set<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(Set<Persona> personas) {
		this.personas = personas;
	}

	public Set<Transaccion> getTransacciones() {
		return transacciones;
	}

	public void setTransacciones(Set<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}

	public void agregarPersona(Persona persona) {
		personas.add(persona);
	}

	public void agregarMedioDePago(Persona persona, Pagadora medio) {
		persona.getMediosAsociados().add(medio);
	}

	
	public void realizarCompra(Compra compra) throws SaldoInsuficienteException, ExcedeLimiteDeCompraException {
		
		if(compra.getMedio().pagar(compra.getPersonaDestino(), compra.getMonto())){
			transacciones.add(compra);
		}
	}

	public void realizarTransaccion(Transferencia transferencia) throws NoSePudoRealizarLaTransaccionException {
		if(transferencia.getOrigen().estraer(transferencia.getMonto())) {
			transferencia.getDestino().depositar(transferencia.getMonto());
			transacciones.add(transferencia);
		}else throw new NoSePudoRealizarLaTransaccionException();
	}

	
	
	
}
