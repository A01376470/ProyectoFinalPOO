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
public class FullInventoryException extends Exception{
    public FullInventoryException(){
        
    }
    
    @Override
    public String getMessage(){
        return "El inventario está lleno";
    }
}
