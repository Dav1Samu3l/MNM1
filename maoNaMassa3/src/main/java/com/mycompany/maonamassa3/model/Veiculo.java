/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maonamassa3.model;

/**
 *
 * @author Usuário
 */
public class Veiculo {

    private int id;
    private String placa;
    private String observacoes;
    private Cliente cliente;
    private Modelo modelo;
    private Cor cor;
    private static int contador = 1;

    public Veiculo() {
        this.id = contador++;
    }

    public Veiculo(String placa) {
        this();
        this.placa = placa;
    }

    public Veiculo(String placa, Modelo modelo) {
        this(placa);
        this.modelo = modelo;
    }

    public Veiculo(String placa, Modelo modelo, Cor cor) {
        this(placa, modelo);
        this.cor = cor;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return placa + " - " + (modelo != null ? modelo.getDescricao() : "Sem modelo");
    }
}
