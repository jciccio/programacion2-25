public class Matrices{


	public char [][] crearMatrizLetras(int filas, int columnas){
		char [][] matrizNueva = new char [filas][columnas];
		int cantidadDeLetras = (int)'z' - (int)'a' + 1;
		int numeroLetra = 0;
		for(int f = 0; f < matrizNueva.length; f++){
			for(int c = 0; c < matrizNueva[f].length; c++){
				matrizNueva[f][c] = (char) ((int)'a' + numeroLetra);
				numeroLetra = (numeroLetra+1)%cantidadDeLetras;
			}
		}
		return matrizNueva;
	}

	public char [][] crearMatrizLetrasAleatorias(int filas, int columnas){
		char [][] matrizNueva = new char [filas][columnas];
		int cantidadDeLetras = (int)'z' - (int)'a' + 1;
		for(int f = 0; f < matrizNueva.length; f++){
			for(int c = 0; c < matrizNueva[f].length; c++){
				matrizNueva[f][c] = (char)((int)'a' + (int)(Math.random()*cantidadDeLetras));
			}
		}
		return matrizNueva;
	}

	public void imprimir(char [][] letras){
		// Recorrer cada fila, y por cada fila acceder a cada columna
		for(int fila = 0; fila < letras.length; fila++){
			for(int columna = 0; columna < letras[fila].length; columna++){
				System.out.print(letras[fila][columna] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main (String [] args){
		char letra = 'z';
		System.out.println((int)(letra));
		int cantidadDeLetras = (int)'z' - (int)'a' + 1;
		System.out.println(cantidadDeLetras);
		System.out.println((char)97);

		int letraAleatoriaNumerica = (int)'a' +  (int)(Math.random()* cantidadDeLetras);
		System.out.println((char)letraAleatoriaNumerica);

		char [][] matrizLetras = {
			{'a', 'b', 'c'},
			{'1', '@', '$'},
			{'H', 'F', 'A'}
		};

		Matrices matrices = new Matrices();
		matrices.imprimir(matrizLetras);
		matrices.imprimir(matrices.crearMatrizLetras(6,5));
		matrices.imprimir(matrices.crearMatrizLetrasAleatorias(7,4));
	}


}