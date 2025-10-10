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
	}
}