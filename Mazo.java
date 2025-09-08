public class Mazo {
	private Carta carta1;
	private Carta carta2;


	public Mazo (){
		for(int palo = 0; palo < 4; palo++){
			for(int numero = 1; numero <= 13 ; numero++){
				Carta carta = new Carta(numero, getPalo(palo));
				System.out.println(carta);
			}
		}
	}

	private String getPalo(int paloNumero){
		String palo = "";
		if(paloNumero == 0){
			palo = "Diamantes";
		}
		else if (paloNumero == 1){
			palo = "Corazones";
		}
		else if (paloNumero == 2){
			palo = "Treboles";
		}
		else if (paloNumero == 3){
			palo = "Espadas";
		}
		return palo;
	}

	public void imprimir(){
		System.out.println(carta1);
		System.out.println(carta2);
	}

	public static void main (String [] args){
		Mazo mazo = new Mazo();
		mazo.imprimir();
	}
}