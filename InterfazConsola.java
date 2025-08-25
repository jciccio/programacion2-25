import java.util.Scanner;

public class InterfazConsola{

	private Scanner scanner;

	public InterfazConsola(){
		scanner = new Scanner(System.in);
	}

	public int solicitarNumeroEntero(){
		System.out.println("Digite un numero");
		String numeroUsuario = scanner.nextLine();

		int numero = 0;
		try{
			numero = Integer.parseInt(numeroUsuario);
		}
		catch(NumberFormatException e){
			System.err.println("El valor digitado no es un numero");
		}
		return numero;
	}
}