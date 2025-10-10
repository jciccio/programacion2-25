public class PruebaInventario{
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
		System.out.println(inventario);
		inventario.eliminarProducto("Coca Cola");
		System.out.println(inventario);
		inventario.eliminarProducto("Hojas Papel");
		System.out.println(inventario);
	}
}