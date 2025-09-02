/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maonamassa3.model;

import com.mycompany.maonamassa3.model.enums.ECategoria;
import com.mycompany.maonamassa3.model.enums.ETipoCombustivel;

/**
 *
 * @author Usuário
 */
public class Modelo {

    private int id;
    private String descricao;
    private Marca marca;
    private Motor motor;
    private ECategoria categoria;
    private static int contador = 1;

    public Modelo() {
        this.id = contador++;
        this.motor = new Motor(); // Composição
    }

    public Modelo(String descricao, Marca marca) {
        this();
        this.descricao = descricao;
        this.marca = marca;
    }

    public Modelo(String descricao, Marca marca, int potencia,
            ETipoCombustivel tipoCombustivel, ECategoria categoria) {
        this(descricao, marca);
        this.motor = new Motor(potencia, tipoCombustivel);
        this.categoria = categoria;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public ECategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(ECategoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return descricao + " (" + marca + ") - " + categoria;
    }
}
