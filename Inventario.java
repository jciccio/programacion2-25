public class Inventario{
	private Producto [] productos;
	private int cantidadUsados;

	public Inventario(int cantidad){
		productos = new Producto[cantidad]; // [null, null, null]
		cantidadUsados = 0;
	}

	private Producto[] aumentarArreglo(){
		Producto [] nuevo = new Producto[productos.length+1];
		for(int i = 0 ; i < productos.length; i++){
			nuevo[i] = productos[i];
		}
		return nuevo;
	}

	public void agregarProducto(Producto productoNuevo){
		boolean agregado = false;
		for(int i = 0 ; i < productos.length && !agregado; i++){
			if(productos[i] == null){
				agregado = true;
				productos[i] = productoNuevo;
			}
		}
		if(!agregado){
			productos = aumentarArreglo();
			productos[productos.length-1] = productoNuevo;
		}
		cantidadUsados++;
	}

	public Producto obtenerProducto(String nombre){
		Producto encontrado = null;
		int contador = 0;
		while(contador < productos.length && encontrado == null){
			String nombreProducto = productos[contador].getNombre();
			if(nombreProducto.equalsIgnoreCase(nombre)){
				encontrado = productos[contador];
			}
			contador++;
		}
		return encontrado;
	}

	public String toString(){
		String inventario = "Inventario actual:\n";
		for(int i = 0; i < productos.length; i++){
			inventario += productos[i];
		}
		return inventario;
	}

	// Retorna un numero entero con la posicion del arreglo del producto
	// Si el producto no se encuentra, retornará -1
	public int obtenerPosicionProducto(String nombre){
		Producto encontrado = null;
		int posicionProducto = -1;
		int contador = 0;
		while(contador < productos.length && encontrado == null){
			String nombreProducto = productos[contador].getNombre();
			if(nombreProducto.equalsIgnoreCase(nombre)){
				encontrado = productos[contador];
				posicionProducto = contador;
			}
			contador++;
		}
		return posicionProducto;
	}

	public boolean eliminarProducto(String nombre){
		boolean encontrado = false;
		int posicion = obtenerPosicionProducto(nombre);
		if(posicion != -1){
			encontrado = true;
			for(int i = posicion; i < productos.length-1; i++){
				productos[i] = productos[i+1];
			}
			productos[productos.length-1] = null;
		}
		return encontrado;
	}
}