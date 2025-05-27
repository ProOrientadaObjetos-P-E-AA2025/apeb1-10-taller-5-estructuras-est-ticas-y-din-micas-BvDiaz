package taller5;
public class Problema_1_ProductoBase {
    public int unidades;
    public double costoUnitario;
    public double porcentajeDescuento;
    public double totalDescuento;
    public double totalPagar;

    public Problema_1_ProductoBase() {}

    public Problema_1_ProductoBase(int unidades, double costoUnitario) {
        this.unidades = unidades;
        this.costoUnitario = costoUnitario;
    }

    public void aplicarDescuento() {
        if (costoUnitario >= 1000 && unidades >= 10) {
            porcentajeDescuento = 10.0;
        } else {
            porcentajeDescuento = 5.0;
        }
        totalDescuento = (unidades * costoUnitario) * (porcentajeDescuento / 100);
    }

    public void calcularTotal() {
        totalPagar = (unidades * costoUnitario) - totalDescuento;
    }

    @Override
    public String toString() {
        return "\nProducto:" +
               "\nCantidad: " + unidades +
               "\nCosto por unidad: $" + costoUnitario +
               "\nDescuento aplicado: " + porcentajeDescuento + "%" +
               "\nMonto de descuento: $" + totalDescuento +
               "\nTotal a pagar: $" + totalPagar + "\n";
    }
}
