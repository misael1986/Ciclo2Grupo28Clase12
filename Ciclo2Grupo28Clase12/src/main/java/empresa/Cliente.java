/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Cliente {
    
    String nombre;
    ArrayList<TarjetaCredito> tarjetas;
    ArrayList<Banco> bancos;
    
    Cliente(String nom) {
        this.nombre=nom;
    }
    
    public void agregarBanco(){
        System.out.println("Digite nombre del Banco:");
        Scanner tec= new Scanner(System.in);
        this.bancos.add(new Banco(tec.nextLine()));
    }
    
    
}
