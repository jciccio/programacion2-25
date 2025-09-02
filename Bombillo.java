public class Bombillo{
	private boolean estado;
	private int watts;

	public Bombillo(){
		estado = false;
		watts = 50;
	}

	public Bombillo(int watts , boolean estado){
		this.watts = watts;
		this.estado = estado;
	}


	public void setWatts(int intensidad){
		watts = intensidad;
	}

	public void imprimir(){
		System.out.println("Bombillo: " + estado + " watts " + watts);
	}

	public static void main (String [] args){
		Bombillo bombillo1 = new Bombillo(100, false);
		bombillo1.imprimir();

		Bombillo bombillo2 = new Bombillo(25, true);
		bombillo2.imprimir();

		Bombillo bombillo3 = new Bombillo();
		bombillo3.setWatts(80);
		bombillo3.imprimir();
	}
}