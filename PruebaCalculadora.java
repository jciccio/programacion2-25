public class PruebaCalculadora{
	public static void main (String [] args){
		Calculadora c1 = new Calculadora();
		System.out.println("3 al cuadrado es: "+ c1.elevarAlCuadrado(3));
		System.out.println("3 al cubo es: "+ c1.elevarAlCubo(3));
		System.out.println("La división de 2/5 es: "+ c1.dividir(2,5));
	}
}