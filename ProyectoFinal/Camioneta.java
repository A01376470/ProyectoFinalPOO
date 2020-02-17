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
public abstract class Camioneta extends Vehiculo {
    
    public Camioneta(int modelo, String color, double precio, String marca, int potencia, int torque, int cilindros, double capacidad){
        super(modelo, color, precio, marca, potencia, torque, cilindros, capacidad);
    }
    
    public Camioneta(int modelo, String color, double precio, String marca, int potencia, int torque, int voltajeMax){
        super(modelo, color, precio, marca, potencia, torque, voltajeMax);
    }
    
    public Camioneta(int modelo, String color, double precio, String marca, Motor motor){
        super(modelo, color, precio, marca, motor);
    }
    
    @Override
    public abstract double getAceleracion();
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public void setColor(String color){
        this.color = color;
    }
}


