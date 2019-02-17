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
import javax.persistence.OneToOne;

/**
 *
 * @author Diego
 */
@Entity
public class Veiculo implements Cadastro, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String modelo;
    private String marca;
    private String placa;
    private String preco;
    private String arcondicionado;
    private String cambio;
    private String combustivel;
    private String anoFabricacao;
    @OneToOne
    private Reserva reserva;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the preco
     */
    public String getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(String preco) {
        this.preco = preco;
    }

    /**
     * @return the arcondicionado
     */
    public String getArcondicionado() {
        return arcondicionado;
    }

    /**
     * @param arcondicionado the arcondicionado to set
     */
    public void setArcondicionado(String arcondicionado) {
        this.arcondicionado = arcondicionado;
    }

    /**
     * @return the cambio
     */
    public String getCambio() {
        return cambio;
    }

    /**
     * @param cambio the cambio to set
     */
    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    /**
     * @return the combustivel
     */
    public String getCombustivel() {
        return combustivel;
    }

    /**
     * @param combustivel the combustivel to set
     */
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    /**
     * @return the anoFabricacao
     */
    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    /**
     * @param anoFabricacao the anoFabricacao to set
     */
    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}
