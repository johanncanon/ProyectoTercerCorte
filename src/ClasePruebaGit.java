import java.util.ArrayList;

public class ClasePruebaGit {

	private String ejemplo;
	private int idEjemplo;
	private long ejemplo2;
	private ArrayList<String> ListaEjeplos;

	public ClasePruebaGit() {

	}

	public ClasePruebaGit(String ejemplo, int idEjemplo, long ejemplo2) {
		ListaEjeplos = new ArrayList<>();
		this.ejemplo = ejemplo;
		this.idEjemplo = idEjemplo;
		this.ejemplo2 = ejemplo2;
	}

	public String getEjemplo() {
		return ejemplo;
	}

	public void setEjemplo(String ejemplo) {
		this.ejemplo = ejemplo;
	}

	public int getIdEjemplo() {
		return idEjemplo;
	}

	public void setIdEjemplo(int idEjemplo) {
		this.idEjemplo = idEjemplo;
	}

	public long getEjemplo2() {
		return ejemplo2;
	}

	public void setEjemplo2(long ejemplo2) {
		this.ejemplo2 = ejemplo2;
	}

	public ArrayList<String> getListaEjeplos() {
		return ListaEjeplos;
	}

	public void setListaEjeplos(ArrayList<String> listaEjeplos) {
		ListaEjeplos = listaEjeplos;
	}

	@Override
	public String toString() {
		return "ClasePruebaGit [ejemplo=" + ejemplo + ", idEjemplo=" + idEjemplo + ", ejemplo2=" + ejemplo2
				+ ", ListaEjeplos=" + ListaEjeplos + ", getEjemplo()=" + getEjemplo() + ", getIdEjemplo()="
				+ getIdEjemplo() + ", getEjemplo2()=" + getEjemplo2() + ", getListaEjeplos()=" + getListaEjeplos()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ListaEjeplos == null) ? 0 : ListaEjeplos.hashCode());
		result = prime * result + ((ejemplo == null) ? 0 : ejemplo.hashCode());
		result = prime * result + (int) (ejemplo2 ^ (ejemplo2 >>> 32));
		result = prime * result + idEjemplo;
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
		ClasePruebaGit other = (ClasePruebaGit) obj;
		if (ListaEjeplos == null) {
			if (other.ListaEjeplos != null)
				return false;
		} else if (!ListaEjeplos.equals(other.ListaEjeplos))
			return false;
		if (ejemplo == null) {
			if (other.ejemplo != null)
				return false;
		} else if (!ejemplo.equals(other.ejemplo))
			return false;
		if (ejemplo2 != other.ejemplo2)
			return false;
		if (idEjemplo != other.idEjemplo)
			return false;
		return true;
	}

}
