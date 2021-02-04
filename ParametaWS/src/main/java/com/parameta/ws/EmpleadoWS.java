/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parameta.ws;

import com.parameta.dto.EmpleadoDto;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author User
 */
@WebService
public interface EmpleadoWS {

    @WebMethod(operationName = "guardarEmpleado")
    void guardarEmpleado(EmpleadoDto empleado);

}
