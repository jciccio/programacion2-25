public class ArregloPrueba{
	

	public static void main (String [] args){
		int [] arreglo = new int [10];// [0,0,0,0,0,0,0,0,0,0]
		arreglo[0] = 50;
		arreglo[3] = 75;
		arreglo[8] = 6;

		for(int i = 0; i < arreglo.length; i++){
			System.out.println("celda: " + i + " continene: " + arreglo[i]);
		}
		int celda8 = arreglo[8];
		System.out.println(celda8);

		// asignar valores
		int [] arreglo2 = new int[20];
		for(int i = 0; i< arreglo2.length; i++){
			arreglo2[i] = (i*2)+1;
		}	

		for(int i = 0; i < arreglo2.length; i++){
			System.out.println("celda: " + i + " continene: " + arreglo2[i]);
		}	

		// extension
		double [] extension = {1.0101,3.1293,5,6,7};
	}


}