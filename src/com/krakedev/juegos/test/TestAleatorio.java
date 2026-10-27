package com.krakedev.juegos.test;

import com.krakedev.juegos.servicios.Dealer;

public class TestAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dealer dealer = new Dealer();
		
		int maximo = 15;

        boolean encontroCero = false;
        boolean encontroMaximo = false;
        boolean fueraDeRango = false;

        for (int i = 0; i < 100; i++) {

            int numero = dealer.generarAleatorio(maximo);

            System.out.println(numero);

            if (numero == 0) {
                encontroCero = true;
            }

            if (numero == maximo) {
                encontroMaximo = true;
            }

            if (numero < 0 || numero > maximo) {
                fueraDeRango = true;
            }
        }

        System.out.println("Se encontro el cero: " + encontroCero);
        System.out.println("Se encontro el maximo: " + encontroMaximo);
        System.out.println("Hay numeros fuera del rango: " + fueraDeRango);
    
	}

}
