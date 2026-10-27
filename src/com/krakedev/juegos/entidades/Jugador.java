package com.krakedev.juegos.entidades;

import java.util.ArrayList;

public class Jugador {

	private String nickname;
	private ArrayList<Carta> cartas = new ArrayList<Carta>();
	private int puntajeCartas;

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}

	public int getPuntajeCartas() {
		return puntajeCartas;
	}

	public void setPuntajeCartas(int puntajeCartas) {
		this.puntajeCartas = puntajeCartas;
	}

	// Método recibirCarta
	// • Recibe una Carta
	// • La agrega al ArrayList

	// metodo recibe cartas
	public void recibirCarta(Carta carta) {
		cartas.add(carta);
	}

//	En Jugador: Agregar un método imprimir
//	• Que imprima en consola el nickName del jugador y además sus cartas asignadas.

	public void imprimir() {
		System.out.println("Nicknmae del jugador: " + nickname);
		for (Carta carta : cartas) {
			carta.imprimir();
		}
	}

}
