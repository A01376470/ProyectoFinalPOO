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
public class Compacto extends Carro implements Entretenimiento  {
    public Compacto(int modelo, String color, double precio, String marca, int potencia, int torque, int cilindros, double capacidad){
        super(modelo, color, precio, marca, potencia, torque, cilindros, capacidad);
    }
    
    public Compacto(int modelo, String color, double precio, String marca, int potencia, int torque, int voltajeMax){
        super(modelo, color, precio, marca, potencia, torque, voltajeMax);
    }
    
    public Compacto(int modelo, String color, double precio, String marca, Motor motor){
        super(modelo, color, precio, marca, motor);
    }
    @Override
    public String iniciarSistema(){
        return "Sistema iniciando... Pantalla y Bocinas Listas";
    }
    @Override
    public double getAceleracion(){
        double a = 0;
        if (motor instanceof Gasolina){
            Gasolina g = (Gasolina)motor;
            a = motor.getTorque() * g.getCilindros() * 0.03;
        }
        if (motor instanceof Electrico ){
            Electrico e = (Electrico)motor;
            a = motor.getTorque() * e.getVoltajeMax() * .035;
        }
        return a;
    }
}
