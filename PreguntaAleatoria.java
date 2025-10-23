public class PreguntaAleatoria{

	private int operando1;
	private int operando2;
	private int operacion;
	private int respuesta;
	private String [] operaciones; // + - * /
	private String [] expresionOperaciones;
	private String [] opciones;

	public PreguntaAleatoria(){
		opciones = new String[4];
		operacion = (int)(Math.random()*4);
		String [] operaciones = {"suma", "resta", "multiplicacion", "division"};
		String [] expresionOperaciones = {"mas", "menos", "por", "entre"};
		this.operaciones = operaciones;	
		this.expresionOperaciones = expresionOperaciones;
		operando1 = (int)(Math.random()*101);
		operando2 = (int)(Math.random()*101);
		//0 a 100 son suma, resta y multiplicacion
	}

	public void generarResultados(){
		if(operacion == 0){ // Suma
			resultado = operando1 + operando2;
		}
		else if(operacion == 1){ // Resta
			generarResta();
		}
		else if(operacion == 2){ // Multiplicacion
			resultado = operando1 * operando2;
		}
		else if(operacion == 3){ // Division
			generarDivision();
		}
	}

	public generarRespuestasAleatorias(){
		for(int i = 0; i < 3; i++){
			if(i == 0){
				opciones[i] = respuesta;
			}
			else{
				int signo = Math.random() >= 0.5 ? 1 : -1;
				opciones[i] =  "" + (respuesta +  (int)(Math.random() * 5 + 1 ) * signo);
			}
		}
		revolverRespuestas();
		opciones[3] ="No sabe o no responde";
	}

	public void revolverRespuestas(){
		for(int i =0 ; i < 3; i++){
			int celdaAIntercambiar = (int)(Math.random()*3);
			int temporal = opcion[i];
			opcion[i] = opcion[celdaAIntercambiar];
			opcion[celdaAIntercambiar] = temporal;
		}
	}

	public void generarResta(){
		if(operando1 < operando2){
			int temporal = operando1;
			operando1 = operando2;
			operando2 = temporal;
		}
		resultado = operando1 - operando2;
	}

	public void generarDivision(){
		int numero1 = (int)(Math.random()*10+1); // numeros entre 1 y 10
		int numero2 = (int)(Math.random()*10+1); // numeros entre 1 y 10
		int dividendo = numero1*numero2;;
		int divisor = numero1;
		operando1 = dividendo;
		operando2 = divisor;
		resultado = dividendo / divisor;
	}

	public String generarEnunciado(){
		return "El resultado al aplicar la " + operaciones[operacion] + " de " + operando1 + " " +
		expresionOperaciones[operacion] +" " + operando2 + "es:";
	}

	public boolean verificarSiEsCorrecto(int opcionDigitada){
		String opcionArreglo = opcionDigitada  - 1;
		boolean correcta = false;
		if(opcionArreglo >= 0 && opcionArreglo < 3){
			String valor = opciones[opcionArreglo];
			String resultadoString = "" + resultado;
			correcta = valor.equals(resultadoString);
		}	
		return correcta;
	}

}