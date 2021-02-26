/*
 * Universidad Estatal a Distancia
 * Programación Intermedia
 * Tarea 1
 * Estudiante: Yesenia Obando Díaz
 */

package tarea_1_yessenia_obando_diaz;


public class DATCARSEG {
    
    //Atributos
    private int  idOwner, modelo, montoAsegurado; 
    private int recargoPorModelo;
    private String placa,nombre;
    private double primaMensual, descuento;
    int discapacidad;
    
    //Constructor --> da estado inicial al objeto
    public DATCARSEG(){
        
        this.idOwner = 0;
        this.modelo = 0;
        this.montoAsegurado = 0;
        this.discapacidad = 0;
    }
    
 //Métodos setters que establecen las variables 
    
    public void establecerIdCliente (int idCliente) {
        idOwner = idCliente;
    }  
 
    public void establecerNombreCliente (String nombreCliente) {
        nombre = nombreCliente;
    }

    public void establecerModelo (int modeloAuto) {
        modelo = modeloAuto;
    }

    public void establecerPlaca (String placaAuto) {
        placa = placaAuto;
    }

    public void establecerMontoAsegurado (int montoAsegAuto) {
        montoAsegurado = montoAsegAuto;
    }

    public void establecerDiscapacidad (int hayDiscapacidad) {
        if (hayDiscapacidad == 1){
        discapacidad = 1;
        } else if (hayDiscapacidad == 0)
        {
        discapacidad = 0;
        }
    }

//Métodos getters que retornan las variables establecidas

    public int dimeIdCliente () {
       return idOwner;
    }  
 
    public String dimeNombreCliente () {
       return nombre;
    }

    public int dimeModelo () {
       return modelo;
    }

    public String dimePlaca () {
       return placa;
    }

    public int dimeMontoAsegurado () {
       return montoAsegurado;
    }

    public int dimeDiscapacidad () {
       return discapacidad;
    }
                
    
    
    //Método que calcula el recargo por modelo, toma como parámetro el modelo del carro

    public int recargoPorModelo(){
        //int recargoPorModelo = 0;
        
        if (modelo <= 1979){
            recargoPorModelo = 90000;
        } else if ((modelo >= 1980) && (modelo <= 1999)){
            recargoPorModelo = 45000;
        } else if ((modelo >= 2000) && (modelo <= 2014)){
            recargoPorModelo = 35000;
        } else if ((modelo >= 2015) && (modelo <= 2018)){
            recargoPorModelo = 25000;
        } else if ((modelo >= 2019) && (modelo <= 2021)){
            recargoPorModelo = 0;
        }
        
        return recargoPorModelo;
        
    }
 
/* Método que calcula la prima mensual tomando como parámetros el monto de seguro
    y el recargo por el modelo del auto*/
 
    public double PrimaMensual(/*int recargoPorModelo, int montoAsegurado*/){
         
        primaMensual = (recargoPorModelo + (montoAsegurado/4));
        
        return primaMensual;
        
    }
     
/* Método que calcula si es necesario aplicar el descuento por discapacidad
    toma como parámetro el int de discapacidad y la prima mensual */
     
    public double Descuento (){
               
               
        if (discapacidad == 1){
            
            descuento = primaMensual * 0.10;
            primaMensual = primaMensual - descuento; 
            return descuento;
            
        } else if (discapacidad == 0) {
          
            descuento = 0;
        }
        
        return primaMensual;
       
    }
        

    /*retorna datos y cálculo de prima mensual y descuento por discapacidad */
    @Override
    public String toString (){

        
    return    "Los datos del cliente son:\n" +  "Nombre: " + dimeNombreCliente() +"\n" +
             "Identificación: "+ dimeIdCliente()+"\n"+ "Modelo del auto: " + dimeModelo() +"\n"+
              "Placa del auto: " + dimePlaca()+"\n"+  "Monto del seguro: "+ dimeMontoAsegurado() + "\n"+
              "Recargo por modelo: " + recargoPorModelo +"\n"+
              "Descuento aplicado: "+ descuento + "\n"+
              "Prima mensual: "+ primaMensual + "\n";
     } 
     
}
