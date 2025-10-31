public class Quiz5{
	
	public String convertirBinario(int numero){
		String retorno = "";
		if(numero != 0){
			retorno +=   convertirBinario(numero/2) + numero%2;
		}
		return retorno;
	}

	public String invertir(String palabra, int i){
		String retorno = "";
		if(i < palabra.length() ){
			retorno +=   invertir(palabra, i+1) + palabra.charAt(i);
		}
		return retorno;
	}

	// Si suponemos que i es palabra.length() - 1
	public String invertir2(String palabra, int i){
		String retorno = "";
		if(i >= 0 ){
			retorno += palabra.charAt(i) + invertir(palabra, i-1) ;
		}
		return retorno;
	}

	public String invertirCiclo(String palabra){
		String palabraInvertida = "";
		for(int i = 0; i < palabra.length(); i++){
			int posicion = palabra.length() - 1 - i;
			palabraInvertida += palabra.charAt(posicion);
		}
		return palabraInvertida;
	}

	public String invertirCiclo2(String palabra){
		String palabraInvertida = "";
		for(int i = palabra.length()-1; i >= 0; i--){
			palabraInvertida += palabra.charAt(i);
		}
		return palabraInvertida;
	}

	public String invertir3(String palabra){
		StringBuilder palabraS = new StringBuilder(palabra);
		return palabraS.reverse().toString();
	}


	public static void main(String [] args){
		Quiz5 q5 = new Quiz5();
		System.out.println(q5.convertirBinario(9));
		System.out.println(q5.convertirBinario(8));
		System.out.println(q5.invertir("hola",0));
	}

}

