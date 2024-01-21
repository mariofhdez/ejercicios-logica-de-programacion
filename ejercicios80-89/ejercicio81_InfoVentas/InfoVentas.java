package ejercicio81_InfoVentas;

public class InfoVentas {
	
	private int cantidad;
	private double precioUnitario;
	private int descuento;
	private double valorTotal;
	public InfoVentas(int cantidad, double precioUnitario) {
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.descuento = calcularDescuento(cantidad);
		this.valorTotal = calcularValorTotal(cantidad, precioUnitario, descuento);
	}
	private int calcularDescuento(int cantidad) {
		if(cantidad >= 200) {
			descuento = 25;
		} else if (cantidad >= 100 && cantidad < 200) {
			descuento = 20;
		} else if (cantidad>=24 && cantidad < 100) {
			descuento = 10;
		}
		return descuento;
	}
	private double calcularValorTotal(int cantidad, double precioUnitario, int descuento) {
		double subTotal = cantidad * precioUnitario;
		return subTotal - (subTotal * descuento / 100);
	}
	public int getCantidad() {
		return cantidad;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public int getDescuento() {
		return descuento;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	
	

}
