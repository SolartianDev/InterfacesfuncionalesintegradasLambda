
package com.interfaceslamba.practica;

import java.util.List;
import java.util.function.Predicate;


public class RoboMailTest {
    public static void main(String[] args) {
        
        List<Empleado> pl = Empleado.crearLista();
        RoboMail robot = new RoboMail();
        
       Predicate<Empleado> ejecutivos =
           p -> p.getRol().equals(Rol.EJECUTIVO)
               && p.getDeptLaboral().equals("Ventas");
       
       Predicate<Empleado> ventasEmpleadoMayorsde50 = 
               p -> p.getEdad() >=50 && p.getDeptLaboral().equals("Ventas");
       
        System.out.println("\n\t\t==== RoboMail====");
        System.out.println("\n==== Ventas====");
        
        pl.stream()
                .filter(ejecutivos)
                .forEach(p -> robot.roboMail(p));
        
        pl.stream()
                .filter(ventasEmpleadoMayorsde50)
                .forEach(p-> robot.roboText(p));
       
       pl.stream()
               .filter(p->p.getEdad()>=65)
               .filter(p -> p.getDeptLaboral().equals("Ingenieria"))
               .filter(p-> p.getGenero().equals(Genero.MASCULINO))
               .forEach(p->robot.roboMail(p));
       
       
    }
}
