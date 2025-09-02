/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maonamassa3.model;

/**
 *
 * @author Usuário
 */
public class Cor {

    private int id;
    private String nome;
    private static int contador = 1;

    public Cor() {
        this.id = contador++;
    }
    public Cor(String nome) {
        this();
        this.nome = nome;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
