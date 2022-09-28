//Kevin Li, Roberto Luo, Keny Tang, Enrique Wen

//Una tienda vende zapatos, carteras, vestidos y sombreros. 
//Crear una aplicación que permita llevar el inventario de actualizado acorde con la compra.

//Su programa debe imprimir el inventario actualizado en pantalla y solicitarle al cliente que desea comprar.
//Una vez el cliente seleccione, se le solicita la cantidad y se
//imprime en pantalla el costo total de lo que se está comprando.

//Al final, se debe mostrar el inventario actualizado en pantalla y solo
//se sale de la aplicación si el cliente escoge la opción de salir

import java.util.Scanner;
public class Cuatro2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //Crear el inventario dado por el problema
        double costo;
        int r, cantT, cantz =150, cantc = 100, cantv = 2, cants=10, opcion;
        System.out.println("Items \n"
                            + "Zapatos      |  Precio 25.00      |  Cantidad 150      |  Introduzca 1 \n"
                            + "Carteras     |  Precio 15.50      |  Cantidadd 100     |  Introduzca 2 \n"
                            + "Vestidos     |  Precio 150.75     |  Cantidad 2        |  Introduzca 3 \n"
                            + "Sombreros    |  Precio 5.00       |  Cantidad 10       |  Introduzca 4 \n"  
                            + "¿Que deseas comprar?");
        r = scan.nextInt();
            if(r==1)
            {
                System.out.println("Zapatos  |  Precio 25.00  |  Cantidad de "+ cantz);
                System.out.println("Cantidad que deseas");
                cantT = scan.nextInt();
                costo = cantT * 25;
                System.out.println("Costo Total: " + costo);
            }

            else if(r==2)
            {
                System.out.println("Carteras  |  Precio 15.50  |  Cantidad de "+ cantc);
                System.out.println("Cantidad que deseas");
                cantT = scan.nextInt();
                costo = cantT * 15.50;
                System.out.println("Costo Total: " + costo); 
            }

            else if(r==3)
            {
                System.out.println("Vestidos  |  Precio 150.75  |  Cantidad de "+ cantv);
                System.out.println("Cantidad que deseas");
                cantT = scan.nextInt();
                costo = cantT * 150.75;
                System.out.println("Costo Total: " + costo); 
            }

            else if(r==4)
            {
                System.out.println("Sombreros  |  Precio 5.00  |  Cantidad de "+ cants);
                System.out.println("Cantidad que deseas");
                cantT = scan.nextInt();
                costo = cantT * 5;
                System.out.println("Costo Total: " + costo); 
            }
        //Que da por hacer que se repita la opcion (con los datos actualizados de la tienda refiriendose la cantidad)
        //opcion de salir
    
    scan.close();
    }
}