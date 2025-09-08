public class AleatorioConsulta{
	
	public static void main (String [] args){
		System.out.println(Math.random()); // [0,1[ -> Real
		System.out.println(Math.random()*10);// [0,10[ -> Real
		System.out.println((int)(Math.random()*10));// [0,9] -> Entero
		System.out.println((int)(Math.random()*10 +1));//[1,10] -> Entero
	}
}