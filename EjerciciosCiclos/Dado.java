public class Dado{
	private int valor;

	public void lanzar(){
		valor = (int)(Math.random()*6+1);
	}

	public int getValor(){
		return valor;
	}
}