package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;

public class Juego21 {

	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	private Dealer dealer;

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

//	Método cargarValores
//	Este método asigna el valorJuego a cada carta del naipe. Recuerde que el naipe es un
//	atributo del dealer. En el juego del 21, las cartas tienen estos valores:
//	• "A" → 11
//	• "J", "Q", "K" → 10
//	• Números → su valor numérico (ej: "9" → 9). Para convertir un String a su valor
//	entero, se usa el método Integer.parseInt, ejemplo: int x = Integer.parseInt(a).
//	Siendo a, el valor String.
//	Usar un for para recorrer todas las cartas y un if o switch para asignar valores.

	// metodo cargar valores

	public void cargarValores() {
		for (Carta carta : dealer.getNaipe()) {
			if (carta.getValor().equals("A")) {
				carta.setValorJuego(11);
			} else if (carta.getValor().equals("J") || carta.getValor().equals("Q") || carta.getValor().equals("K")) {
				carta.setValorJuego(10);
			} else {
				carta.setValorJuego(Integer.parseInt(carta.getValor()));
			}
		}
	}

//	En Juego21: método inicializar
//	• Instancia el Dealer
//	• Invoca a cargarValores

	// metodo inicializar
	public void inicializar() {
		dealer = new Dealer();
		cargarValores();
	}

//	En Juego21: método agregarJugador
//	• Recibe un Jugador
//	• Lo agrega a la lista

	// agregar jugador
	public void agregarJugador(Jugador jugador) {
		jugadores.add(jugador);
	}

//	En Juego21: Método repartirCarta(Jugador jugador), recibe un
//	jugador
//	• Pide una carta al Dealer (entregarCarta)
//	• Se la entrega al jugador usando su método recibirCarta
	
	public void repartirCarta(Jugador jugador) {
		Carta carta = dealer.entregarCarta();
		jugador.recibirCarta(carta);		
	}
	
//	En Juego21:Método repartirRonda
//	• Entrega una carta a cada jugador. Para esto debe barrerse el ArrayList de
//	jugadores, en cada iteración invocar a repartirCarta y pasarle el jugador.
//	• De esta forma le van a entregar una carta aleatoria a cada jugador
	
	//repartir ronda
	
	public void repartirRonda() {
		for(Jugador jugador : jugadores) {
			repartirCarta(jugador);
		}
		 calcularTotal();
	}
	
	
//	En la clase Juego21, crear el método:
//		calcularTotal(): Su objetivo es sumar los puntos de todas las cartas
//		asignadas, por ejemplo si al jugador le tocó un A y una J su valor es
//		de 21.
//		Con un for, de cada jugador hace lo siguiente:
//		• Suma el valorJuego de todas las cartas de un jugador y acumula en una
//		variable
//		• Guarda el resultado en el atributo valorTotal del jugador
	
	
	//calcular total
	public void calcularTotal() {
		for (Jugador jugador : jugadores) {
	        int total = 0;

	        for (Carta carta : jugador.getCartas()) {
	            total = total + carta.getValorJuego();
	        }

	        jugador.setPuntajeCartas(total);
	    }
	}

}
