package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;

public class Dealer {
	
private ArrayList<Carta> naipe;
	
	
	public Dealer() {
		naipe= new ArrayList<Carta>();
		generarNaipe();
	}

	public ArrayList<Carta> getNaipe() {
		return naipe;
	}

	public void setNaipe(ArrayList<Carta> naipe) {
		this.naipe = naipe;
	}

	// Método generarNaipe(), no retorna
	public void generarNaipe() {

		naipe = new ArrayList<Carta>();

		ArrayList<String> valores = new ArrayList<String>();
		valores.add("A");
		valores.add("2");
		valores.add("3");
		valores.add("4");
		valores.add("5");
		valores.add("6");
		valores.add("7");
		valores.add("8");
		valores.add("9");
		valores.add("10");
		valores.add("J");
		valores.add("Q");
		valores.add("K");

		ArrayList<String> palos = new ArrayList<String>();
		palos.add("T");
		palos.add("CN");
		palos.add("D");
		palos.add("CR");

		for (String palo : palos) {

			for (String valor : valores) {

				Carta carta = new Carta();

				carta.setValor(valor);
				carta.setPalo(palo);

				naipe.add(carta);
			}
		}
	}
	
	
	//Método imprimirNaipe
	public void imprimirNaipe() {

		for (Carta carta : naipe) {
			carta.imprimir();
		}

	}
	
	//Método Aleatorio
	
	public int  generarAleatorio(int maximo) {
		
		return (int) (Math.random() * (maximo + 1));
	}

	
//	
//	5. Entregar carta
//	En Dealer, Crear método:
//	entregarCarta()
//	• No recibe parámetros
//	• Retorna una Carta
//	Lógica:
//
//	1. Llamar a generarAleatorio, se le pasa como parámetro el tamaño del
//	ArrayList de naipe -1.
//	2. Recupera la carta en esa posición y guarda en una variable
//	3. Elimina la carta del ArrayList , con el método remove, que recibe la posición
//	del objeto a eliminar
//	4. Retornar la carta elegida
//	Esto simula que la carta ya no puede volver a salir.
	
	// Método entregar carta
	
	public Carta entregarCarta(){
		int posicion = generarAleatorio(naipe.size() - 1);
		Carta carta = naipe.get(posicion);
		naipe.remove(posicion);
		return carta;
		
				
	}
	
	
	
	
	
}
