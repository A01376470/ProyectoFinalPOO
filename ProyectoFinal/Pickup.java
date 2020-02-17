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
public class Pickup extends Camioneta implements Entretenimiento {
    public Pickup(int modelo, String color, double precio, String marca, int potencia, int torque, int cilindros, double capacidad){
        super(modelo, color, precio, marca, potencia, torque, cilindros, capacidad);
    }
    
    public Pickup(int modelo, String color, double precio, String marca, Motor motor){
        super(modelo, color, precio, marca, motor);
    }
    @Override
    public String iniciarSistema(){
        return "Sistema iniciando... Bocinas Listas";
    }
    @Override
    public double getAceleracion(){
        Gasolina g = (Gasolina)motor;
        return motor.getTorque()*g.getCilindros()*0.06;
}
}
