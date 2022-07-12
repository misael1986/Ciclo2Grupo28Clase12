/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedin;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Contacto {

    String nombre;
    ArrayList<Contacto> contactos;

    Contacto(String nombre) {
        this.nombre = nombre;
        contactos= new ArrayList<>();
    }

    public String espacios(int nivel) {
        String s = "";
        for (int i = 0; i < nivel; i++) {
            s += " ";
        }
        return s;
    }

    String listaDeAmigos(int nivel) {
        String s = espacios(nivel) + nombre + '\n';
        for (Contacto cont : contactos) {
            s += cont.listaDeAmigos(nivel + 1) + '\n';
        }
        return s;
    }

}
