package com.interfaceslamba.practica;

import java.util.List;
import java.util.function.BiPredicate;

public class BipredicateTest {
    public static void main(String[] args) {
        // Paso 1: Crear una lista de empleados utilizando el método estático "crearLista" de la clase "Empleado"
        List<Empleado> lista = Empleado.crearLista();
        
        // Paso 2: Obtener el primer empleado de la lista
        Empleado primerValor = lista.get(0);
        
        // Paso 3: Definir un departamento que se utilizará para buscar empleados
        String departamento = "Antioquia";
        
        // Paso 4: Crear un predicado binario (BiPredicate) llamado "bipre" que compara un empleado con un departamento
        BiPredicate<Empleado, String> bipre =
                (e, s) -> e.getDepartamento().equals(s);
        
        // Paso 5: Imprimir una línea en blanco
        System.out.println("\n");
        
        // Paso 6: Imprimir un encabezado "====Departamentos encontrados====" para indicar que se mostrarán empleados de un departamento específico.
        System.out.println("====Departamentos encontrados====");
        
        // Paso 7: Recorrer la lista de empleados y verificar si cada empleado pertenece al departamento especificado
        for (Empleado e : lista) {
            // Paso 8: Utilizar el predicado "bipre" para verificar si el empleado "e" pertenece al departamento especificado
            if (bipre.test(e, departamento)) {
                // Paso 9: Si el predicado es verdadero, imprimir la información del empleado utilizando el método "imprimir"
                e.imprimir();
            }
        }
    }
}

