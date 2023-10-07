package com.interfaceslamba.practica;

import java.util.List;
import java.util.function.ToDoubleFunction;

public class FunctionTest {
    public static void main(String[] args) {
        // Paso 1: Crear una lista de empleados utilizando el método estático "crearLista" de la clase "Empleado"
        List<Empleado> lista = Empleado.crearLista();
        
        // Paso 2: Obtener el primer empleado de la lista
        Empleado primerValor = lista.get(0);
        
        // Paso 3: Crear una función (ToDoubleFunction) que calcula el salario con bonus de un empleado
        ToDoubleFunction<Empleado> func =
                e-> e.getSalario() * Bonus.porRol(e.getRol());
        
        // Paso 4: Imprimir una línea en blanco
        System.out.println("\n");
        
        // Paso 5: Imprimir un encabezado para el primer empleado con bonus
        System.out.println("====Primer Empleado con Bonus====");
        
        // Paso 6: Llamar al método "getResumen" del primer empleado para imprimir su información básica
        primerValor.getResumen();
        
        // Paso 7: Calcular y mostrar el bonus del primer empleado utilizando la función "func"
        System.out.println("Bonus: " + func.applyAsDouble(primerValor));
    }
}

