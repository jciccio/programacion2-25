public class ListaDoblementeEnlazada{

	private Nodo primero; 
	private Nodo ultimo;

	private class Nodo{
		private int elemento;
		private Nodo siguiente;
		private Nodo anterior;

		public Nodo(int elemento){
			this.elemento = elemento;
			this.siguiente = null;
			this.anterior = null;
		}

		public String toString(){
			return ""+ elemento + " ";
		}

		public int getElemento(){
			return elemento;
		}
	}

	public ListaDoblementeEnlazada(){
		this.primero = this.ultimo = null;
	}


	public void agregarAlInicio(int elemento){
		Nodo nuevo = new Nodo(elemento);
		if(primero == null){
			primero = nuevo;
			ultimo = nuevo;
		}
		else{
			primero.anterior = nuevo;
			nuevo.siguiente = primero;
			primero = nuevo;
		}
	}

	public void agregarAlFinal(int elemento){
		if(primero == null){
			agregarAlInicio(elemento);
		}
		else{
			Nodo nuevo = new Nodo(elemento);
			ultimo.siguiente = nuevo;
			nuevo.anterior = ultimo;
			ultimo = nuevo;
		}
	}


	
}