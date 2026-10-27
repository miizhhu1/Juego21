package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

	public static void main(String[] args) {
		
//		En test, crear clase TestJuego21, con un main, dentro del main:
//			• Instanciar Juego21
//			• Agregar 3 jugadores
//			• Invocar a inicializar
//			• Invocar a repartirRonda()
//
//			• Verificar que cada jugador tenga una carta diferente (imprimir las cartas
//			asignadas a cada jugador) y verificar que esas cartas ya salieron del naipe(puede
//			invocar al método imprimir del naipe que tiene el Dealer)
		
		
		// TODO Auto-generated method stub
		
		//Instanciar Juego21
		Juego21 juego = new Juego21();
		
		//Agregar 3 jugadores
		Jugador jugador1 = new Jugador();
		jugador1.setNickname("Cris");
		juego.agregarJugador(jugador1);
		
		Jugador jugador2 = new Jugador();
		jugador2.setNickname("Kevin");
		juego.agregarJugador(jugador2);
		
		Jugador jugador3 = new Jugador();
		jugador3.setNickname("Mishell");
		juego.agregarJugador(jugador3);
		
		//Invocar a inicializar
		juego.inicializar();
		
		//Invocar a repartirRonda()
		juego.repartirRonda();
		
		//imprimir las cartas asignadas a cada jugador
		System.out.println("=== CARTAS DE LOS JUGADORES ===");
        jugador1.imprimir();
        jugador2.imprimir();
        jugador3.imprimir();
        
        
        //Imprimir las cartas que quedan en el naipe
        System.out.println("");
        System.out.println("=== CARTAS QUE QUEDAN EN EL NAIPE ===");
        juego.getDealer().imprimirNaipe();
	}

}
