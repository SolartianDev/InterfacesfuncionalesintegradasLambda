package com.interfaceslamba.practica;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        // 1. Crear una lista de empleados utilizando el método estático "crearLista" de la clase "Empleado"
        List<Empleado> lista = Empleado.crearLista();
        
        // 2. Obtener el primer empleado de la lista
        Empleado primerValor = lista.get(0);
        
        // 3. Crear un objeto Consumer que imprimirá información sobre un empleado
        Consumer<Empleado> consumer = e -> System.out.println(
            "Nombre: " + e.getPrimerNombre() + " " + e.getSegundoNombre() +
            " Rol: " + e.getRol() + " Salario: " + e.getSalario());
        
        // 4. Imprimir una línea en blanco
        System.out.println("\n");
        
        // 5. Imprimir un encabezado para el primer salario
        System.out.println("====Primer salario====");
        
        // 6. Utilizar el objeto Consumer para imprimir la información del primer empleado
        consumer.accept(primerValor);
    }
}
