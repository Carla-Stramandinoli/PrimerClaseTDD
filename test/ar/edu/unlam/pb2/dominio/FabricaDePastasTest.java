package ar.edu.unlam.pb2.dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class FabricaDePastasTest {

	// Registrar pasta: Agrega una pasta a la coleccion de pastas disponibles para
	// agregar a un pedido

	private FabricaDePastas fabricaDePastas;

	@Before
	public void init() {
		this.fabricaDePastas = new FabricaDePastas();
	}

	@Test
	public void dadoQueExisteUnaFabricaDePastasCuandoAgregoUnaPastaALaColeccionDePastasDisponiblesLaColeccionContieneLaPasta() {
		// Preparacion:
		Pasta pasta = new Pasta();

		// Ejecucion:
		Boolean pastaAgregada = this.fabricaDePastas.agregar(pasta);

		// Verificacion:
		assertTrue(pastaAgregada);
	}

	@Test
	public void dadoQueExisteUnaFabricaDePastasCon2PastasCuandoObtengoLaColeccionObtenidaContiene2Elementos() {
		// Preparacion:
		Pasta ravioles = new Pasta();
		Pasta agnolotis = new Pasta();
		this.fabricaDePastas.agregar(ravioles);
		this.fabricaDePastas.agregar(agnolotis);

		// Ejecucion:
		ArrayList<Pasta> pastasObtenidas = this.fabricaDePastas.obtenerPastas();

		// Verificacion:
		int cantidadEsperada = 2;

		assertEquals(cantidadEsperada, pastasObtenidas.size());
	}

	@Test
	public void dadoQueExisteUnaFabricaDePastasCon2PastasCuandoElimino1LaColeccionObtenidaContiene1Elemento() {
		// Preparacion:
		Pasta ravioles = new Pasta();
		Pasta agnolotis = new Pasta();
		this.fabricaDePastas.agregar(ravioles);
		this.fabricaDePastas.agregar(agnolotis);

		this.fabricaDePastas.eliminar(agnolotis);

		// Ejecucion:
		ArrayList<Pasta> pastasObtenidas = this.fabricaDePastas.obtenerPastas();

		// Verificacion:
		int cantidadEsperada = 1;

		assertEquals(cantidadEsperada, pastasObtenidas.size());
	}
}
