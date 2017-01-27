/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.mramonesb.a3;

import java.util.Scanner;

/**
 *
 * @author marielaramonesbalvoa
 */
public class SPPMRamonesBA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // paso 1- variables
        int c1, c2, op;
        c1=solicitarDato ("cateto-1");
        c2=solicitarDato ("cateto-2");
        op=operación(c1, c2);
        
        
    }
    public static int solicitarDato (String n){
        // paso 2 activo el teclado para ingresar los datos 
        int numero;
        Scanner kb= new Scanner(System.in);
        System.out.println("Introce el " + n);
        numero= kb.nextInt();
        return numero ;
        
    }
 public static int operación(int c1, int c2){
     // paso 3 realizo la operacion (adjuno todo en R, para evitar repetir el procedimiento)
     // use math funciones de raiz cuadrada y de potencias
     int R;
     R= (int) Math.pow(c1,2) + (int)Math.pow(c2,2);
     System.out.println("Tu hiponenusa es:" + Math.sqrt(R));
     return R;
     
 }
}
