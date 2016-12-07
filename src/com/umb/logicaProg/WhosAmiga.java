package com.umb.logicaProg;

public class WhosAmiga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Habitacion habitacionObj = new Habitacion();
		Juego jugar = new Juego();

		// SE INICIÓ EL ARREGLO CON EL CONTENIDO DEL ARREGLO
		jugar.iniciarArregloHabitacion();

		habitacionObj.setColorPuerta("azul");
		habitacionObj.setLenguajeProg("Java");
		habitacionObj.setNacionalidad("Danés");
		habitacionObj.setNombre("ana");
		habitacionObj.setNumeroPuerta(0);
		habitacionObj.setSistO("Mac");

		// SE VA A JUGAR
		try {
			jugar.igual(habitacionObj);
		} catch (NullPointerException e) {
			throw e;
		}
		

	}

}
