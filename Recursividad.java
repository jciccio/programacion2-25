public class Recursividad{
	
	public int calcularFactorial(int n){
		int resultado = -1;
		if(n == 0){
			resultado = 1;
		}
		else if(n > 0){
			resultado = n * calcularFactorial(n-1);
		}
		return resultado;
	}
	
	public int calcularSumatoria(int n){
		int suma = 0;
		if(n == 0){// Caso trivial o base
			suma = 0;
		}
		else if(n>0){
			suma = n + calcularSumatoria(n-1);
		}
		return suma;
	}



	public int calcularFibonacci(int n){
		int resultado = 0;
		if(n == 0){
			resultado = 0;
		}
		else if (n == 1){
			resultado = 1;
		}
		else if (n > 1){
			resultado = calcularFibonacci(n-1) + calcularFibonacci(n-2);
		}
		return resultado;
	}
	// f (0) = 0
	// f (1) = 1
	// f (n-1) + f(n-2)
	// 0 1 1 2 3 5 8 13 21...
	// 0 1 2 3 4 5 6 7  8.... 
	// []

	public int calcularFibonacciArreglo(int n){
		int [] numerosFibonacci = new int [n+1];
		for(int i = 0 ; i < numerosFibonacci.length ; i++){
			numerosFibonacci[i] = -1;
		}//[-1,-1,-1,-1]
		return calcularFibonacciOptimizado(n, numerosFibonacci);
	}

	private int calcularFibonacciOptimizado(int n, int [] valores){
		int resultado = 0;
		if(valores[n] != -1){
			resultado = valores[n];
		}
		else if(n == 0){
			resultado = 0;
			valores[n] = resultado;
		}
		else if (n == 1){
			resultado = 1;
			valores[n] = resultado;
		}
		else if (n > 1){
			resultado = calcularFibonacciOptimizado(n-1, valores) + 
						calcularFibonacciOptimizado(n-2, valores);
			valores[n] = resultado;
		}
		return resultado;
	}

	public void calcularHanoi(int n, int origen, int intermedio, int destino){
		if(n == 1){ // Caso trivial o base
			System.out.println("Mover " + n + " de " + origen + " a "+ destino);
		}
		else{ // Casos recursivos
			calcularHanoi(n-1, origen, destino, intermedio);
			System.out.println("Mover " + n + " de " + origen + " a "+ destino);
			calcularHanoi(n-1,intermedio, origen, destino);
		}
	}

	public void llamadosRecursivos(String [] arreglo, int indice, boolean agregar){
		if(indice < arreglo.length){
			
			System.out.println("Estamos viendo "+ arreglo[indice] + " la agregamos? " + agregar);
			llamadosRecursivos(arreglo, indice+1, true);
			llamadosRecursivos(arreglo, indice+1, false);
			
		}
	}

	public static void main (String [] args){
		Recursividad r = new Recursividad();
		System.out.println("El resultado de la sumatoria de 5 es: " + r.calcularSumatoria(5));
		System.out.println("El resultado del factorial de 5 es: " + r.calcularFactorial(5));
		System.out.println("El resultado del factorial de 0 es: " + r.calcularFactorial(0));
		System.out.println("El resultado del factorial de -10 es: " + r.calcularFactorial(-10));
		System.out.println("El resultado del factorial de 1000 es: " + r.calcularFactorial(1000));
		InterfazConsola interfaz = new InterfazConsola();
		int numero = interfaz.solicitarNumeroEntero("Digite el valor para calcular fibonacci");
		System.out.println("El fibonacci de " + numero + " es " + r.calcularFibonacci(numero));
	


		r.calcularHanoi(2,1,2,3);

		String [] cosas = {"Computadora", "Cuaderno", "Lapicero", "Audifonos", "Botella"};
		r.llamadosRecursivos(cosas, 0 , true);
	}
}