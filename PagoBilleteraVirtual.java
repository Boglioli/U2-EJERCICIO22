public class PagoBilleteraVirtual implements ProcesadorPago {
    @Override
    public boolean procesaPago(double monto) {
        if (monto > 0 && monto <= 200000) {
            System.out.println("pago con la billetera virtual aprobada");
            return true;
        }
        System.out.println("pago con la billetera virtual rechazada");
        return false;
    }
}