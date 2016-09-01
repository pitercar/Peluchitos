/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peluchitos;
import java.util.*;

/**
 *
 * @author Piter
 */
public class Principal {
       
 public static void main(String[] args) {
        // TODO code application logic here
        
    int opcion;
            
    Peluchitos conta=new Peluchitos();
    Scanner entrada=new Scanner(System.in);
            
        do{
           System.out.println(" "); 
           System.out.println("DIGITE LA OPCION DESEADA...");
           System.out.println(" ");
           System.out.println("1. Agregar Producto");
           System.out.println("2. Buscar Producto");
           System.out.println("3. Eliminar producto");
           System.out.println("4. Mostrar Inventario");
           System.out.println("5. Realizar Venta");
           System.out.println("6. Mostrar Ganancias totales");
           System.out.println("0. Salir");
                   
           opcion=entrada.nextInt();
                   
           switch(opcion){
                          
           case 0: System.out.println("Hasta luego !!!");
                break;
                          
           case 1: conta.Agregar_Producto();
                break;
                   
           case 2: conta.BuscarProducto();
                break;
           
           case 3: conta.Eliminar_Producto();
                break;      
                   
           case 4: conta.Mostrar_Inventario();
                break;
                          
           case 5: conta.Realizar_Ventas();
                break;
                          
            case 6: conta.Mostrar_Ganancias();
                break;
                          
            default: System.out.println("Opcion Invalida ");
                    }                  
        }while(opcion!=0);
    }       
}
  