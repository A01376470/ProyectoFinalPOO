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
public class Electrico extends Motor{
    private int voltajeMax;
    
    public Electrico(int potencia, int torque, int voltajeMax){
        super(potencia, torque);
        this.voltajeMax = voltajeMax;
    }
    
    public int getVoltajeMax(){
        return voltajeMax;
    }
}
