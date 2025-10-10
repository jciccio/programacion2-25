public class Compras{

	private Inventario inventario;

	public void setInventario(Inventario inventario){
		this.inventario = inventario;
	}

	private boolean retrocederEstado(String [] elementos, boolean [] compras){
		boolean hayQueRetroceder = false;
		for(int i = 0; i < compras.length && !hayQueRetroceder ;i++){
			if(!compras[i]){
				hayQueRetroceder = true;
			}
		}

		for(int i = 0; i < compras.length && hayQueRetroceder ;i++){
			if(compras[i]){
				String [] partes = elementos[i].split(",");
				String nombre = partes[0];
				int cantidad = Integer.parseInt(partes[1]);
				Producto producto = inventario.obtenerProducto(nombre);
				producto.setCantidad(producto.getCantidad() + cantidad);
			}
		}
		return hayQueRetroceder;
	}

	public boolean realizarCompra(String [] elementos){
		// ["Nintendo Switch,1", "Coca Cola,15", "Lapicero,155"];
		boolean compraRealizada = true;
		boolean [] comprados = new boolean[elementos.length];
		for(int i = 0; i < elementos.length; i++){
			String [] partes = elementos[i].split(","); // i = 0 => "Nintendo Switch,1"
			// ["Nintendo Switch", "1"]
			String nombre = partes[0];
			int cantidad = Integer.parseInt(partes[1]);
			Producto producto = inventario.obtenerProducto(nombre);
			if(producto != null){
				boolean comprado = producto.comprar(cantidad);
				comprados[i] = comprado;
				if(!comprado){
					compraRealizada = false;
				}
			}
			else{
				compraRealizada = false;
			}
		}
		if(!compraRealizada){
			retrocederEstado(elementos,comprados);
		}
		return compraRealizada;
	}

	public static void main (String [] args){
		Producto p1 = new Producto("Coca Cola", 1000, 890.25);
		Producto p2 = new Producto("Nintendo Switch", 100, 300000);
		Producto p3 = new Producto("Lapicero", 10000, 250);
		Producto p4 = new Producto("Hojas Papel", 12000, 100);
		Inventario inventario = new Inventario(3);
		inventario.agregarProducto(p1);
		inventario.agregarProducto(p2);
		inventario.agregarProducto(p3);
		inventario.agregarProducto(p4);
		Compras compras = new Compras();
		compras.setInventario(inventario);
		System.out.println("Inventario Inicial");
		System.out.println(inventario);
		String [] compraARealizar = {"Nintendo Switch,1", "Coca Cola,50", "Lapicero,12", "Hojas Papel,2500"};
		compras.realizarCompra(compraARealizar);
		System.out.println(inventario);

		String [] compraARealizar2 = {"Nintendo Switch,1", "Coca Cola,50", "Lapicero,12", "Hojas Papel,92500"};
		compras.realizarCompra(compraARealizar2);
		System.out.println(inventario);
	}
}