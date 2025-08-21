public class PruebaTelevisor
{
    public static void main (String []  args){
        Televisor tv1 = new Televisor(50, 90.7);
        tv1.bajarVolumen();
        tv1.bajarVolumen();
        tv1.bajarVolumen();
        tv1.imprimir();

        // Yo quiero obtener el canal actual y sumarle 15 unidades e ir a ese canal
        // Necesito:
        // Obtener el canal
        // Aplicarle la operaci'on
        // Asignar el canal nuevo
        // 90.7 + 15 => 105.7
        double canalActual = tv1.getCanal();
        canalActual = canalActual + 15;
        tv1.setCanal(canalActual);
        tv1.subirVolumen();
        tv1.subirVolumen();
        tv1.subirVolumen();
        tv1.subirVolumen();
        tv1.subirVolumen();
        tv1.subirVolumen();
        tv1.imprimir();
    }
}