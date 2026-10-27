package com.krakedev.juegos.test;

import java.util.ArrayList;

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
		
	
	
		//Ejecutar 10 partidas
        for (int i = 1; i <= 10; i++) {

            System.out.println("\n===== PARTIDA " + i + " =====");

            juego.inicializar();

            ArrayList<Jugador> ganadores = juego.jugar();

            if (ganadores.isEmpty()) {
                System.out.println("No hubo ganadores.");
            } else {
                System.out.println("Ganadores:");

                for (Jugador ganador : ganadores) {
                    System.out.println(ganador.getNickname() + " - Puntaje: " + ganador.getPuntajeCartas());
                }
            }

            System.out.println("Puntajes finales:");
            System.out.println(jugador1.getNickname() + ": " + jugador1.getPuntajeCartas());
            System.out.println(jugador2.getNickname() + ": " + jugador2.getPuntajeCartas());
            System.out.println(jugador3.getNickname() + ": " + jugador3.getPuntajeCartas());
        }
	}

}
