public class Quiz6{
	

	public int buscarEnArreglo (int[] arreglo, int valor, int indice){
		int retorno = -1;
		if(indice < arreglo.length){
			retorno = buscarEnArreglo(arreglo, valor, indice+1);
			if(arreglo[indice] == valor){
				retorno = indice;
			}
		}
		return retorno;
	}

	public int buscarMasGrande(int [] arreglo, int indice){
		int masGrande = arreglo[0];
		if(indice < arreglo.length){
			masGrande = buscarMasGrande(arreglo, indice+1);
			if(masGrande < arreglo[indice]){
				masGrande = arreglo[indice];
			}
		}
		return masGrande;
	}

	public static void main(String [] args){
		int [] arreglo = {1,3,4,6,8,9,10};
		Quiz6 q = new Quiz6();
		System.out.println(q.buscarEnArreglo(arreglo, 10, 0));
		System.out.println(q.buscarMasGrande(arreglo, 0));
	}

}