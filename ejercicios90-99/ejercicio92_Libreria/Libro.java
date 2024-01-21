package ejercicio92_Libreria;

public class Libro {

	private String titulo, autor;
	private int cantidadLibros, cantidadPrestados;

	public Libro() {

	}

	public Libro(String titulo, String autor, int cantidadLibors, int cantidadPrestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.cantidadLibros = cantidadLibors;
		this.cantidadPrestados = cantidadPrestados;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getCantidadLibros() {
		return cantidadLibros;
	}

	public void setCantidadLibros(int cantidadLibros) {
		this.cantidadLibros = cantidadLibros;
	}

	public int getCantidadPrestados() {
		return cantidadPrestados;
	}

	public void setCantidadPrestados(int cantidadPrestados) {
		this.cantidadPrestados = cantidadPrestados;
	}
	
	public boolean darPrestamo() {
		boolean prestado = true;
		if(cantidadPrestados<cantidadLibros){
			cantidadPrestados++;
		} else {
			prestado = false;
		}
		return prestado;
	}
	
	public boolean devolverLibro() {
		boolean devuelto = true;
		if(cantidadPrestados == 0) {
			devuelto = false;
		} else { 
			cantidadPrestados--;
		}
		return devuelto;
	}

}
