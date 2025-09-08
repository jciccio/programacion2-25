public class PruebaSimulacionDados{
	public static void main (String [] args){
		Interfaz interfaz = new Interfaz();
		SimulacionDados simulacion = new SimulacionDados();
		int repeticiones = interfaz.solicitarNumeroEntero("Digite la cantidad de iteraciones para la simulacion");
		simulacion.simular(repeticiones);

		String resultados = "La cantidad de 7 es: " + 
								simulacion.getCantidad7() +
								"\nLa cantidad de 11 es: " + 
								simulacion.getCantidad11() +
								"\nLa cantidad de 12 es: " +
								simulacion.getCantidad12();

		System.out.println(resultados);

	}
}