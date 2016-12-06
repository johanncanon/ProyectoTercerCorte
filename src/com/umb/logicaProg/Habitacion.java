package com.umb.logicaProg;

public class Habitacion {

	/**
	 * 
	 */
	private int numeroPuerta;

	/**
	 * 
	 */
	private String colorPuerta;

	/**
	 * 
	 */
	private String nombre;

	/**
	 * 
	 */
	private String nacionalidad;

	/**
	 * 
	 */
	private String lenguajeProg;

	/**
	 * 
	 */
	private String sistO;

	/**
	 * Contructor de la clase, Asecas
	 */
	public Habitacion() {

	}

	/**
	 * Constructor de la clase Habitacion con los parametros
	 * 
	 * @param colorPuerta
	 * @param nombre
	 * @param nacionalidad
	 * @param lenguajeProg
	 * @param sistO
	 */
	public Habitacion(int numeroPuerta, String colorPuerta, String nombre, String nacionalidad, String lenguajeProg,
			String sistO) {
		this.numeroPuerta = numeroPuerta;
		this.colorPuerta = colorPuerta;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.lenguajeProg = lenguajeProg;
		this.sistO = sistO;
	}

	public int getNumeroPuerta() {
		return numeroPuerta;
	}

	public void setNumeroPuerta(int numeroPuerta) {
		this.numeroPuerta = numeroPuerta;
	}

	public String getColorPuerta() {
		return colorPuerta;
	}

	public void setColorPuerta(String colorPuerta) {
		this.colorPuerta = colorPuerta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getLenguajeProg() {
		return lenguajeProg;
	}

	public void setLenguajeProg(String lenguajeProg) {
		this.lenguajeProg = lenguajeProg;
	}

	public String getSistO() {
		return sistO;
	}

	public void setSistO(String sistO) {
		this.sistO = sistO;
	}

	/**
	 * METODOS LISTOS PARA DEFINIR
	 */

	



	

	@Override
	public String toString() {
		return "Habitacion [numeroPuerta=" + numeroPuerta + ", colorPuerta=" + colorPuerta + ", nombre=" + nombre
				+ ", nacionalidad=" + nacionalidad + ", lenguajeProg=" + lenguajeProg + ", sistO=" + sistO + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colorPuerta == null) ? 0 : colorPuerta.hashCode());
		result = prime * result + ((lenguajeProg == null) ? 0 : lenguajeProg.hashCode());
		result = prime * result + ((nacionalidad == null) ? 0 : nacionalidad.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + numeroPuerta;
		result = prime * result + ((sistO == null) ? 0 : sistO.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Habitacion other = (Habitacion) obj;
		if (colorPuerta == null) {
			if (other.colorPuerta != null)
				return false;
		} else if (!colorPuerta.equals(other.colorPuerta))
			return false;
		if (lenguajeProg == null) {
			if (other.lenguajeProg != null)
				return false;
		} else if (!lenguajeProg.equals(other.lenguajeProg))
			return false;
		if (nacionalidad == null) {
			if (other.nacionalidad != null)
				return false;
		} else if (!nacionalidad.equals(other.nacionalidad))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numeroPuerta != other.numeroPuerta)
			return false;
		if (sistO == null) {
			if (other.sistO != null)
				return false;
		} else if (!sistO.equals(other.sistO))
			return false;
		return true;
	}

}
