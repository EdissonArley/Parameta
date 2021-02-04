/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parameta.dto;

import java.util.Date;

/**
 *
 * @author User
 */
public class EmpleadoDto {

    private String nombres;
    private String apellidos;
    private String tipoDocumento;
    private String numeroDocumento;
    private Date fechaNacimiento;
    private Date fechVinculacionCompania;
    private String cargo;
    private Double salario;
    
    public EmpleadoDto(){
        
    }

    private EmpleadoDto(Builder builder) {
        this.nombres = builder.nombres;
        this.apellidos = builder.apellidos;
        this.tipoDocumento = builder.tipoDocumento;
        this.numeroDocumento = builder.numeroDocumento;
        this.fechaNacimiento = builder.fechaNacimiento;
        this.fechVinculacionCompania = builder.fechVinculacionCompania;
        this.cargo = builder.cargo;
        this.salario = builder.salario;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the tipoDocumento
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * @param tipoDocumento the tipoDocumento to set
     */
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    /**
     * @return the numeroDocumento
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * @param numeroDocumento the numeroDocumento to set
     */
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the fechVinculaciónCompania
     */
    public Date getFechVinculacionCompania() {
        return fechVinculacionCompania;
    }

    /**
     * @param fechVinculacionCompania the fechVinculaciónCompania to set
     */
    public void setFechVinculacionCompania(Date fechVinculacionCompania) {
        this.fechVinculacionCompania = fechVinculacionCompania;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the salario
     */
    public Double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public static class Builder {

        private String nombres;
        private String apellidos;
        private String tipoDocumento;
        private String numeroDocumento;
        private Date fechaNacimiento;
        private Date fechVinculacionCompania;
        private String cargo;
        private Double salario;

        public Builder nombres(String nombres) {
            this.nombres = nombres;
            return this;
        }

        public Builder apellidos(String apellidos) {
            this.apellidos = apellidos;
            return this;
        }

        public Builder tipoDocumento(String tipoDocumento) {
            this.tipoDocumento = tipoDocumento;
            return this;
        }

        public Builder numeroDocumento(String numeroDocumento) {
            this.numeroDocumento = numeroDocumento;
            return this;
        }

        public Builder fechaNacimiento(Date fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public Builder fechVinculacionCompania(Date fechVinculacionCompania) {
            this.fechVinculacionCompania = fechVinculacionCompania;
            return this;
        }

        public Builder cargo(String cargo) {
            this.cargo = cargo;
            return this;
        }

        public Builder salario(Double salario) {
            this.salario = salario;
            return this;
        }

        public EmpleadoDto build() {
            return new EmpleadoDto(this);
        }
    }
}
