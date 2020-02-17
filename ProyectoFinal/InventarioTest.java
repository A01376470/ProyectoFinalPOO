/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;

/**
 *
 * @author luis_
 */
public class InventarioTest {
    
    public static void main(String[] args){
        
        Vehiculo c = new Compacto (2015, "blanco", 400, "BMW", 8, 8, 8, 1.8);
        Vehiculo electrico = new Compacto(2019, "rojo", 800, "Tesla", 8, 5, 5);
        Vehiculo suv = new SUV(2010, "arena", 400, "Toyota", 6, 7, 8, 1.5);
        Vehiculo moto = new Moto(2015, "negro", 40, "Yamaha", 5, 5, 5, 1.5);
        Vehiculo pickup =new Pickup(2013, "gris", 500, "Jeep", 8, 8, 5, 1.8);
        Vehiculo deportivo = new Deportivo(2019, "gris", 1000, "McLaren", 10, 10, 10, 1.8);
        Vehiculo bla = new Compacto(2000, "amarillo", 50, "Volkswagen", 5, 5, 5, 1);
        
        Inventario inventario = new Inventario(6);
        
        try{
            inventario.venderVehiculo(c.getModelo(), c.getMarca(), c.getColor(), c.getPrecio());
            
        }catch(EmptyInventoryException f){
            System.out.println(f.getMessage());
        }
        
        try{
            inventario.comprarVehiculo(c);
            inventario.comprarVehiculo(electrico);
            inventario.comprarVehiculo(suv);
            inventario.comprarVehiculo(moto);
            inventario.comprarVehiculo(pickup);
            inventario.comprarVehiculo(deportivo);

        }catch(FullInventoryException f){
            System.out.println(f.getMessage());
        }
        try{
            inventario.comprarVehiculo(bla);
            inventario.comprarVehiculo(bla);
            inventario.comprarVehiculo(bla);
            inventario.comprarVehiculo(bla);
            inventario.comprarVehiculo(bla);
            }catch(FullInventoryException f){
            System.out.println(f.getMessage());
        }
        System.out.println(inventario.getNumVehiculos());
        try{
            inventario.venderVehiculo(c.getModelo(), c.getMarca(), c.getColor(), c.getPrecio());
            
        }catch(EmptyInventoryException f){
            System.out.println(f.getMessage());
        }
        
        System.out.println(inventario);
        System.out.println(inventario.getCamionetas());
    }
}
