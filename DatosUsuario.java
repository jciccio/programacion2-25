public class DatosUsuario{
	public static void main (String [] args){
		
		System.out.println("Esto es un println");
		System.out.println("Esto es un println");
		System.out.print("Esto es un print");


		try{
			// Codigo propenso a fallos
			int x = 10/0;
		}
		catch(ArithmeticException e){
			// Que hacer si el codigo se cae
			System.err.println("Hay una división entre 0, no puedo realizarla, el error es: " +e);
			//System.exit(1);// Cierra el programa e indica que hay un error 1.
		}

		System.out.print("Esto es un print");
		System.out.println();
		System.err.println("Esto es un error");

		System.exit(0);
	}	
}