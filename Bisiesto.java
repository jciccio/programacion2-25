public class Bisiesto{
	

	public boolean esBisiesto(int anyo){
		boolean bisiesto = false;
		//Un año es bisiesto si es divisible entre 4 
		//y no es divisible entre 100, o si es divisible entre 400.
		if(anyo >= 0){
			if((anyo % 4 == 0 && anyo % 100 != 0) || anyo % 400 ==0){
				bisiesto = true;
			}
		}
		return bisiesto;
	}





}