package servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TiendaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void introducirElemnto(HashMap<String, Double> productos) {
        System.out.println("Ingrese el nombre del Producto");
        String producto = leer.next();

        System.out.println("Ingrese el precio del Producto");
        Double precio = leer.nextDouble();

        productos.put(producto, precio);

    }

    public void modificarPrecio(HashMap<String, Double> productos) {
        System.out.println("Ingrese el producto que quiere cambiar el precio");
        String proC = leer.next();

        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(proC)) {
                System.out.println("Ingrese el nuevo precio de " + proC);
                entry.setValue(leer.nextDouble());
            }

        }

    }

    public void eliminarProducto(HashMap<String, Double> productos) {
        System.out.println("Ingrese el nombre del producto a elimar");
        String proE = leer.next();
        productos.remove(proE);
    }

    public void mostrarProductos(HashMap<String, Double> productos) {

        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println("Producto: " + entry.getKey() + ", Precio del Producto: $" + entry.getValue());

        }

    }

    public void menuTienda() {
        HashMap<String, Double> productos = new HashMap();
        String res = "n";

        do {
            
             try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TiendaServicios.class.getName()).log(Level.SEVERE, null, ex);
        }

            System.out.println("======== MENU ========");
            System.out.println("1.Agregar producto.");
            System.out.println("2.Modificar precio.");
            System.out.println("3.Eliminar producto");
            System.out.println("4.Mostrar lista de productos");
            System.out.println("5.Salir");
            System.out.println("========    ======== ");

            System.out.println("\nIngrese un numero para ingresar a la opcion");

            int var = leer.nextInt();

            switch (var) {
                case 1:
                    introducirElemnto(productos);
                    break;
                case 2:
                    modificarPrecio(productos);
                    break;
                case 3:
                    eliminarProducto(productos);
                    break;
                case 4:
                    mostrarProductos(productos);
                    break;
                case 5:
                    System.out.println("Desea Salir? s/n");
                    res = leer.next();
                    break;
                default:
                    System.out.println("Numero de opcion mal ingresado, reingrese porfavor");
                    ;
            }
        } while (!res.equalsIgnoreCase("s"));
    }

}
