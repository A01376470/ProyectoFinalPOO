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
public class Inventario {
    private Vehiculo[] vehiculos;
    private int numVehiculos;
    
    public Inventario(){
        vehiculos = new Vehiculo[30];
        numVehiculos=0;
    }
    
    public Inventario(int tamaño){
        vehiculos = new Vehiculo[tamaño];
        numVehiculos = 0;
    }
    
    public Vehiculo[] getVehiculos(){
        return vehiculos;
    }
    
    public Moto[] getMotos(){
        int n = 0;
        Moto[] motos = new Moto[getNumMotos()];
        for (Vehiculo vehiculo:vehiculos){
            if (vehiculo instanceof Moto){
                motos[n] = (Moto)vehiculo;
                n++;
            }
        }
        return motos;
    }
    
    public Carro[] getCarros(){
        int n = 0;
        Carro[] carros = new Carro[getNumCarros()];
        for (Vehiculo vehiculo:vehiculos){
            if (vehiculo instanceof Carro) {
                carros[n] = (Carro)vehiculo;
                n++;
            }
        }
        return carros;
    }
    
    public Camioneta[] getCamionetas(){
        int n = 0;
        Camioneta[] camionetas = new Camioneta[getNumCamionetas()];
        for (Vehiculo vehiculo:vehiculos){
            if (vehiculo instanceof Camioneta) {
                camionetas[n] = (Camioneta)vehiculo;
                n++;
            }
        }
        return camionetas;
    }
    
    public int getNumVehiculos(){
        return numVehiculos;
    }
    
    public int getNumMotos(){
        int numMotos = 0;
        for (Vehiculo vehiculo:vehiculos){
            if (vehiculo instanceof Moto){
                numMotos++;
            }
        }
        return numMotos;
    }
    
    public int getNumCarros(){
        int numCarros = 0;
        for (Vehiculo vehiculo:vehiculos){
            if (vehiculo instanceof Carro){
                numCarros++;
            }
        }
        return numCarros;
    }
    
    public int getNumCamionetas(){
        int numCamionetas = 0;
        for (Vehiculo vehiculo:vehiculos){
            if (vehiculo instanceof Camioneta){
                numCamionetas++;
            }
        }
        return numCamionetas;
    }
    
    public void venderVehiculo(Vehiculo vehiculo) throws EmptyInventoryException{
        if (numVehiculos == 0){
            throw new EmptyInventoryException();
        }
        for (int i = 0; i<vehiculos.length;i++){
            if(vehiculo == vehiculos[i]){
                vehiculos[i] = null;
                numVehiculos--;
            }
        }
        
    }
    
    public void venderVehiculo(int modelo, String marca, String color, double precio) throws EmptyInventoryException{
        if (numVehiculos == 0){
            throw new EmptyInventoryException();
        }
        for (int i = 0; i<vehiculos.length;i++){
            if(modelo == vehiculos[i].getModelo() && marca.equalsIgnoreCase(vehiculos[i].getMarca()) && color.equalsIgnoreCase(vehiculos[i].getColor()) && precio == vehiculos[i].getPrecio()){
                vehiculos[i] = null;
                numVehiculos--;
                break;
            }
        }
    }
    
    public void comprarVehiculo(Vehiculo vehiculo) throws FullInventoryException{
        if (numVehiculos>=vehiculos.length){
            throw new FullInventoryException();
        }
        for (int i = 0; i<vehiculos.length;i++){
            if(vehiculos[i] == null){
                vehiculos[i] = vehiculo;
                numVehiculos++;
                break;
            }
        } 
    }
    
    public void comprarVehiculo(String tipo, int modelo, String marca, String color, double precio) throws FullInventoryException, IllegalArgumentException{
        if (getNumVehiculos()>=30){
            throw new FullInventoryException();
        }
        if (modelo < 1970 || modelo > 2019){
            throw new IllegalArgumentException();
        }
        Vehiculo vehiculo = new Compacto(modelo, color, precio, marca, 140, 10, 8, 1.5);
        if (tipo.equals("Compacto")){
            vehiculo = new Compacto(modelo, color, precio, marca, 140, 10, 8, 1.5);
        } else if(tipo.equals("Deportivo")){
            vehiculo = new Deportivo(modelo, color, precio, marca, 400, 10, 8, 1.8);
        } else if(tipo.equals("Moto")){
            vehiculo = new Moto(modelo, color, precio, marca, 100, 10, 8, 1.5);
        } else if(tipo.equals("SUV")){
            vehiculo = new SUV(modelo, color, precio, marca, 180, 10, 8, 1.5);
        } else if(tipo.equals("Pickup")){
            vehiculo = new Pickup(modelo, color, precio, marca, 200, 10, 8, 1.5);
        } 
        for (int i = 0; i<vehiculos.length;i++){
            if(vehiculos[i] == null){
                vehiculos[i] = vehiculo;
                numVehiculos++;
                break;
            }
        } 
    }
    
    
    
    @Override
    public String toString(){
         if (getNumVehiculos() <= 0) {
            return "[]";
        }
        
        String result = "[";
        int count = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo != null) {
                result += vehiculo;
                count++;
                if (count < getNumVehiculos()) {
                    result += " ";
                }
            }
        }
        
        return result;
    }
    
    
}
