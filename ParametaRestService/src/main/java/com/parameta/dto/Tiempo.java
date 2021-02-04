/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parameta.dto;

import java.time.Period;

/**
 *
 * @author User
 */
public class Tiempo {

    private int años;
    private int meses;
    private int dias;

    private Tiempo(int años, int meses, int dias) {
        this.años = años;
        this.meses = meses;
        this.dias = dias;
    }

    public static Tiempo valueFrom(Period period) {
        return new Tiempo(period.getYears(), period.getMonths(), period.getDays());
    }

    /**
     * @return the años
     */
    public int getAños() {
        return años;
    }

    /**
     * @param años the años to set
     */
    public void setAños(int años) {
        this.años = años;
    }

    /**
     * @return the meses
     */
    public int getMeses() {
        return meses;
    }

    /**
     * @param meses the meses to set
     */
    public void setMeses(int meses) {
        this.meses = meses;
    }

    /**
     * @return the días
     */
    public int getDias() {
        return dias;
    }

    /**
     * @param dias the días to set
     */
    public void setDias(int dias) {
        this.dias = dias;
    }
}
