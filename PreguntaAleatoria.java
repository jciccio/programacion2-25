public class PreguntaAleatoria{
	
	private int operacion;
	private String [] respuestas;
	private int correcta;
	private int operando1;
	private int operando2;
	private int respuesta;
	private String [] operaciones;
	private String [] operacionesMostrar;


	public PreguntaAleatoria(){
		String [] op = {"Suma", "Resta", "Multiplicación", "División"};
		String [] op2 = {"mas", "menos", "por", "entre"};
		operaciones = op;
		operacionesMostrar = op2;

		respuestas = new String[4];
		operacion = (int)(Math.random()*4);
		operando1 = (int)(Math.random()*101);
		operando2 = (int)(Math.random()*101);

		asignarRespuesta();
	}

	public void asignarRespuesta (){
		switch(operacion){
			case 0: 
				respuesta = operando1 + operando2;
			break;
			case 1: 
				if(operando1 < operando2){
					int temporal = operando1;
					operando1 = operando2;
					operando2 = temporal;
				}
				respuesta = operando1 - operando2;
			break;
			case 2: 
				respuestas = operando1 * operando2;
			break;
			case 3:
				int divisor = (int)(Math.random() * 10 +1);
				int dividendo =  divisor * (int)(Math.random() * 10 +1);
				operando1 = dividendo;
				operando2 = divisor;
				respuesta = dividendo/divisor;
			break;
		}
	}
}