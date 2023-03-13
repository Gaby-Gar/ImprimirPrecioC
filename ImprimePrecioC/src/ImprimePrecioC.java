package imprimeprecioc;
import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * Scanner 
 * Este programa calcula e imprime la cantidad de una orden de compra.
 *
 */
public class ImprimePrecioC {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        double precio; // precio de compra del artículo
        int cant; // número de artículos comprados
        
        System.out.print("Precio de compra del artículo: ");
        precio = stdIn.nextDouble();
        System.out.print("Cantidad: ");
        cant = stdIn.nextInt();
        System.out.println("Total de orden de compra = $" + precio * cant);
    }

}
