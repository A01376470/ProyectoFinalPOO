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
public class Motor {
    private int potencia;
    private int torque;
    
    public Motor(int potencia, int torque){
        this.potencia = potencia;
        this.torque = torque;
    }
    
    public int getPotencia(){
        return potencia;
    }
    
    public int getTorque(){
        return torque;
    }
    
}
