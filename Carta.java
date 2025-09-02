public class Carta{
	private String palo;
	private int numero;

	public Carta(int numero, String palo){
		this.palo = palo;
		this.numero = numero;
	}

	public void imprimir(){
		System.out.println( numero + " de " + palo);
	}

}