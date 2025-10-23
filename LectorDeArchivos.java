import java.io.*;
public class LectorDeArchivos{
	private BufferedReader lector;
	private boolean abierto;

	public LectorDeArchivos(String ruta){
		try{
			lector = new BufferedReader(new FileReader(ruta));
			abierto = true;
		}
		catch(IOException e){
			abierto = false;
			System.err.println("LectorDeArchivos - Ocurrió un error al abrir el archivo " + e);
		}
	}

	public void cerrar(){
		if(abierto){
			try{
				lector.close();
			}
			catch(IOException e){
				System.err.println("LectorDeArchivos - Ocurrió un error al cerrar el archivo " + e);
			}
		}
		abierto = false;
	}

	public String leerLinea(){
		String lineaLeida = null;
		if(abierto){
			try{
				lineaLeida = lector.readLine();
			}
			catch(IOException e){
				System.err.println("LectorDeArchivos - Ocurrió un error al leer el archivo " + e);
			}	
		}
		return lineaLeida;
	}


	public static void main (String [] args){

		for(int i = 0; i < args.length; i++){
			System.out.println("Argumento: " + i + " es: " + args[i]);
		}

		LectorDeArchivos lector = new LectorDeArchivos(args[0]);
		String linea = lector.leerLinea();
		System.out.println(linea);
		linea = lector.leerLinea();
		while(linea != null){
			System.out.println(linea);
			linea = lector.leerLinea();
		}
		lector.cerrar();
	}





















}