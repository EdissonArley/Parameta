/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parameta;

import com.parameta.ws.EmpleadoWSImpl;
import javax.xml.ws.Endpoint;

/**
 *
 * @author User
 */
public class ParametaMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {              
        Endpoint ep = Endpoint.create(new EmpleadoWSImpl());
        ep.publish("http://localhost:4444/empleadoServer");
    }

}
