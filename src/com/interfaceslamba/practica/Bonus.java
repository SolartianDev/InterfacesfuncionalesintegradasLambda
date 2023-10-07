package com.interfaceslamba.practica;

// Definición de un enumerador llamado Bonus
public enum Bonus {
    // Definición de los valores enumerados y sus valores asociados
    STAFF(0.02),        // Valor STAFF con un porcentaje de bonificación del 2%
    MANAGER(0.04),      // Valor MANAGER con un porcentaje de bonificación del 4%
    EJECUTIVO(0.06);    // Valor EJECUTIVO con un porcentaje de bonificación del 6%

    // Campo público final para almacenar el porcentaje de bonificación
    public final double porciento;

    // Constructor del enumerador Bonus que recibe un porcentaje como argumento
    Bonus(double porciento) {
        this.porciento = porciento;
    }

    // Método para obtener el porcentaje de bonificación
    public double porciento() {
        return porciento;
    }

    // Método estático para obtener el porcentaje de bonificación por Rol
    public static double porRol(Rol r) {
        double bonusPorciento = 0.0d;

        // Switch para determinar el porcentaje de bonificación según el Rol
        switch (r) {
            case EJECUTIVO:
                bonusPorciento = EJECUTIVO.porciento;
                break;
            case STAFF:
                bonusPorciento = STAFF.porciento;
                break;
            case MANAGER:
                bonusPorciento = MANAGER.porciento;
                break;
        }

        // Retorna el porcentaje de bonificación calculado según el Rol
        return bonusPorciento;
    }
}

