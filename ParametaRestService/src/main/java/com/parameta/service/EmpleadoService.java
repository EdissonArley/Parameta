/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parameta.service;

import com.parameta.dto.EmpleadoDto;

/**
 *
 * @author User
 */
public interface EmpleadoService {
    
    EmpleadoDto guardarEmpleado(EmpleadoDto empleado) throws Exception;
    
}
