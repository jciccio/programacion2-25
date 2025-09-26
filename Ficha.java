public class Ficha{
	private int ladoA;
	private int ladoB;

	public Ficha(int a, int b){
		ladoA = a;
		ladoB = b;
	}

	public String toString(){
		return "[" + ladoA + "|" + ladoB + "]";
	}

	public static void main (String [] args){
		Ficha f1 = new Ficha (4,3);
		Ficha f2 = new Ficha (3,2);
		Ficha f3 = new Ficha (2,5);
		System.out.println(""+f1+f2+f3);
	}
}