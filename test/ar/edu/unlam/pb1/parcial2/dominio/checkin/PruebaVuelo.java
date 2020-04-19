package ar.edu.unlam.pb1.parcial2.dominio.checkin;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaVuelo {

	@Test // sentencia que me dice q cada metodo es un caso de prueba
	public void pruebaQueSePuedaCrearUnVuelo() {
		// Preparacion de datos
		String origen = "EPA";
		String destino = "brc";
		Integer cantidadPasajeros = 4;

		// Ejecucion (instanciacion)
		Vuelo vuelo = new Vuelo(origen, destino, cantidadPasajeros);

		// Para verificar: 1, q vuelo sea distinto de null
		String valorEsperadoOrigen = "EPA";
		String valorObtenidoOrigen = vuelo.getOrigen();

		// JUnit
		assertEquals(valorEsperadoOrigen, valorObtenidoOrigen);
		assertEquals(4, vuelo.getPasajeros().length);
	}

	@Test
	public void testQueSePuedaAgregarUnPasajeroAUnVuelo() {
		// Preparacion de datos
		Integer dni = 333;
		String nombre = "juan";
		String apellido = "perez";
		String origen = "EPA";
		String destino = "brc";
		Integer cantidadPasajeros = 4;

		// Ejecución, Creo un pasajero
		Pasajero p1 = new Pasajero(dni, nombre, apellido);
		Vuelo v1 = new Vuelo (origen, destino, cantidadPasajeros);
		
		//Validacion
		assertTrue(v1.agregarPasajero(p1));
		
		assertNotNull(v1.buscarPasajero(333));
		
	}

}
