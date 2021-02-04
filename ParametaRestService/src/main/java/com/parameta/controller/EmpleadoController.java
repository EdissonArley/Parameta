/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parameta.controller;

import com.parameta.dto.EmpleadoDto;
import com.parameta.service.EmpleadoService;
import java.util.Date;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author walarcon
 */
@Validated
@RestController
@RequestMapping("/rest")
public class EmpleadoController {
    

    @Autowired
    EmpleadoService empleadoService;

    @RequestMapping(value = "/consultarEmpleado",
            method = RequestMethod.GET,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EmpleadoDto> consultarEmpleado(
            @RequestParam(name = "nombres", required = true) @NotEmpty @NotNull String nombres,
            @RequestParam(name = "apellidos", required = true) @NotEmpty @NotNull String apellidos,
            @RequestParam(name = "tipoDocumento", required = true) @NotEmpty @NotNull String tipoDocumento,
            @RequestParam(name = "numeroDocumento", required = true) @NotEmpty @NotNull String numeroDocumento,
            @RequestParam(name = "fechaNacimiento", required = true)  @NotNull @DateTimeFormat(pattern = "dd/MM/yyyy") Date fechaNacimiento,
            @RequestParam(name = "fechVinculacionCompania", required = true)  @NotNull @DateTimeFormat(pattern = "dd/MM/yyyy") Date fechVinculacionCompania,
            @RequestParam(name = "cargo", required = true) @NotEmpty @NotNull String cargo,
            @RequestParam(name = "salario", required = true)  @NotNull Double salario) throws Exception {
        System.out.println("nombres " + nombres.length());
        EmpleadoDto empleado = new EmpleadoDto.Builder().
                nombres(nombres).
                apellidos(apellidos).
                tipoDocumento(tipoDocumento).
                numeroDocumento(numeroDocumento).
                fechaNacimiento(fechaNacimiento).
                fechVinculacionCompania(fechVinculacionCompania).
                cargo(cargo).
                salario(salario).
                build();
        empleadoService.guardarEmpleado(empleado);
        return new ResponseEntity(empleado, HttpStatus.OK);
    }
}
