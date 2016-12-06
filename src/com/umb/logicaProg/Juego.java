package com.umb.logicaProg;

public class Juego {
	
	/**
	 * 
	 */
	private Habitacion habitacionModelo;
	
	/**
	 * 
	 */
	private Habitacion[ ] habitacoinArray;
	
	/**
	 * 
	 */
	private Integer respuesta;
	
	/**
	 * 
	 */
	private int contador=5;

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
		habitacionModelo = habitacion;
		habitacoinArray = new Habitacion [5];
	} 
	
	/**
	 * 
	 * METODOS PARA HACER CONDICIONES DEL JUEGO: POSICION IGUAL, IZQUIERDA, DERECHA Y SIGUIENTE
	 * 
	 */
	
	/**
	 * METODO QUE MUESTRA EN NUM DE LA HABITACION SEGUN EL OBJETO HABITACION ENVIADO COMO PARAMETRO
	 * @param hab
	 */
	public String igual(Habitacion hab){
		
		for (int i = 0; i < habitacoinArray.length; i++) {
			
			if (habitacoinArray[i].getColorPuerta() == hab.getColorPuerta() && 
					habitacoinArray[i].getNacionalidad() == hab.getNacionalidad()) {
				respuesta = habitacoinArray[i].getNumeroPuerta(); 
			}
		}
		
		contador --;
		
		return "El numero de la habitacion es: " + respuesta + " . Te quedan " + contador + " turnos.";
	}
	
	
	
	

}
