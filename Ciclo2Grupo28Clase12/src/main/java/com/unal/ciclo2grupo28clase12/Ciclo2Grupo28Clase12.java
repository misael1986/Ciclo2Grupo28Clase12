/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.unal.ciclo2grupo28clase12;

/**
 *
 * @author Usuario
 */
public class Ciclo2Grupo28Clase12 {

    public static void main(String[] args) {
        Direccion d=new Direccion();
        d.direccion="Kra 51 # 20-45";
        Persona p= new Persona("Misael Perilla",d);//fuerte
        Barrio barrio= new Barrio("Santa Librada");
        barrio.direcciones.add(d);//debil
    }
}
