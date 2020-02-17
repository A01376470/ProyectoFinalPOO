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
public class Moto extends Vehiculo{
    
    public Moto(int modelo, String color, double precio, String marca, int potencia, int torque, int cilindros, double capacidad){
        super(modelo, color, precio, marca, potencia, torque, cilindros, capacidad);
    }
    
    public Moto(int modelo, String color, double precio, String marca, Motor motor){
        super(modelo, color, precio, marca, motor);
    }
    
    @Override
    public double getAceleracion(){
        Gasolina mg = (Gasolina)motor;
        return motor.getTorque()*mg.getCilindros()*0.025;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public void setColor(String color){
        this.color = color;
    }
}
