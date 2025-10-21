import java.io.*;
public class EscritorDeArchivos{
	
	private BufferedWriter escritor;
	private boolean abierto;



	public EscritorDeArchivos(String ruta){
		abrir(ruta, false);
	}

	public EscritorDeArchivos(String ruta, boolean agregarAlFinal){
		abrir(ruta, agregarAlFinal);
	}


	public void abrir(String ruta ,boolean agregarAlFinal){
		try{
			escritor = new BufferedWriter(new FileWriter(ruta, agregarAlFinal));
			abierto = true;
		}
		catch(IOException e){
			abierto = false;
			System.err.println("EscritorDeArchivos - Ocurrió un error al abrir el archivo " + e);
		}
	}

	public void cerrar(){
		if(abierto){
			try{
				escritor.close();
			}
			catch(IOException e){
				System.err.println("EscritorDeArchivos - Ocurrió un error al cerrar el archivo " + e);
			}
		}
	}

	public void escribir(String datos){
		if(abierto){
			try{
				escritor.write(datos);
			}
			catch(IOException e){
				System.err.println("EscritorDeArchivos - Ocurrió un error al escribir el archivo " + e);
			}
		}
	}


	public static void main (String [] args){
		EscritorDeArchivos escritor = new EscritorDeArchivos("Prueba.txt", true);
		escritor.escribir("Esto es una línea del archivo\n");
		escritor.escribir("Esto es otra línea del archivo\n");
		escritor.escribir("Otra línea más\n");
		escritor.escribir("Hoy es 20 de Octubre\n");
		escritor.cerrar();

		escritor.abrir("Records.csv", false);
		escritor.escribir("Nombre;Puntaje\n");
		escritor.escribir("Jose;20\n");
		escritor.escribir("Gabriel;19\n");
		escritor.escribir("Felipe;17\n");
		escritor.cerrar();
	}



}