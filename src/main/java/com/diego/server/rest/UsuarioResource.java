/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diego.server.rest;

/**
 *
 * @author Diego
 */
import com.diego.server.dao.DAO;
import com.diego.server.model.Usuario;
import java.util.List;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Transactional
@Path("/usuario")
public class UsuarioResource {
    @Inject
    private DAO<Usuario> dao;

  
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuario> AllUsers(){
        return dao.findAll();
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario findById(@PathParam("id") long id) {
        return dao.findById(id);
    }
}