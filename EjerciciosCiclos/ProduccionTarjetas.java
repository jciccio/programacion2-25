public class ProduccionTarjetas{
	

	public int producirLote(int cantidadTotalLote, int produccionDiaria){
		int diaSemanaActual = 0; // 0 -> lunes, 1-> martes ... 6-> domingo
		int diaMesActual = 0;
		int cantidadTotalProducida = 0;
		int dias = 0;

		while(cantidadTotalProducida < cantidadTotalLote){
			int produccion = produccionDiaria;
			if(diaSemanaActual == 1){
				produccion *= 1.75;
			}
			else{
				if(diaSemanaActual == 4){
					produccion *= 0.5;
				}
				else {
					if(diaSemanaActual == 5 || diaSemanaActual == 6){
						produccion = 0;
					}
				}
			}

			if(diaMesActual == 19 && produccion != 0){
				produccion = produccionDiaria * 2;
			}
			cantidadTotalProducida += produccion;
			diaSemanaActual = (diaSemanaActual+1)%7;
			diaMesActual = (diaMesActual+1)%30;
			dias++;
		}

		return dias;
	}


	public static void main (String [] args){
		int diaSemana = 0;

		while(diaSemana < 60){
			System.out.println(diaSemana%7);
			System.out.println(diaSemana%30 + 1);
			diaSemana++;
		}
	}
}