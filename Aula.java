public class Aula{
	private Estudiante[] estudiantes;
	private int ultimoUsado;

	public Aula (){
		estudiantes = new Estudiante [5];
	}

	public void agregarEstudiante(String nombre, int edad, String carrera){
		Estudiante estudiante = new Estudiante();
		estudiante.bautizar(nombre);
		estudiante.setEdad(edad);
		estudiante.setCarrera(carrera);

		estudiantes[ultimoUsado] = estudiante;
		ultimoUsado++;
	}

	public void imprimir(){
		for(int i = 0; i < estudiantes.length; i++){
			if(estudiantes[i] != null){
				estudiantes[i].saludar();
			}
		}
	}

	public static void main (String [] args){
		Aula aula = new Aula();
		aula.agregarEstudiante("Leandro", 19, "Computación");
		aula.agregarEstudiante("Alessandra", 20, "Computación e Informática");
		aula.imprimir();
	}
}