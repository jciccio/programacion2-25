public class Estudiante{
	// Atributos de la clase
	// private TipoDeDato nombreDelAtributo
	private String nombre;
	private int edad;
	private String carrera;

	// Métodos de la clase
	// Acciones de la clase
	// private o publico -> si se pueden acceder desde una instancia
	// lo que quiero que el método regrese
	// nombre del metodo
	// lo que necesito que el metodo reciba para funcionar

	public void bautizar (String nombreDelEstudiante){
		nombre = nombreDelEstudiante;
	}
	public void saludar(){
		String saludo = "Hola me llamo " + nombre + 
		" tengo "+ edad + "anyos y estudio " + carrera;
		System.out.println(saludo);
	}
	// Métodos de tipo set
	public void setEdad(int laEdad){
		edad = laEdad;
	}

	public void setCarrera(String carrera){
		this.carrera = carrera;
	}

	public void cumplirAnyos(){
		edad = edad + 1;
	}



}