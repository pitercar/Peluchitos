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
public class Peluchitos {

    private String  nomProducto,nomBuscar, nomEliminar;
    private int  cantProducto,valorProducto,cantVender;
    
    public void Agregar_Producto(){
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Nombre del producto: ");
        nomProducto = entrada.next();
        
        System.out.println("Cantidad de productos: ");
        cantProducto = entrada.nextInt();
        
        System.out.println("Valor del producto: ");
        valorProducto = entrada.nextInt();

        //System.out.println("El producto digitado es "+nomProducto);
        //System.out.println("La cantidad digitada es "+cantProducto);
        //System.out.println("El valor digitado es "+valorProducto);
    }
    
    public void BuscarProducto(){
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Digite el nombre del producto: ");
        nomBuscar = entrada.next();
        System.out.println("el valor almacenado en nombre a buscar es "+nomBuscar);                
        
        if (nomBuscar==nomProducto){
            
            System.out.println("El producto es "+nomProducto);
            System.out.println("Existen "+cantProducto+"Procuctos");
            System.out.println("El costo del producto es "+valorProducto);
        }
        else{
            
            System.out.println("El producto no existe!");
        }
    }
    
    public void Eliminar_Producto(){
        Scanner entrada=new Scanner(System.in);
                
        System.out.println("Digite el nombre del producto: ");
        nomEliminar=entrada.next();
        
        if (nomEliminar==nomProducto){
            
            nomProducto=null;
            cantProducto=0;
            valorProducto=0;           
            
            System.out.println("No hay productos en inventario ");        
        }
        else{
            
            System.out.println("El producto no existe!");
        }        
    }
    
    public void Mostrar_Inventario(){
        
        System.out.println("El producto es "+nomProducto);
        System.out.println("Existen "+cantProducto+" Procuctos");
        System.out.println("El costo del producto es "+valorProducto);
    }
    
    public void Realizar_Ventas(){
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Digite el nombre del producto: ");
        nomBuscar = entrada.next();
        
        if (nomBuscar==nomProducto){
            
            System.out.println("Cuantos productos desea vender ");
            cantVender=entrada.nextInt();
            
            if(cantVender>cantProducto){
                System.out.println("El inventario NO alcanza ");                
            }            
            cantProducto=cantVender;
        }
        else{            
            System.out.println("El producto no existe!");
        }
    }
    
    public void Mostrar_Ganancias(){
        
        System.out.println("Se han vendido "+cantVender+" unidades del "+nomProducto);
        System.out.println("El valor total de la venta fue de "+(cantVender*valorProducto));
        System.out.println("El valor total de la utilidad fue de "+((cantVender*valorProducto)-valorProducto));
    }
}
