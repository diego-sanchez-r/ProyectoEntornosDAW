/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabanco;

/**
 *
 * @author diego
 */
public class Cuenta {
    private String titular;
    private double cantidad=0;

    public Cuenta() {
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
    public double ingresar(double cantidad){
        if (cantidad < 0){
            System.out.println("La cantidad a ingresas no puede ser negativa");   
        }
        else {
            this.cantidad=cantidad;
        }    
     return cantidad;   
    }
    
    public double retirar(double retirar){
        double total;
        if (retirar > cantidad){
            System.out.println("El saldo de la cuenta es 0");  
        }
        else {
            total = cantidad - retirar; 
            System.out.println("El saldo de la cuenta es "+total);
        }
        return retirar;
    }
    
    public double verSaldoCuenta(){
        double totalCuenta =0;
        this.cantidad = totalCuenta;
        return totalCuenta;
    }
}
