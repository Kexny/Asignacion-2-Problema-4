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
        int opc=6;
        //hacemos que se repita hasta que el usuario decida salir para terminar el programa
        while(opc == 6)
        {
            //Crear el inventario dado por el problema
            double costo;
            int resp, cantT, cantz =150, cantc = 100, cantv = 2, cants=10;
            System.out.println("Items \n"
                            + "Zapatos      |  Precio 25.00      |  Cantidad 150      |  Introduzca 1 \n"
                            + "Carteras     |  Precio 15.50      |  Cantidadd 100     |  Introduzca 2 \n"
                            + "Vestidos     |  Precio 150.75     |  Cantidad 2        |  Introduzca 3 \n"
                            + "Sombreros    |  Precio 5.00       |  Cantidad 10       |  Introduzca 4 \n"  
                            + "¿Que items deseas?");
            resp = scan.nextInt();

            if(resp==1)
            {
                System.out.println("Zapatos  |  Precio 25.00  |  Cantidad "+ cantz);
                System.out.println("Cantidad que deseas");
                cantT = scan.nextInt();
                costo = cantT * 25;
                System.out.println("Costo Total: " + costo);
            }

            else if(resp==2)
            {
                System.out.println("Carteras  |  Precio 15.50  |  Cantidad "+ cantc);
                System.out.println("Cantidad que deseas");
                cantT = scan.nextInt();
                costo = cantT * 15.50;
                System.out.println("Costo Total: " + costo); 
            }

            else if(resp==3)
            {
                System.out.println("Vestidos  |  Precio 150.75  |  Cantidad "+ cantv);
                System.out.println("Cantidad que deseas");
                cantT = scan.nextInt();
                costo = cantT * 150.75;
                System.out.println("Costo Total:  " + costo); 
            }

            else if(resp==4)
            {
                System.out.println("Sombreros  |  Precio 5.00  |  Cantidad "+ cants);
                System.out.println("Cantidad que deseas");
                cantT = scan.nextInt();
                costo = cantT * 5;
                System.out.println("Costo Total: " + costo); 
            }
            //Si el usuario desea seguir la compra se regresa al menu de inventario actualizado
            //*IMPORTANTE* (Borrar esto cuando se haga el cambio) | Que da por hacer que se repita la opcion 
            //(con los datos actualizados de la tienda refiriendose la cantidad)
            
            //Si desea terminar la compra se finaliza el programa
            System.out.println("¿Deseas terminar la compra o seguir? \n"
                                + "Si deseas salir          |   Introduzca 5 \n"
                                + "Si deseas continuar      |   Introduzca 6");
            opc = scan.nextInt();
            if(opc==5)
            {
                System.out.println("Gracias por su compra y esperemos su regreso");
            }
        }
        scan.close();
    }
}
