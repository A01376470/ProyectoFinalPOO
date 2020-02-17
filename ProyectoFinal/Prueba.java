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
public class Prueba {
    
    public static void main(String[] args){
        
        Vehiculo carro = new Moto(10, "rojo",250, "bmw", 20, 10, 10, 1.5 );
        Inventario inventario = new Inventario();
        try{
        inventario.comprarVehiculo(carro);
        System.out.println(inventario.getNumCarros());
        inventario.venderVehiculo(carro);
        System.out.println(inventario.getNumCarros());
        System.out.println(carro.getAceleracion());
        } catch (FullInventoryException f){
            System.out.println("Full Inventory");
        } catch (EmptyInventoryException e){
            System.out.println("Empty Inventory");
        }
    }
    
}
