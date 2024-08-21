/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author seguimiento
 */
public class CuentaBancaria {
    //atributos
    
    private int Numero;
    private String Titular;
    private String Tipo;
    private double Saldo;
    
    //constructor no parametrizado
    public  CuentaBancaria(){       
}
    
    //constructor parametrizado
    public  CuentaBancaria(int Numero, String Titular,String Tipo, double Saldo){       

    this.Numero = Numero;
    this.Titular = Titular;
    this.Tipo = Tipo;
    this.Saldo = Saldo;
      
      }
    //sets y gets

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public int getNumero() {
        return Numero;
    }

    public String getTitular() {
        return Titular;
    }

    public String getTipo() {
        return Tipo;
    }

    public double getSaldo() {
        return Saldo;
    }
    
    
}