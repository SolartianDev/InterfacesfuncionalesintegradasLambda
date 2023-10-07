
package com.interfaceslamba.practica;

public class RoboMail {
    
    public void roboMail(Empleado p){
        System.out.println("Enviando Email: "+p.getPrimerNombre()
        +" "+ p.getSegundoNombre()+" edad "+p.getEdad()
        +" al "+ p.getEmail());
    }
    
    public void roboText(Empleado p){
        System.out.println("Enviando texto: "+p.getPrimerNombre()
        +" "+ p.getSegundoNombre()+" edad "+p.getEdad()
        +" al "+ p.getTelefono());
    }
}
