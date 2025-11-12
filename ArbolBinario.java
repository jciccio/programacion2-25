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
	// Metodo accesible desde la instancia
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

	// Metodo accesible desde la instancia
	public Nodo borrar(int elemento){
		return borrar(elemento, raiz);
	}

	private Nodo borrar(int elemento, Nodo nodo){
		Nodo retorno = null;
		if(nodo != null){
			if(nodo.elemento > elemento){
				// Nos movemos hacia la izquierda
				nodo.hijoIzq = borrar(elemento, nodo.hijoIzq);
			}
			else if (nodo.elemento < elemento){
				// Nos movemos hacia la derecha
				nodo.hijoDer = borrar(elemento, nodo.hijoDer);
			}
			else {
				// Encontramos el nodo que queremos borrar :)
				if(nodo.hijoIzq == null){
					nodo = nodo.hijoDer;
				}
				else if (nodo.hijoDer == null){
					nodo = nodo.hijoIzq;
				}
				else{ // Tiene dos hijos
					Nodo menor  = buscarMenor(nodo.hijoDer);
					nodo.elemento = menor.elemento;
					nodo.hijoDer = borrar(nodo.elemento, nodo.hijoDer);
				}
			}
			retorno = nodo;
		}
		return retorno;
	}

	public Nodo buscar(int elemento){
		return buscar(elemento, raiz);
	}

	private Nodo buscar(int elemento, Nodo nodo){
		Nodo buscado = null;
		if(nodo != null){
			if(nodo.elemento > elemento){
				// Nos movemos hacia la izquierda
				buscado = buscar(elemento, nodo.hijoIzq);
			}
			else if(nodo.elemento < elemento){
				// Nos movemos hacia la derecha
				buscado = buscar(elemento, nodo.hijoDer);
			}
			else{
				buscado = nodo;
			}
		}
		return buscado;
	}

	public Nodo buscarMenor(Nodo nodoActual){
		while(nodoActual.hijoIzq != null){
			nodoActual = nodoActual.hijoIzq;
		}
		return nodoActual;
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
		System.out.println("- - - -");
		arbol.borrar(10);
		arbol.imprimir();
	}














}