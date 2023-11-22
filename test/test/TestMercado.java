package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.MercadoUnlam;
import src.NoSePudoRealizarLaTransaccionException;
import src.Pagadora;
import src.Persona;
import src.PersonaFisica;
import src.PersonaJuridica;
import src.SaldoInsuficienteException;
import src.TarjetaDeCredito;
import src.Transaccion;
import src.Transferencia;
import src.Compra;
import src.CuentaVirtual;
import src.ExcedeLimiteDeCompraException;
import src.TarjetaDeDebito;
import src.CuentaBancaria;
import src.CuentaCorriente;
import src.Transferible;

public class TestMercado {

	@Test
	public void queSePuedanAlmacenarLosDistintosTiposDePersonas() {
		MercadoUnlam mercado = new MercadoUnlam();
		Persona persona = new PersonaFisica("Lucas",42817472);
		Persona persona2 = new PersonaJuridica("El bar",12356489);
		
		mercado.agregarPersona(persona);
		mercado.agregarPersona(persona2);
		
		assertTrue(mercado.getPersonas().contains(persona));
		assertTrue(mercado.getPersonas().contains(persona2));
	}
	
	@Test
	public void queSePuedaAgregarUnMedioDePagoAUnaPersona() {
		MercadoUnlam mercado = new MercadoUnlam();
		Persona persona = new PersonaFisica("Lucas",42817472);
		Pagadora medio = new TarjetaDeDebito(123456, 10000.00);
		Pagadora medio2 = new CuentaVirtual(5645, 2000.00);
		
		mercado.agregarMedioDePago(persona, medio);
		mercado.agregarMedioDePago(persona, medio2);
		
		assertTrue(persona.getMediosAsociados().contains(medio));
		assertTrue(persona.getMediosAsociados().contains(medio2));
	}
	
	
	
	@Test
	public void queSePuedanRealizarCompras() throws SaldoInsuficienteException, ExcedeLimiteDeCompraException {
		MercadoUnlam mercado = new MercadoUnlam();
		Persona persona = new PersonaFisica("Lucas",42817472);
		Persona persona2 = new PersonaJuridica("El bar",12356489);
		Pagadora medio = new TarjetaDeDebito(123456, 10000.00);
		Pagadora medio2 = new CuentaVirtual(5645, 2000.00);
		
		mercado.agregarPersona(persona);
		mercado.agregarPersona(persona2);
		
		mercado.agregarMedioDePago(persona, medio);
		mercado.agregarMedioDePago(persona, medio2);
		
		Compra compra = new Compra(13546, 55555, persona, persona2, 200.00, medio);
				
		mercado.realizarCompra(compra);
		
		assertTrue(mercado.getTransacciones().contains(compra));
		
	}
	
	@Test
	public void queSePuedanRealizarTransferencias() throws NoSePudoRealizarLaTransaccionException{
		MercadoUnlam mercado = new MercadoUnlam();
		Transferible cuenta = new CuentaBancaria(2323, 5000.00);
		Transferible cuenta2 = new CuentaBancaria(5341, 15000.00);
		
		Transferencia transferencia = new Transferencia(456, cuenta, cuenta2, 300.00);
		
		mercado.realizarTransaccion(transferencia);
		
		assertTrue(mercado.getTransacciones().contains(transferencia));
	}
	
	
	@Test
	public void queSePuedanAlmacenarLosDistintosTiposDeTransacciones() throws SaldoInsuficienteException, ExcedeLimiteDeCompraException, NoSePudoRealizarLaTransaccionException {
		MercadoUnlam mercado = new MercadoUnlam();
		Persona persona = new PersonaFisica("Lucas",42817472);
		Persona persona2 = new PersonaJuridica("El bar",12356489);
		Pagadora medio = new TarjetaDeDebito(123456, 10000.00);
		Pagadora medio2 = new CuentaVirtual(5645, 2000.00);
		Transferible cuenta = new CuentaBancaria(2323, 5000.00);
		Transferible cuenta2 = new CuentaBancaria(5341, 15000.00);
				
		mercado.agregarPersona(persona);
		mercado.agregarPersona(persona2);
		
		mercado.agregarMedioDePago(persona, medio);
		mercado.agregarMedioDePago(persona, medio2);
		
		Compra compra = new Compra(13546, 55555, persona, persona2, 200.00, medio);
				
		mercado.realizarCompra(compra);
		
		Transferencia transferencia = new Transferencia(456, cuenta, cuenta2, 300.00);
		
		mercado.realizarTransaccion(transferencia);
		
		assertTrue(mercado.getTransacciones().contains(compra));
		assertTrue(mercado.getTransacciones().contains(transferencia));
	}
	
	@Test (expected = SaldoInsuficienteException.class)
	public void queSeLanceUnaExcepcionSiElSaldoDeLaTarjetaEsInsuficienteParaHacerUnaCompra() throws SaldoInsuficienteException, ExcedeLimiteDeCompraException {
		MercadoUnlam mercado = new MercadoUnlam();
		Persona persona = new PersonaFisica("Lucas",42817472);
		Persona persona2 = new PersonaJuridica("El bar",12356489);
		Pagadora medio = new TarjetaDeDebito(123456, 10000.00);
		Pagadora medio2 = new CuentaVirtual(5645, 2000.00);
		
		mercado.agregarPersona(persona);
		mercado.agregarPersona(persona2);
		
		mercado.agregarMedioDePago(persona, medio);
		mercado.agregarMedioDePago(persona, medio2);
		
		Compra compra = new Compra(13546, 55555, persona, persona2, 200000.00, medio);
				
		mercado.realizarCompra(compra);
		
	}
	
	@Test (expected = ExcedeLimiteDeCompraException.class)
	public void queSeLanceUnaExcepcionSiElLimiteDeCompraDeLaTarjetaEsInsuficienteParaHacerUnaCompra() throws SaldoInsuficienteException, ExcedeLimiteDeCompraException {
		MercadoUnlam mercado = new MercadoUnlam();
		Persona persona = new PersonaFisica("Lucas",42817472);
		Persona persona2 = new PersonaJuridica("El bar",12356489);
		Pagadora medio = new TarjetaDeCredito(123456, 10000.00);
		Pagadora medio2 = new CuentaVirtual(5645, 2000.00);
		
		mercado.agregarPersona(persona);
		mercado.agregarPersona(persona2);
		
		mercado.agregarMedioDePago(persona, medio);
		mercado.agregarMedioDePago(persona, medio2);
		
		Compra compra = new Compra(13546, 55555, persona, persona2, 200000.00, medio);
				
		mercado.realizarCompra(compra);
		
	}

	@Test (expected = SaldoInsuficienteException.class)
	public void queSeLanceUnaExcepcionSiElSaldoDeLaCuentaVirtualEsInsuficienteParaHacerUnaCompra() throws SaldoInsuficienteException, ExcedeLimiteDeCompraException {
		MercadoUnlam mercado = new MercadoUnlam();
		Persona persona = new PersonaFisica("Lucas",42817472);
		Persona persona2 = new PersonaJuridica("El bar",12356489);
		Pagadora medio = new TarjetaDeDebito(123456, 10000.00);
		Pagadora medio2 = new CuentaVirtual(5645, 2000.00);
		
		mercado.agregarPersona(persona);
		mercado.agregarPersona(persona2);
		
		mercado.agregarMedioDePago(persona, medio);
		mercado.agregarMedioDePago(persona, medio2);
		
		Compra compra = new Compra(13546, 55555, persona, persona2, 200000.00, medio2);
				
		mercado.realizarCompra(compra);
	}
	
	@Test (expected = NoSePudoRealizarLaTransaccionException.class)
	public void queSeLanceUnaExcepcionSiElSaldoDeLaCuentaEsInsuficienteParaHacerUnaTransferencia() throws NoSePudoRealizarLaTransaccionException{
		MercadoUnlam mercado = new MercadoUnlam();
		Transferible cuenta = new CuentaBancaria(2323, 5000.00);
		Transferible cuenta2 = new CuentaBancaria(5341, 15000.00);
		
		Transferencia transferencia = new Transferencia(456, cuenta, cuenta2, 30000.00);
		
		mercado.realizarTransaccion(transferencia);
		
		assertTrue(mercado.getTransacciones().contains(transferencia));
	}
	
	@Test
	public void queDesdeUnaCuentaCorrienteSePuedaRealizarUnaTransferenciaPorEncimaDeSuSaldo() throws NoSePudoRealizarLaTransaccionException{
		MercadoUnlam mercado = new MercadoUnlam();
		Transferible cuenta = new CuentaCorriente(2323, 1000.00, 5000.00);
		Transferible cuenta2 = new CuentaBancaria(5341, 15000.00);
		
		Transferencia transferencia = new Transferencia(456, cuenta, cuenta2, 3000.00);
		
		mercado.realizarTransaccion(transferencia);
		
		assertTrue(mercado.getTransacciones().contains(transferencia));
	}	
	
}
