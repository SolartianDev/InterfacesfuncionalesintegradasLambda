// Importación del paquete donde se encuentra la clase
package com.interfaceslamba.practica;

// (1) Declaración del enumerador ValorIncremental
public enum ValorIncremental {
    
    // (2) Definición de valores enumerados y sus valores asociados
    STAFF((2*7)/365d),        // (3) Valor STAFF con un cálculo de valor por día
    MANAGER((2.5*7)/365d),    // (4) Valor MANAGER con un cálculo de valor por día
    EJECUTIVO((3*7)/365d);    // (5) Valor EJECUTIVO con un cálculo de valor por día
    
    // (6) Campo público final para almacenar el valor por día
    public final double porDia;

    // (7) Constructor del enumerador ValorIncremental que recibe un valor por día
    ValorIncremental (double porDia){
        this.porDia = porDia;
    }

    // (8) Método para obtener el valor por día
    public double porDia(){
        return porDia;
    }

    // (9) Método estático para obtener el valor por Rol
    public static double porRol(Rol r){
        double valorIncrementado = 0.0d;
            
        // (10) Switch para determinar el valor por Rol
        switch(r){
            case EJECUTIVO: 
                valorIncrementado =  EJECUTIVO.porDia; break;
            case STAFF: 
                valorIncrementado =  STAFF.porDia; break;
            case MANAGER: 
                valorIncrementado = MANAGER.porDia; break;
        }   
            
        // (11) Retorna el valor por día calculado según el Rol
        return valorIncrementado;
    }
}
