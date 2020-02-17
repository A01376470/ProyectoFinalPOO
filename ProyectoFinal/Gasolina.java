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
public class Gasolina extends Motor{
    private int cilindros;
    private double capacidad;
    
    public Gasolina(int potencia, int torque, int cilindros, double capacidad){
        super(potencia, torque);
        this.cilindros = cilindros;
        this.capacidad = capacidad;
    }
    
    public int getCilindros(){
        return cilindros;
    }
    
    public double getCapacidad(){
        return capacidad;
    }
}
