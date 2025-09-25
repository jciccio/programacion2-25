public class OrdenamientoArreglo{


	public int [] clonarArreglo(int [] arreglo){
		int [] copia = new int[arreglo.length];
		for(int i = 0 ; i < copia.length ; i++){
			copia[i] = arreglo[i];
		}
		return copia;
	}

	public String [] clonarArreglo(String [] arreglo){
		String [] copia = new String[arreglo.length];
		for(int i = 0 ; i < copia.length ; i++){
			copia[i] = arreglo[i];
		}
		return copia;
	}

	public int [] ordenarSeleccion (int [] arregloParametro){
		int [] arreglo = clonarArreglo(arregloParametro);
		for(int i = 0 ; i < arreglo.length; i++){
			for(int j = i+1; j < arreglo.length; j++){
				if(arreglo[i] > arreglo[j]){
					// El valor es mayor y queremos hacer un intercambio
					int temporal = arreglo[i];
					arreglo[i] = arreglo[j];
					arreglo[j] = temporal;
				}
			}
		}
		return arreglo;
	}


	public String [] ordenarSeleccion (String [] arregloParametro){
		String [] arreglo = clonarArreglo(arregloParametro);
		for(int i = 0 ; i < arreglo.length; i++){
			for(int j = i+1; j < arreglo.length; j++){
				if(arreglo[i].compareTo(arreglo[j]) > 0 ){ // El valor es mayor y queremos hacer un intercambio
					String temporal = arreglo[i];
					arreglo[i] = arreglo[j];
					arreglo[j] = temporal;
				}
			}
		}
		return arreglo;
	}



	public void imprimir(int [] arreglo){
		for(int i = 0; i< arreglo.length; i++){
			System.out.print(arreglo[i] + " ");
		}
		System.out.println();
	}

	public void imprimir(String [] arreglo){
		for(int i = 0; i< arreglo.length; i++){
			System.out.print(arreglo[i] + " ");
		}
		System.out.println();
	}


	public static void main (String [] args){
		int [] arreglo = {10,3,4,1,0,-10,5,6,6,6,6,6,8};
		OrdenamientoArreglo oa = new OrdenamientoArreglo();
		int [] ordenado = oa.ordenarSeleccion(arreglo);
		oa.imprimir(arreglo);
		oa.imprimir(ordenado);


		String [] nombres = {"Juan", "Ana", "Maria", "Carlos", "Alejandro", "Andrea", "Brandon", "Gabriel"};
	
		String [] nombresOrdenados = oa.ordenarSeleccion(nombres);
		oa.imprimir(nombres);
		oa.imprimir(nombresOrdenados);
	}

}