/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diego.server.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Diego
 */

@Entity
public class Locadora implements Cadastro, Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private long id;
    @ManyToOne 
    private Cidade municipio;
    @OneToMany (mappedBy = "locadoras")
    private Reserva reserva;
    
    /**
     * @return the id
     */
    @Override
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    @Override
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the municipio
     */
    public Cidade getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(Cidade municipio) {
        this.municipio = municipio;
    }

    /**
     * @return the reserva
     */
    public Reserva getReserva() {
        return reserva;
    }

    /**
     * @param reserva the reserva to set
     */
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
