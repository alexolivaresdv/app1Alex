/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1alex;

/**
 *
 * @author LAB17
 */
public class App1Alex 
{
    public static void main(String[]args)
    {
    int numero;//declaracion de variable tipo entero 
    double numero2;//Declaracion variable tipo double 
    String name;//Aqui guardaremos texto 
        
       numero=55;
       numero2=2.3;
       name="Mi Primer Programa";
       
       System.out.println("Suma de numero y numero2:"+(numero+numero2)+"\n");
       System.out.println("Resta de numero y numero2:"+(numero-numero2)+"\n");
       System.out.println("Multiplicar de numero y numero2:"+(numero*numero2)+"\n");
       System.out.println("Division de numero y numero2:"+(numero/numero2)+"\n");
       System.out.println("Resto de numero y numero2:"+(numero%numero2)+"\n");
       System.out.println("Calculadora \t"+name);
    }
    
}
