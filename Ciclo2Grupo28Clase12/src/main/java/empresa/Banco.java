/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Banco extends Empresa{
    
    String nombre;
    ArrayList<Cliente> clientes;
    ArrayList<TarjetaCredito> tarjetas;
    
    Banco(String nom){
        this.nombre=nom;
    }
    
}
