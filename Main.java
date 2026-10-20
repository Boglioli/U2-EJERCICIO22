public class Main {
    public static void main(String[] args) {
        ModuloCompras compra;
        compra = new ModuloCompras(new PagoTarjetaCredito());
        compra.realizarCompra(100000);
        System.out.println();
        compra = new ModuloCompras(new PagoCriptomoneda());
        compra.realizarCompra(300000);
        System.out.println();
        compra = new ModuloCompras(new PagoBilleteraVirtual());
        compra.realizarCompra(150000);
        System.out.println();
        compra = new ModuloCompras(new PagoBilleteraVirtual());
        compra.realizarCompra(2500000);
    }
}
