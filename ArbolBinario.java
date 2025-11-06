public class ArbolBinario{
	private Nodo raiz;

	private class Nodo{
		private int elemento;
		private Nodo hijoIzq;
		private Nodo hijoDer;

		public Nodo(int elemento){
			this.elemento = elemento;
			hijoDer = hijoIzq = null;
		}

		public String toString(){
			return "Elemento: " + elemento;
		}
	}

	public Nodo insertar(int elemento){
		return insertar(raiz, elemento);
	}

	private Nodo insertar(Nodo nodo, int elemento){
		Nodo nuevo = nodo;
		if (nodo == null){
			// Caso trivial, podemos agregar un nodo nuevo
			nuevo = new Nodo(elemento);
			if(raiz == null){
				raiz = nuevo;
			}
		}
		else{
			// Casos recursivos
			// Queremos movernos hasta el punto donde podemos
			// Insertar el nodo dentro del árbol (aka hoja del arbol o el nodo terminal)
			if(nodo.elemento > elemento){
				// Nos tenemos que mover hacia la izquierda
				nodo.hijoIzq = insertar(nodo.hijoIzq, elemento);
			}
			else if(nodo.elemento < elemento){
				// Nos tenemos que mover hacia la derecha
				nodo.hijoDer = insertar(nodo.hijoDer, elemento);
			}
		}
		return nuevo;
	}

	// Existen varias (3) formas de imprimir un árbol binario
	// Pre orden: Imprime raíz, subárbol izquierdo, subárbol derecho
	// Post orden: Sub árbol izquierdo, sub árbol derecho, raíz
	// In orden: Sub árbol izquierdo, raíz, subárbol derecho
	private void imprimir(Nodo nodo){
		if(nodo != null){
			imprimir(nodo.hijoIzq);
			System.out.println(nodo); 
			imprimir(nodo.hijoDer);
		}
	}

	public void imprimir(){
		imprimir(this.raiz);
	}


	public static void main (String [] args){
		ArbolBinario arbol = new ArbolBinario();
		arbol.insertar(20);
		arbol.insertar(10);
		arbol.insertar(50);
		arbol.insertar(40);
		arbol.insertar(30);
		arbol.insertar(5);
		arbol.insertar(8);
		arbol.insertar(2);
		arbol.insertar(3);
		arbol.insertar(6);
		arbol.imprimir();
	}














}