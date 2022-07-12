/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedin;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contacto alberto= new Contacto("Alberto");
        //System.out.println(alberto.nombre);
        
        alberto.contactos.add(new Contacto("Benito"));
        alberto.contactos.get(0).contactos.add(new Contacto("Bibiana"));
        alberto.contactos.get(0).contactos.add(new Contacto("Brayan"));
        // amigo uno            |atributo del amigo uno
        
        alberto.contactos.get(0).contactos.get(1).contactos.add(new Contacto("Kevin"));
        alberto.contactos.get(0).contactos.get(1).contactos.add(new Contacto("Yulitza"));
        
        alberto.contactos.add(new Contacto("Carolina"));
        alberto.contactos.get(1).contactos.add(new Contacto("Carlos"));
        alberto.contactos.get(1).contactos.add(new Contacto("Camila"));
        
        alberto.contactos.get(1).contactos.get(0).contactos.add(new Contacto("Daniela"));
        alberto.contactos.get(1).contactos.get(0).contactos.add(new Contacto("Juan"));
        
        System.out.println(alberto.listaDeAmigos(1));
    }
    
}
