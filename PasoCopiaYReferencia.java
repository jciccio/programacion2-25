public class PasoCopiaYReferencia{
	
	// Todos los tipos primitivos se pasan por copia
	public void pasoPorCopia(int valor){
		valor = valor * 99;	
		System.out.println("El valor en el metodo es: " + valor);
	}

	public void pasoPorReferenciaArreglo(int [] x){
		for(int i = 0; i < x.length; i++){
			x[i] = (int)(Math.random() * 100);
		}
		x[0] = -1;
	}

	public void imprimirArreglo(int [] arreglo){
		for(int i = 0 ; i < arreglo.length; i++){
			System.out.print(arreglo[i] + " ");
		}
		System.out.println();
	}


	public static void main (String [] args){
		PasoCopiaYReferencia pcyr = new PasoCopiaYReferencia();
		int valor = 10;
		pcyr.pasoPorCopia(valor);
		System.out.println("El valor desde el main es: " + valor);

		int [] arreglo = {1,2,3,4};
		pcyr.imprimirArreglo(arreglo);
		pcyr.pasoPorReferenciaArreglo(arreglo);
		pcyr.imprimirArreglo(arreglo);
	}



}