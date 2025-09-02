public class Mazo {
	private Carta carta1;
	private Carta carta2;


	public Mazo (){
		carta1 = new Carta (7, "Espadas");
		carta2 = new Carta (5, "Corazones");
	}

	public void imprimir(){
		carta1.imprimir();
		carta2.imprimir();
	}

	public static void main (String [] args){
		Mazo mazo = new Mazo();
		mazo.imprimir();
	}
}