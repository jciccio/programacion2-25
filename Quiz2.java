public class Quiz2 {
	
	public int sumarDigitos(int numero){
		int suma = 0;
		while(numero != 0){ // 123
			suma += (numero % 10);
			numero /= 10; //<=> numero = numero / 10;
		}
		return suma;
	}

	public int sumarDigitosStrings(int numero){
		String numeroString = ""+numero;// new String(numero); 
		int resultado = 0;
		for(int i = 0; i < numeroString.length() ; i++){
			char letra = numeroString.charAt(i);
			int numero = Integer.parseInt("" + letra);
			resultado += numero;
		}
	}

	public int sumarDigitosStrings(int numero){
		String numeroString = ""+numero;// new String(numero); 
		char [] numeroLetras = numeroString.toCharArray();
		int resultado = 0;
		for(int i = 0; i < numeroLetras.length ; i++){
			int numero = Integer.parseInt("" + numeroLetras[i]);
			resultado += numero;
		}
	}
}