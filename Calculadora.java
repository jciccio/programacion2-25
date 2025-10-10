public class Calculadora{
	
	public int elevarAlCuadrado(int numero){
		int resultado = numero * numero;
		return resultado;
	}

	public int elevarAlCubo(int numero){
		return numero * numero * numero;
	}

	public double dividir(int dividendo, int divisor){
		double resultado = (double)(dividendo)/divisor;
		return resultado;
	}

	public double sumar (double v1, double v2){
		return v1+v2;
	}

	public int sumar(int x, int y){
		return x+y;
	}

	public double sumar(int x, double y){
		return x+y;
	}

	public int sumar (int x, int y, int z){
		return x+y+z;
	}


	// Para calcular el seno son los siguientes métodos:
	public int calcularFactorial (int n){
		int factorial = 1;
		int contador = 1;
		if(n < 0){
			factorial = -1;
		}
		while(contador <= n){
			factorial *= contador;
			contador++;
		}
		return factorial;
	}

	public int calcularPotencia(int base, int exponente){
		int resultado = base;
		/*int contador = 1;
		while(contador < exponente){
			resultado *= base;
			contador++;
		}*/
		for(int contador = 1; contador < exponente; contador++){
			resultado *= base;
		}
		return resultado;
	}

	public int sumar(int [] arreglo){
		int suma = 0;
		for(int i = 0 ; i < arreglo.length; i++){
			suma += arreglo[i];
		}
		return suma;
	}

	public double calcularSeno(int x, int n){
		double resultado = 0;
		int signo = 1;
		int numero = 1;// 1,3,5,7,9...
		for (int i = 0 ; i < n; i++){
			int numerador = (calcularPotencia(x,numero));
			int denominador = (calcularFactorial(numero));
			double fraccion = (double)numerador / denominador * signo;
			resultado += fraccion;
			numero += 2;
			signo *= -1;
		}
		return resultado;
	}

	public boolean esPrimo(int numero){
		boolean primo = true;
		int contador = 2;
		while(contador <= numero/2 && primo){
			if(numero%contador == 0){
				primo = false;
			}
			contador++;
		}
		return primo;
	}



















}