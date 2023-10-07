package com.interfaceslamba.practica;

import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {
   
    public static void main(String[] args) {
        // Paso 1: Crear una lista de empleados utilizando el método estático "crearLista" de la clase "Empleado"
        List<Empleado> lista = Empleado.crearLista();
        
        // Paso 2: Obtener el primer empleado de la lista
        Empleado primerValor = lista.get(0);
        
        // Paso 3: Crear un proveedor (Supplier) que genera un nuevo empleado con información predefinida
        Supplier<Empleado> supp =
                ()-> new Empleado.Builder()
                        .primerNombre("Carolina")
                        .segundoNombre("Vasquez")
                        .edad(25)
                        .genero(Genero.FEMENINO)
                        .rol(Rol.STAFF)
                        .deptLaboral("Ventas")
                        .salario(45000)
                        .email("CAROLINA@email.com")
                        .telefono("31453680992")
                        .direccion("calle 10 # 22-33")
                        .departamento("Bogota DC")
                        .ciudad("Bogota")
                        .build();
        
        // Paso 4: Imprimir una línea en blanco
        System.out.println("\n");
        
        // Paso 5: Imprimir un encabezado "====Lista antes de guardar el empleado===="
        System.out.println("====Lista antes de guardar el empleado====");
        
        // Paso 6: Utilizar el método "imprimir" para imprimir la información de todos los empleados en la lista
        lista.stream().forEach(Empleado::imprimir);
        
        // Paso 7: Agregar el empleado generado por el proveedor a la lista
        lista.add(supp.get());
        
        // Paso 8: Imprimir un encabezado "====Lista después de guardar el empleado===="
        System.out.println("====Lista después de guardar el empleado====");
        
        // Paso 9: Utilizar el método "imprimir" para imprimir la información de todos los empleados en la lista, incluido el nuevo empleado
        lista.stream().forEach(Empleado::imprimir);
    }
}

