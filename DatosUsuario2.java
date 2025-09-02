import java.util.Scanner; 
import javax.swing.JOptionPane;
public class DatosUsuario2{
	public static void main (String [] args){

		JOptionPane.showMessageDialog(null, "Texto1" , "Texto2", JOptionPane.WARNING_MESSAGE);

		String valor1String = JOptionPane.showInputDialog("Digite un numero");


		Scanner scanner = new Scanner(System.in);
		System.out.println("Que dia es hoy?");
		String loQueDigitoElUsuario = scanner.nextLine();
		System.out.println("El usuario digito: " + loQueDigitoElUsuario);


		InterfazConsola interfaz = new InterfazConsola();
		int numero1 = interfaz.solicitarNumeroEntero();
		int numero2 = interfaz.solicitarNumeroEntero();
		int resultado = numero1 + numero2;
		System.out.println(numero1  + " + " + numero2 + " = " + resultado);




		/*System.out.println("Digite un numero");
		String numero1Usuario = scanner.nextLine();
		System.out.println("El usuario digito: " + numero1Usuario);

		int numero1 = 0;
		try{
			numero1 = Integer.parseInt(numero1Usuario);
		}
		catch(NumberFormatException e){
			System.err.println("El valor digitado no es un numero");
		}

		int resultado = numero1 * numero1 * numero1; 
		System.out.println( numero1  + " al cubo es: " + resultado);


		System.out.println("Digite otro numero");
		String numero2Usuario = scanner.nextLine();
		System.out.println("El usuario digito: " + numero2Usuario);

		int numero2 = 0;
		try{
			numero2 = Integer.parseInt(numero2Usuario);
		}
		catch(NumberFormatException e){
			System.err.println("El valor digitado no es un numero");
		}

		int suma = numero1 + numero2; 
		System.out.println( numero1  + " + " + numero2 + " es:  " + resultado);*/
	}
}