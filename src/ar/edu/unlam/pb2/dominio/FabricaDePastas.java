package ar.edu.unlam.pb2.dominio;

import java.util.ArrayList;

public class FabricaDePastas {

	// Coleccion: elemento que contiene muchos elementos.
	// ArrayList

	// private Pasta[] pasta;
	private ArrayList<Pasta> pastas;

	public FabricaDePastas() {
		// this.pasta = new Pasta[5];
		this.pastas = new ArrayList<>();
	}

	public Boolean agregar(Pasta pasta) {
		// int -> Interger
		// long -> Long
		// boolean -> Boolean (Puede decir null y no solo true/false)
		return this.pastas.add(pasta);
	}

	public ArrayList<Pasta> obtenerPastas() {
		return this.pastas;
	}

	public Boolean eliminar(Pasta pasta) {
		return this.pastas.remove(pasta);
	}

}
