public class LaUltimaClase{
	

	public String[] ordenarArreglo(String [] arreglo){
		for(int i = 0 ; i < arreglo.length; i++){
			for(int j = i+1; j < arreglo.length; j++){
				if(arreglo[i].toLowerCase().compareTo(arreglo[j].toLowerCase()) > 0){
					String temporal = arreglo[i];
					arreglo[i] = arreglo[j];
					arreglo[j] = temporal;
				}
			}
		}
		return arreglo;
	}


	public void imprimir(String [] arreglo){
		for(int i = 0; i< arreglo.length; i++){
			System.out.print(arreglo[i] + ", ");
		}
		System.out.println();
	}

	public static void main (String [] args){
		String [] arreglo = {"1","7", "6","GABRIEL", "josias", "Aaron", "SEBASTIAN Blando", "Sebastian Arroyo", "Helen", "Juan Diego", "Brandon"};
		LaUltimaClase ultimaInstancia = new LaUltimaClase();
		ultimaInstancia.imprimir(ultimaInstancia.ordenarArreglo(arreglo));

	}

}