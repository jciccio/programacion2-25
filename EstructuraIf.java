public class EstructuraIf{

	/*
		Una película tiene clasificación +15. 
		El cine permite entrada si el cliente tiene al menos 15 años o si 
		está acompañado por un adulto 
	*/
	public boolean puedeEntrarAlCine(int edad, boolean estaAcompanyado){
		boolean puedeEntrar = false;
		if(edad >= 15 || (edad < 15 && estaAcompanyado)){
			puedeEntrar = true;
		}
		else{
			puedeEntrar = false;
		}
		return puedeEntrar;
	}

	public static void main (String [] args){
		int x = 11;
		System.out.println("Main del if el valor de X es: "+ x);
		
		if(x > 10){//Operador relacional, aritmeticos, igualdad == != > < >= <= -> condicion
			// Se ejecuta el bloque si la condicion es true
			System.out.println("Se esta ejecutando el bloque del if");
			x *= x;
		}
		System.out.println("El valor de X es: " + x);


		EstructuraIf instanciaEstructuraIf = new EstructuraIf();
		boolean puedeEntrar1 = instanciaEstructuraIf.puedeEntrarAlCine(18, false); // true
		boolean puedeEntrar2 = instanciaEstructuraIf.puedeEntrarAlCine(14, false); // false
		boolean puedeEntrar3 = instanciaEstructuraIf.puedeEntrarAlCine(10, true); // true


		String impresion1 = (puedeEntrar1 ? "SI puede entrar" : "NO puede entrar" ); 

		System.out.println("Puede entrar 1: " +impresion1);
		System.out.println("Puede entrar 2: " + (puedeEntrar2 ? "SI puede entrar" : "NO puede entrar" ));
		System.out.println("Puede entrar 3: " + (puedeEntrar3 ? "SI puede entrar" : "NO puede entrar" ));


		int nota = 80;
		String pasa = nota >=70 ?"Paso la prueba" : "NO paso la prueba";


	}
}