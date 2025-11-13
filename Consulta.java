public class Consulta{
	public int sumaArreglo(int [] arreglo, int inicio, int i, int contador){
		int suma = 0;
		if(inicio + i < arreglo.length && inicio + i >= 0){
			if(i+1 >= contador){
				suma += arreglo[inicio + i];
			}
			else{
				suma += arreglo[inicio+i] + sumaArreglo(arreglo, inicio, i+1, contador);
			}
		}
		return suma;
	}

	public int calcularAlertas(int [] arregloMinutos, int umbralAlerta, int minutosAnteriores, int i){
		int alertas = 0;
		if(i + minutosAnteriores - 1 <= arregloMinutos.length){
			int suma = sumaArreglo(arregloMinutos, i, 0, minutosAnteriores);
			suma /= minutosAnteriores;
			if(suma > umbralAlerta){
				alertas = 1;
			}
			alertas += calcularAlertas(arregloMinutos, umbralAlerta,minutosAnteriores, i+1);
		}
		return alertas;
	}

	public static void main (String [] args){
		int [] numeroLlamadas = {2,2,2,2,5,5,5,8};
		int umbralAlerta = 4;
		int minutosAnteriores = 3;
		Consulta c = new Consulta();
		System.out.println(c.calcularAlertas(numeroLlamadas, umbralAlerta, minutosAnteriores, 0));
	}
}