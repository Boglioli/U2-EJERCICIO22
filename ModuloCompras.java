public class ModuloCompras {
    private ProcesadorPago procesador;
    public ModuloCompras(ProcesadorPago procesador) {
        this.procesador = procesador;
    }
    public void realizarCompra(double monto) {
        boolean resultado = procesador.procesaPago(monto);
        if(resultado) {
            System.out.println("compra realizada, comprobante emitido");
        } else {
            System.out.println("compra rechazada");
        }
    }
}
