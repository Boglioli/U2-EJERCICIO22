public class PagoCriptomoneda implements ProcesadorPago {
    @Override
    public boolean procesaPago(double monto) {
        if (monto > 0) {
            System.out.println("pago con criptomoneda aprobado");
            return true;
        }
        System.out.println("pago con criptomoneda fue rechazado");
        return false;
    }
}