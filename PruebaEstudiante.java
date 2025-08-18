public class PruebaEstudiante{
	public static void main (String args[]){
		Estudiante estudiante1 = new Estudiante();
		estudiante1.bautizar("Gabriel");
		estudiante1.setCarrera("Computación");
		estudiante1.setEdad(19);
		estudiante1.saludar();

		Estudiante estudiante2 = new Estudiante();
		estudiante2.bautizar("Maria");
		estudiante2.setEdad(18);
		estudiante2.setCarrera("Computación");
		estudiante2.saludar();

		Estudiante estudiante3 = new Estudiante();
		estudiante3.bautizar("Jostin");
		estudiante3.setEdad(20);
		estudiante3.setCarrera("Matemáticas");
		estudiante3.saludar();


		estudiante2.bautizar("Jose");
		estudiante2.saludar();

	}
}