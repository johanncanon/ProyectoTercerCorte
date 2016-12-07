package com.umb.logicaProg;

public class Juego {

	/**
	 * 
	 */
	private Habitacion habitacionModelo;

	/**
	 * 
	 */
	private Habitacion[] habitacoinArray;

	/**
	 * 
	 */
	private Integer numHab;

	/**
	 * 
	 */
	private String respuesta;

	/**
	 * 
	 */
	private int contador = 5;

	/**
	 * 
	 */
	private boolean termino;

	/**
	 * 
	 */
	public Juego() {

	}

	/**
	 * 
	 * @param habitacion
	 */
	public Juego(Habitacion habitacion) {
		respuesta = null;
		habitacionModelo = habitacion;
		
	}

	/**
	 * 
	 * METODOS PARA HACER CONDICIONES DEL JUEGO: POSICION IGUAL, IZQUIERDA,
	 * DERECHA Y SIGUIENTE
	 * 
	 */

	public void iniciarArregloHabitacion() {
		
		habitacoinArray = new Habitacion[5];
		
		habitacoinArray[0].setColorPuerta("azul");
		habitacoinArray[1].setColorPuerta("verde");
		habitacoinArray[2].setColorPuerta("rojo");
		habitacoinArray[3].setColorPuerta("blanco");
		habitacoinArray[4].setColorPuerta("amarillo");

		habitacoinArray[0].setLenguajeProg("C");
		habitacoinArray[1].setLenguajeProg("C++");
		habitacoinArray[2].setLenguajeProg("Java");
		habitacoinArray[3].setLenguajeProg("Pyton");
		habitacoinArray[4].setLenguajeProg("Perl");

		habitacoinArray[0].setNacionalidad("Danés");
		habitacoinArray[1].setNacionalidad("Finlandés");
		habitacoinArray[2].setNacionalidad("Islandés");
		habitacoinArray[3].setNacionalidad("Noruego");
		habitacoinArray[4].setNacionalidad("Suizo");

		habitacoinArray[0].setNombre("Ana");
		habitacoinArray[1].setNombre("Chris");
		habitacoinArray[2].setNombre("Ellen");
		habitacoinArray[3].setNombre("David");
		habitacoinArray[4].setNombre("Bernard");

		habitacoinArray[0].setNumeroPuerta(1);
		habitacoinArray[1].setNumeroPuerta(5);
		habitacoinArray[2].setNumeroPuerta(2);
		habitacoinArray[3].setNumeroPuerta(4);
		habitacoinArray[4].setNumeroPuerta(3);

		habitacoinArray[0].setSistO("Windows");
		habitacoinArray[1].setSistO("Linux");
		habitacoinArray[2].setSistO("Amiga");
		habitacoinArray[3].setSistO("Atary");
		habitacoinArray[4].setSistO("Mac");

	}

	/**
	 * METODO QUE MUESTRA EN NUM DE LA HABITACION SEGUN EL OBJETO HABITACION
	 * ENVIADO COMO PARAMETRO
	 * 
	 * @param hab
	 */
	public String igual(Habitacion hab) {

		for (int i = 0; i < habitacoinArray.length && !termino; i++) {

			if (habitacoinArray[i].getColorPuerta().equalsIgnoreCase(hab.getColorPuerta()) 
					&& habitacoinArray[i].getNombre().equalsIgnoreCase(hab.getNombre()) ) {

				numHab = habitacoinArray[i].getNumeroPuerta();

				termino = true;
			} else {

				respuesta = habitacoinArray[i].getLenguajeProg();
				termino = true;
			}
		}

		contador--;

		if (numHab != null) {
			return "El numero de la habitacion es: " + numHab + " . Te quedan " + contador + " turnos.";
		} else {
			return "El lenguaje de programacion es: " + respuesta + " . Te quedan " + contador + " turnos.";
		}

	}

}
