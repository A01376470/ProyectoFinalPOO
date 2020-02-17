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
public abstract class Vehiculo {
    private int modelo;
    protected String color;
    protected Motor motor;
    protected double precio;
    private String marca;
    
    public Vehiculo(int modelo, String color, double precio, String marca, int potencia, int torque, int cilindros, double capacidad){
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.marca = marca;
        motor = new Gasolina(potencia, torque, cilindros, capacidad);
    }
    
    public Vehiculo(int modelo, String color, double precio, String marca, int potencia, int torque, int voltajeMax){
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.marca = marca;
        motor = new Electrico(potencia, torque, voltajeMax);
    }
    
    public Vehiculo(int modelo, String color, double precio, String marca, Motor motor){
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.marca = marca;
        this.motor = motor;
    }
    
    public int getModelo(){
        return modelo;
    }
    
    public String getColor(){
        return color;
    }
    
    public Motor getMotor(){
        return motor;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public abstract double getAceleracion();
    
    @Override
    public String toString(){
        return "Modelo: " + marca + " " + modelo + " " + color + ", precio: $" + precio + "k";
    }
}
