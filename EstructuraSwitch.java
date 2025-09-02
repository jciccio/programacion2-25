public class EstructuraSwitch{
	
	public String convertirNumeroADia(int numero){
		String dia = "";
		switch(numero){
			case 1: // numero == 1
				dia = "Lunes";
			break;
			case 2: // numero == 2
				dia = "Martes";
			break; 
			case 3:// ...
				dia = "Miercoles";
			break;
			case 4:
				dia = "Jueves";
			break;
			case 5:
				dia = "Viernes";
			break;
			case 6:
				dia = "Sabado";
			break;
			case 7:
				dia = "Domingo";
			break;
			default:
				dia= "El numero no es un dia valido";
		}
		return dia;
	}


	public String convertirNumeroADiaIf(int numero){
		String dia = "";
		if(numero == 1){
			dia = "lunes";
		}
		else{
			if(numero == 2){
				dia = "martes";
			}
			else{
				if(numero == 3){
				dia = "miercoles";
				}
				else{
					if(numero == 4){
					dia = "jueves";
				}
				else{
					if(numero == 5){
						dia = "viernes";
					}
						else{
							if(numero == 6){
							dia = "sabado";
						}
							else{
								if(numero == 7){
								dia = "domingo";
								}
								else{
									dia "el dia no es valido";
								}
							}
						}
					}
				}	
			}
		}

	}



	public static void main (String [] args){
		EstructuraSwitch estructuraSwitch = new EstructuraSwitch();
		InterfazConsola interfaz = new InterfazConsola();
		
		int opcionMenu = interfaz.solicitarNumeroEntero("Digite el numero para:\n1-Sumar\n2-Restar\n3-Multiplicar\n4-Dividir");

		int loQueDigitoElUsuario = interfaz.solicitarNumeroEntero("Digite el numero para convertir en un dia:");

		String dia = estructuraSwitch.convertirNumeroADia(loQueDigitoElUsuario);
		System.out.println("El dia es: "+ dia);
	}
}