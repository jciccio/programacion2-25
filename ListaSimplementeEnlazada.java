public class ListaSimplementeEnlazada{
	
	private Nodo primero; // Este


	private class Nodo{
		private int elemento;
		private Nodo siguiente;

		public Nodo(int elemento){
			this.elemento = elemento;
			this.siguiente = null;
		}

		public String toString(){
			return ""+ elemento + " ";
		}

		public int getElemento(){
			return elemento;
		}
	}

	public ListaSimplementeEnlazada(){
		primero = null;
	}

	public void agregarAlInicio(int elemento){
		// 1. Crear un nodo nuevo (que esta desconectado de la lista) 
		// 2. El siguiente del nodo nuevo es el primero actual de la lista
		// 3. El primer elemento de la lista es el nodo nuevo
		// (Actualizar los punteros de la lista)
		Nodo nuevo = new Nodo(elemento);
		nuevo.siguiente = primero;
		primero = nuevo;

	}

	public void agregarAlFinal(int elemento){
		// Debemos recorrer la lista
		// hasta el ultimo elemento
		// creamos un nuevo nodo
		// Los conectamos a la lista
		if(primero == null){
			agregarAlInicio(elemento);	
		}
		else{
			Nodo actual = primero;	
			while(actual.siguiente != null){
				actual = actual.siguiente;
			}
			Nodo nuevo = new Nodo(elemento);
			actual.siguiente = nuevo;
		}
	}

	private Nodo buscarPosicion(int posicion){
		int posicionActual = 0;
		Nodo actual = primero;
		if(posicion >= 0){
			while(posicion != posicionActual && actual != null){
				actual = actual.siguiente;
				posicionActual++;
			}
		}
		return actual;
	}


	public boolean agregar(int posicion, int elemento){
		boolean insertado = false;
		if(posicion == 0){
			agregarAlInicio(elemento);
			insertado = true;
		}
		else{
			Nodo anterior = buscarPosicion(posicion-1);
			System.out.println(anterior);
			if(anterior != null){
				Nodo nuevo = new Nodo(elemento);
				nuevo.siguiente = anterior.siguiente;
				anterior.siguiente = nuevo;
				insertado = true;
			}
		}
		return insertado;
	}

	public boolean borrar(int posicion){
		// Casos para borrar
		boolean borrado = false;
		if(posicion >= 0 && primero != null){
			if(posicion == 0){ 
				// Es el primero de la lista
				Nodo nodoABorrar = primero;
				primero = primero.siguiente;
				nodoABorrar.siguiente = null;
				nodoABorrar = null;
				borrado = true;
			}
			else{ 
				// Es un nodo intermedio o final
				Nodo anterior = buscarPosicion(posicion-1);
				if(anterior != null){
					Nodo borrar = anterior.siguiente;
					if(borrar != null){
						anterior.siguiente = borrar.siguiente;
						borrar.siguiente = null;
						borrar = null;
						borrado = true;
					}
				}
			}
		}
		return borrado;
	}

	public Nodo getNodo(int posicion){
		return buscarPosicion(posicion);
	}

	public int getElemento(int posicion){
		return buscarPosicion(posicion).elemento;
	}

	public String toString(){
		String contenido ="";
		Nodo actual = primero;
		while(actual != null){
			contenido += actual.toString();
			actual = actual.siguiente;
		}
		return contenido;
	}

	public static void main (String [] args ){
		ListaSimplementeEnlazada lse = new ListaSimplementeEnlazada();
		lse.agregarAlInicio(1);
		lse.agregarAlInicio(2);
		lse.agregarAlInicio(3);
		System.out.println(lse);

		lse.agregarAlFinal(10);
		lse.agregarAlFinal(20);
		lse.agregarAlFinal(30);
		System.out.println(lse);

		System.out.println(lse.agregar(2,11));
		System.out.println(lse.agregar(0,9));
		System.out.println(lse);

		lse.borrar(40);
		lse.borrar(4);
		lse.borrar(0);
		System.out.println(lse);
	}

}