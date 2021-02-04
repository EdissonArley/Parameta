/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parameta.ws;

import com.parameta.dto.EmpleadoDto;
import com.parameta.model.Empleado;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author User
 */
@WebService(endpointInterface = "com.parameta.ws.EmpleadoWS")
public class EmpleadoWSImpl implements EmpleadoWS {

    @Override
    public void guardarEmpleado(EmpleadoDto empleadoDto) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("parametaUnit");
        EntityManager entityManager = emf.createEntityManager();
        Empleado empleadoModel = new Empleado.Builder().
                nombres(empleadoDto.getNombres()).
                apellidos(empleadoDto.getApellidos()).
                tipoDocumento(empleadoDto.getTipoDocumento()).
                numeroDocumento(empleadoDto.getNumeroDocumento()).
                fechaNacimiento(empleadoDto.getFechaNacimiento()).
                fechVinculacionCompania(empleadoDto.getFechVinculacionCompania()).
                cargo(empleadoDto.getCargo()).
                salario(empleadoDto.getSalario()).
                build();
        entityManager.persist(empleadoModel);
    }

}
