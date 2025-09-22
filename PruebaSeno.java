public class PruebaSeno{
	
	public static void main (String  [] args){

		int [] parametrosNumericos = new int[args.length];
		for(int i = 0 ; i < args.length; i++){
			
			parametrosNumericos[i] = Integer.parseInt(args[i]);

			System.out.println( i +" - " + args[i]);
		}





		Calculadora calculadora = new Calculadora();
		
		int suma = calculadora.sumar(parametrosNumericos);
		System.out.println("La suma del arreglo es: " + suma);


		int resultado = calculadora.calcularFactorial(4);
		System.out.println(resultado);
		resultado = calculadora.calcularFactorial(5);
		System.out.println(resultado);
		resultado = calculadora.calcularFactorial(0);
		System.out.println(resultado);
		resultado = calculadora.calcularFactorial(-10);
		System.out.println(resultado);


		resultado = calculadora.calcularPotencia(2,8);
		System.out.println(resultado);

		double seno = calculadora.calcularSeno(parametrosNumericos[0],parametrosNumericos[1]);
		System.out.println("El resultado del seno es: "+ seno);


	}
}