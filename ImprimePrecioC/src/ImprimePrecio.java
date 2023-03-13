/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class ImprimePrecio {
     Scanner stdIn = new Scanner(System.in);
     double precio; // precio de compra del artículo
     int cant; // número de artículos comprados
        
    public void Datos(){
    System.out.print("Precio de compra del artículo: ");
        precio = stdIn.nextDouble();
        System.out.print("Cantidad: ");
        cant = stdIn.nextInt();
        System.out.println("Total de orden de compra = $" + precio * cant);
    }
    public static void main(String[] args) {
        ImprimePrecio datos = new ImprimePrecio();
        datos.Datos();
    }
    
}
