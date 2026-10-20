public class PagoTarjetaCredito implements ProcesadorPago {
    @Override
    public boolean procesaPago(double monto) {
        if (monto > 0 && monto <= 500000) {
            System.out.println("pago con tarjeta de credito aprobado");
            return true;
        }
        System.out.println("pago con tarjeta de credito rechazada");
        return false;
    }
}