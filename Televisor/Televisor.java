

public class Televisor
{
    private int volumen; // 15
    private double canal; // 95.3
    
    public Televisor(int volumen, double canal){
        this.volumen = volumen;
        this.canal = canal;
    }
    
    public void setCanal(double canal){
        this.canal = canal;
    }
    
    public void subirVolumen(){
        volumen = volumen + 1;
    }
    
    public void bajarVolumen(){
        volumen = volumen - 1;
    }
    
    public int getVolumen(){
        return volumen;
    }
    
    public double getCanal(){
        return canal;
    }
    
    public void imprimir(){
        System.out.println("Los datos del televisor son:");
        System.out.println("Volumen: " + volumen  + "\nCanal: " + canal);
    }
    
    
}