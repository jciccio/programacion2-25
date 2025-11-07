public class EjerciciosEnClase{

	public int [] eliminarDuplicados2(int [] arreglo){
		int [] resultado = new int[arreglo.length]; 
		int indice = 0;
		for(int i = 0; i < arreglo.length; i++){
			boolean esta = false;
			for(int j = 0; j < indice; j++){
				if(arreglo[i] == resultado[j]){
					esta = true;
				}
			}
			if(!esta){
				resultado[indice] = arreglo[i];
				indice++;
			}
		}	

		int [] resultadoFinal = new int[indice];
		for(int i = 0; i < indice; i++){
			resultadoFinal[i] = resultado[i];
		}

		return resultadoFinal;


	}
	public int [] eliminarDuplicados(int [] arreglo){
		String elementos = "";
		for(int i = 0 ; i < arreglo.length; i++){
			if (!elementos.contains(arreglo[i]+ " ")){
				elementos += arreglo[i]+ " ";
			}
		}
		elementos = elementos.trim();
		String[] partes = elementos.split(" ");
		int [] resultado = new int [partes.length];
		for (int i = 0; i < partes.length; i++){
			resultado[i] = Integer.parseInt(partes[i]);
		}
		return resultado;
	}

	public void imprimirArreglo(int [] arreglo){
		for(int i = 0 ; i < arreglo.length; i++){
			System.out.print(arreglo[i] + " ");
		}
		System.out.println();
	}

	public static void main (String [] args){
		int [] numeros = {1,2,3,42,3,1,2,1,2,3,3,4,5,5,5,4,3,2,1}; 
		EjerciciosEnClase ec = new EjerciciosEnClase();
		ec.imprimirArreglo(ec.eliminarDuplicados(numeros));
	}
}