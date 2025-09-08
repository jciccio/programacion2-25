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

}