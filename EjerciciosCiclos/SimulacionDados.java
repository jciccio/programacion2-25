public class SimulacionDados{
	private int cantidad7;
	private int cantidad11;
	private int cantidad12;

	public SimulacionDados(){
		reiniciarValores();
	}

	public void reiniciarValores(){
		cantidad7 = 0;
		cantidad11 = 0;
		cantidad12 = 0;
	}

	public void simular(int iteraciones){
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		reiniciarValores();

		for(int i = 0; i < iteraciones ; i++){
			dado1.lanzar();
			dado2.lanzar();

			int suma = dado1.getValor() + dado2.getValor();
			if(suma == 7){
				cantidad7++;
			}
			else if(suma == 11){
				cantidad11++;
			}
			else if(suma == 12){
				cantidad12++;
			}
		}
	}

	public int getCantidad7(){
		return cantidad7;
	}

	public int getCantidad11(){
		return cantidad11;
	}
	public int getCantidad12(){
		return cantidad12;
	}

}