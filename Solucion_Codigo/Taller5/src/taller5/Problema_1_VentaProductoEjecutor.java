package taller5;

import java.util.Scanner;

public class Problema_1_VentaProductoEjecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad;
        double precio;

        // Validación de entradas con while
        while (true) {
            System.out.print("Ingrese la cantidad adquirida: ");
            cantidad = scanner.nextInt();
            if (cantidad > 0) break;
            System.out.println("La cantidad debe ser mayor que cero.");
        }

        while (true) {
            System.out.print("Ingrese el precio por unidad: ");
            precio = scanner.nextDouble();
            if (precio > 0) break;
            System.out.println("El precio debe ser mayor que cero.");
        }

        Problema_1_ProductoBase productoUsuario = new Problema_1_ProductoBase(cantidad, precio);
        productoUsuario.aplicarDescuento();
        productoUsuario.calcularTotal();
        System.out.println(productoUsuario);

        
        Problema_1_ProductoBase productoFijo = new Problema_1_ProductoBase(15, 1200.0);
        productoFijo.aplicarDescuento();
        productoFijo.calcularTotal();
        System.out.println(productoFijo);
    }
}
