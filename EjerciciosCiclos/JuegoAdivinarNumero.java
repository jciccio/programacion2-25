public class JuegoAdivinarNumero{
	private int numeroSecreto;
	private Interfaz interfaz;

	public JuegoAdivinarNumero(){
		generarNumero();
		interfaz = new Interfaz();
	}

	public void generarNumero(){
		numeroSecreto = (int)(Math.random() * 50 +1);
	}

	//•	En un método dentro del objeto, 
	//pida intentos al usuario (con Scanner o JOptionPane) hasta que adivine, 
	//usando if/else para indicar si el número buscado es mayor o menor.
	public void jugar(){
		int numeroDigitado = 0;
		String mensaje = "Digite un numero entre 1 y 50";
		do{
			numeroDigitado = interfaz.solicitarNumeroEntero(mensaje);	
			if(numeroDigitado > numeroSecreto){
				mensaje = "El numero es menor";
			}
			else if (numeroDigitado < numeroSecreto){
				mensaje = "El numero es mayor";
			}
			else{
				interfaz.mostrarMensaje("Felicidades el numero era: "+ numeroSecreto, "Gano! :)");	
			}
		} while(numeroDigitado != numeroSecreto);
	}
}