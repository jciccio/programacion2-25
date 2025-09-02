import java.util.Scanner;

public class InterfazConsola{

	private Scanner scanner;

	public InterfazConsola(){
		scanner = new Scanner(System.in);
	}

	public int solicitarNumeroEntero(String titulo){
		System.out.println(titulo);
		String numeroUsuario = scanner.nextLine();

		int numero = 0;
		try{
			numero = Integer.parseInt(numeroUsuario);
		}
		catch(NumberFormatException objetoExcepcion){
			System.err.println("El valor digitado no es un numero " + objetoExcepcion);
		}
		return numero;
	}
}