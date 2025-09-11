public class Quiz2 {
	
	public int sumarDigitos(int numero){
		int suma = 0;
		while(numero != 0){ // 123
			suma += (numero % 10);
			numero /= 10; //<=> numero = numero / 10;
		}
		return suma;
	}
}