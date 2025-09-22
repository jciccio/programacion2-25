public class Mazo {
	private Carta [] carta;

	public Mazo (){
		carta = new Carta [52];
		int indice = 0;
		String [] palos = {"Diamantes", "Corazones", "Treboles", "Espadas"};
		for(int palo = 0; palo < 4; palo++){
			for(int numero = 1; numero <= 13 ; numero++){
				carta[indice] = new Carta(numero, palos[palo]);
				indice++;
			}
		}
	}

	public void revolver(){
		for(int i = 0; i < carta.length; i++){
			int celdaAleatoria = (int)(Math.random()*carta.length);
			Carta temporal = carta[i];
			carta[i] = carta[celdaAleatoria];
			carta[celdaAleatoria] = temporal;
		}
	}

	public void imprimir(){
		for(int i = 0 ; i < carta.length; i++){
			System.out.println(carta[i]);
		}
	}

	public Carta getCarta(int indice){
		return carta[indice];
	}

	public static void main (String [] args){
		Mazo mazo = new Mazo();
		//mazo.imprimir();
		Carta carta = mazo.getCarta((int)(Math.random()*52));
		//System.out.println(carta);

		mazo.revolver();
		mazo.imprimir();
	}
}