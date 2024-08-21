/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.CuentaBancaria;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author seguimiento
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int Numero,Num_Cuenta;
      String Titular;
      String Tipo;
      double Saldo;
      
      
      
        Scanner scan = new Scanner (System.in);
       ArrayList<CuentaBancaria> listaCuentas = new ArrayList<>();
        
       
        
        System.out.println("Digite el  numero de cuentas: ");
        Num_Cuenta=scan.nextInt();
        
        
        for (int i = 0; i<Num_Cuenta;i++){
              
        System.out.println("Digite el numero " +(i+1)+" de la cuenta");
        Numero = scan.nextInt();
        
        System.out.println("Digite el titular " +(i+1)+" de la cuenta");
        Titular = scan.next();
                
        System.out.println("Digite el tipo " +(i+1)+" de la cuenta");
        Tipo = scan.next();  
        
        System.out.println("Digite el saldo " +(i+1)+" de la cuenta");
        Saldo = scan.nextDouble();
        
        CuentaBancaria objcBancaria = new  CuentaBancaria (Numero,
                Titular,
                Tipo,
                Saldo);
                
       listaCuentas.add(objcBancaria);
    }
        for (int i = 0; i < listaCuentas.size(); i++) { 
            System.out.println("El numero de la cuenta es: "+listaCuentas.get(i).getNumero());
            System.out.println("El titular de la cuenta es: "+listaCuentas.get(i).getTitular());
            System.out.println("El tipo de la cuenta es: "+listaCuentas.get(i).getTipo());
            System.out.println("El saldo de la cuenta es: "+listaCuentas.get(i).getSaldo());
        }
}
}