/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parameta.service.impl;

import com.parameta.dto.EmpleadoDto;
import com.parameta.dto.Tiempo;
import com.parameta.ws.EmpleadoWSImplService;
import com.parameta.service.EmpleadoService;
import com.parameta.utils.CalcularEdadUtils;
import com.parameta.utils.DateUtils;
import com.parameta.ws.EmpleadoWS;
import java.time.Period;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Override
    public EmpleadoDto guardarEmpleado(EmpleadoDto empleado) throws Exception {
        if (CalcularEdadUtils.esMayorDeEdad(empleado.getFechaNacimiento())) {
            Period periodoVinculacion = CalcularEdadUtils.calcularTiempo(empleado.getFechVinculacionCompania());
            empleado.setTiempoVinculacion(Tiempo.valueFrom(periodoVinculacion));
            Period edad = CalcularEdadUtils.calcularTiempo(empleado.getFechaNacimiento());
            empleado.setEdadActual(Tiempo.valueFrom(edad));

            EmpleadoWSImplService service = new EmpleadoWSImplService();
            EmpleadoWS empleadoWS = service.getEmpleadoWSImplPort();
            empleadoWS.guardarEmpleado(convertToEmpleadoDtoWs(empleado));
        } else {
            throw new Exception("El empleado es menor de edad");
        }

        return empleado;
    }

    private com.parameta.ws.EmpleadoDto convertToEmpleadoDtoWs(EmpleadoDto empleado) {
        com.parameta.ws.EmpleadoDto empleadoDto = new com.parameta.ws.EmpleadoDto();
        empleadoDto.setNombres(empleado.getNombres());
        empleadoDto.setApellidos(empleado.getApellidos());
        empleadoDto.setTipoDocumento(empleado.getTipoDocumento());
        empleadoDto.setNumeroDocumento(empleado.getNumeroDocumento());
        empleadoDto.setFechaNacimiento(DateUtils.
                dateToXMLGregorianCalendar(empleado.getFechaNacimiento()));
        empleadoDto.setFechVinculacionCompania(DateUtils.
                dateToXMLGregorianCalendar(empleado.getFechVinculacionCompania()));
        empleadoDto.setCargo(empleado.getCargo());
        empleadoDto.setSalario(empleado.getSalario());
        return empleadoDto;
    }

}
