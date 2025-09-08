public class Carta{
	private String palo;
	private int numero;

	public Carta(int numero, String palo){
		this.palo = palo;
		this.numero = numero;
	}

	public String toString(){
		return convertirNumeroAString() + " de " + palo;
	}


	public String convertirNumeroAString(){
		String valor = "";
		switch(numero){
			case 1:
				valor = "As";
			break;
			case 11:
				valor = "J";
				break;
			case 12:
				valor = "Q";
				break;
			case 13:
				valor = "K";
				break;
			default:
				valor = ""+numero;

		}
		return valor;
	}

	public static void main (String [] args){
		Carta carta1 = new Carta(6, "Espadas");
		System.out.println(carta1);
	}

}