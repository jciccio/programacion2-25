public class BusquedaBinaria{
	

	public int busquedaBinaria(int[] arreglo, int valor){
		OrdenamientoArreglo ordenar = new OrdenamientoArreglo();
		return busquedaBinaria(ordenar.ordenarSeleccion(arreglo),valor,0,arreglo.length-1);
	}


	private int busquedaBinaria (int[] arreglo, int valor, int limInf, int limSup){
		int resultado = -1;
		int celda = (limInf + limSup)/2;
		if(limInf <= limSup && celda >=0 && celda < arreglo.length){
			// Caso trivial
			if(arreglo[celda] == valor){
				// Lo encontramos! :)
				resultado = celda;
			}
			// Caso(s) recursivo(s)
			else if(arreglo[celda] > valor){
				//Esto significa que los valores están a la izquierda
				resultado = busquedaBinaria(arreglo,valor,limInf,celda-1);	
			}
			else{
				//Los valores se encuentran a la derecha
				resultado = busquedaBinaria(arreglo, valor, celda+1, limSup);
			}

		}
		return resultado;
	}

	public int busquedaSecuencial(int [] arreglo, int valor){
		int resultado = -1;
		int celda = 0;
		while(celda < arreglo.length && resultado == -1){
			if(arreglo[celda] == valor){
				resultado = celda;
			}
		}
		return resultado;
	}






















}