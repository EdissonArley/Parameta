/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parameta.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author User
 */
public class CalcularEdadUtils {

    private static final int EDAD_ADULTA = 18;

    public static Period calcularTiempo(Date fechaInicio) {
        if ((fechaInicio != null)) {
            LocalDate fechaNacimientoLocalDate = fechaInicio.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            return Period.between(fechaNacimientoLocalDate, LocalDate.now());
        } else {
            return Period.ZERO;
        }
    }

    public static boolean esMayorDeEdad(Date fechaNacimiento) {
        return calcularTiempo(fechaNacimiento).getYears() > EDAD_ADULTA;
    }
}
