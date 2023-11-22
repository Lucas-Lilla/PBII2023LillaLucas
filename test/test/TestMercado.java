package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.MercadoUnlam;
import src.Persona;
import src.PersonaFisica;
import src.PersonaJuridica;

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

	
	
//	queSePuedanAlmacenarLosDistintosTiposDeTransacciones
//	queSePuedanAlmacenarLosDistintosTiposDePersonas
//	queSePuedanAsociadACadaPersonaSusMedios
//	queSePuedanRealizarCompras
//	queSePuedanRealizarTransferencias
//	queSeLanceUnaExcepcionSiElSaldoDeLaTarjetaEsInsuficienteParaHacerUnaCompra
//	queSeLanceUnaExcepcionSiElSaldoDeLaCuentaVirtualEsInsuficienteParaHacerUnaCompra
//	queSeLanceUnaExcepcionSiElLimiteDeCompraDeLaTarjetaEsInsuficienteParaHacerUnaCompra
//	queSeLanceUnaExcepcionSiElSaldoDeLaCuentaEsInsuficienteParaHacerUnaTransferencia
//	queDesdeUnaCuentaCorrienteSePuedaRealizarUnaTransferenciaPorEncimaDeSuSaldo

	
	
	
}
