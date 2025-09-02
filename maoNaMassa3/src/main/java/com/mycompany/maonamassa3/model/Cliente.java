/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maonamassa3.model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Usuário
 */
public class Cliente {

    private int id;
    private String nome;
    private String celular;
    private String email;
    private LocalDate dataCadastro;
    private List<Veiculo> veiculos;
    private static int contador = 1;

    public Cliente() {
        this.id = contador++;
        this.veiculos = new ArrayList<>();
        this.dataCadastro = LocalDate.now();
    }

    public Cliente(String nome, String celular, String email) {
        this();
        this.nome = nome;
        this.celular = celular;
        this.email = email;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    // Métodos para manipular veículos
    public void addVeiculo(Veiculo veiculo) {
        if (veiculo != null && !veiculos.contains(veiculo)) {
            veiculos.add(veiculo);
            veiculo.setCliente(this); // Bidirecional
        }
    }

    public void removeVeiculo(Veiculo veiculo) {
        if (veiculo != null && veiculos.contains(veiculo)) {
            veiculos.remove(veiculo);
            veiculo.setCliente(null); // Bidirecional
        }
    }

    @Override
    public String toString() {
        return nome + " - " + email;
    }
}
