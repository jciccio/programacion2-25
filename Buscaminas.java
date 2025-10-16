public class Buscaminas {
	// Hay dos matrices
	// La matriz logica -> tiene los valores del tablero
	// Matriz del usuario -> Mostramos al usuario
	// ?? Cuantas minas hay


	private int [][] tablero;
	// -1 -> Representa una mina
	// 0-8 -> Representan las minas alrededor
	private String [][] tableroUsuario;
	private int minas;

	public Buscaminas(int filas, int columnas, int minas){
		generarMinas(filas, columnas, minas);
		llenarTablero();
	}

	public boolean generarMinas(int filas, int columnas, int minas){
		boolean generadas = false;
		if(filas * columnas > minas){
			generadas = true;
			this.minas = minas;
			this.tablero = new int[filas][columnas];
			this.tableroUsuario = new String[filas][columnas];
			
			for(int f = 0; f < tableroUsuario.length; f++){
				for(int c = 0; c < tableroUsuario[f].length; c++){
					tableroUsuario[f][c] = "_";
				}
			}

			int minasColocadas = 0;
			int filaActual = 0;
			int columnaActual = 0;
			while(minasColocadas < minas){
				tablero[filaActual][columnaActual] = -1;
				minasColocadas++;
				columnaActual++;
				if(columnaActual >= columnas){
					columnaActual = 0;
					filaActual++;
				}
			}

			for(int f = 0; f < tablero.length ; f++){
				for(int c = 0; c < tablero[f].length; c++){
					if(tablero[f][c] == -1){
						int filaAleatoria = (int)(Math.random()*filas);
						int columnaAleatoria = (int)(Math.random()*columnas);
						if(tablero[filaAleatoria][columnaAleatoria] == 0){
							tablero[filaAleatoria][columnaAleatoria] = -1;
							tablero[f][c] = 0;
						}
					}
				}
			}
		}
		return generadas;
	}

	public boolean realizarMovimiento(int f, int c, boolean perdio){
		// Modificar el tablero del usuario segun lo que recibamos de posicion en la matriz
		// Usen como auxiliar la matriz (tablero) que contiene los datos relevantes
		// Si es una mina cambien por una M la matriz del usuario
		// Modiquen el to String para imprimir la matriz del usuario
		return false;
	}

	public void llenarTablero(){
		int [] cF = {-1,-1,-1,  0,0, 1,1,1};
		int [] cC = {-1, 0, 1, -1,1,-1,0,1};
		for(int f = 0; f < tablero.length; f++){
			for(int c = 0 ; c < tablero[f].length; c++){
				if(tablero[f][c] == -1){ // Hay una mina y queremos sumar a los vecinos
					for(int i = 0 ; i < cF.length; i++){
						int nuevaFila = f + cF[i];
						int nuevaColumna = c + cC[i];
						if(nuevaFila >= 0 && 
						   nuevaFila <tablero.length &&
						   nuevaColumna >= 0 && 
						   nuevaColumna < tablero[nuevaFila].length && 
						   tablero[nuevaFila][nuevaColumna] != -1){
							tablero[nuevaFila][nuevaColumna]++;
						}
					}
				}
			}
		}
	}

	public String toString(){
		String contenido = "";
		for(int f = 0; f < tablero.length; f++){
			for(int c = 0 ; c < tablero[f].length; c++){
				contenido += tablero[f][c]+ "\t";
			}
			contenido +=  "\n";
		}
		return contenido;
	}

	public static void main (String [] args){
		Buscaminas buscaminas = new Buscaminas(10, 10, 10);
		System.out.println(buscaminas);

	}

}