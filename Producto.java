public class Producto{
	private String nombre;
	private int cantidad;
	private double precio;

	public Producto(String nombre, int cantidad, double precio){
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public void setPrecio(double precio){
		this.precio = precio;
	}

	public void setCantidad(int cantidad){
		this.cantidad = cantidad;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public int getCantidad(){
		return cantidad;
	}
	public double getPrecio(){
		return precio;
	}

	public double calcularPrecio(int cantidadProductos){
		return 1.13 * cantidadProductos * precio;
	}

	public boolean comprar(int cantidadProductos){
		boolean sePuedeComprar = false;
		if(cantidad >= cantidadProductos){
			sePuedeComprar = true;
			cantidad -= cantidadProductos;
		}
		return sePuedeComprar;
	}

	public String toString(){
		return "Nombre " + nombre + ", precio " + precio + ", stock " + cantidad + "\n"; 
	}
}