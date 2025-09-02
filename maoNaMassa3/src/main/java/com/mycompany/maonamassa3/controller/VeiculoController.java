/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maonamassa3.controller;

import com.mycompany.maonamassa3.model.Cliente;
import com.mycompany.maonamassa3.model.Cor;
import com.mycompany.maonamassa3.model.Marca;
import com.mycompany.maonamassa3.model.Modelo;
import com.mycompany.maonamassa3.model.Veiculo;
import com.mycompany.maonamassa3.model.enums.ECategoria;
import com.mycompany.maonamassa3.model.enums.ETipoCombustivel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuário
 */
public class VeiculoController {

    private List<Veiculo> veiculos;
    private List<Cliente> clientes;
    private List<Modelo> modelos;
    private List<Marca> marcas;
    private List<Cor> cores;

    public VeiculoController() {
        this.veiculos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.modelos = new ArrayList<>();
        this.marcas = new ArrayList<>();
        this.cores = new ArrayList<>();
        inicializarDados();
    }

    private void inicializarDados() {
        // Criar algumas marcas
        Marca vw = new Marca("Volkswagen");
        Marca honda = new Marca("Honda");
        Marca fiat = new Marca("Fiat");
        marcas.add(vw);
        marcas.add(honda);
        marcas.add(fiat);

        //  alguns modelos
        Modelo gol = new Modelo("Gol Trend", vw, 100, ETipoCombustivel.FLEX, ECategoria.PEQUENO);
        Modelo civic = new Modelo("Civic Touring", honda, 173, ETipoCombustivel.GASOLINA, ECategoria.MEDIO);
        Modelo uno = new Modelo("Uno Way", fiat, 75, ETipoCombustivel.FLEX, ECategoria.PEQUENO);
        modelos.add(gol);
        modelos.add(civic);
        modelos.add(uno);

        // Criar algumas cores
        Cor branco = new Cor("Branco");
        Cor preto = new Cor("Preto");
        Cor vermelho = new Cor("Vermelho");
        cores.add(branco);
        cores.add(preto);
        cores.add(vermelho);

        // Criar alguns clientes
        Cliente joao = new Cliente("João Silva", "(11) 99999-9999", "joao@email.com");
        Cliente maria = new Cliente("Maria Santos", "(11) 98888-8888", "maria@email.com");
        clientes.add(joao);
        clientes.add(maria);

        // Criar alguns veículos
        Veiculo veiculo1 = new Veiculo("ABC1234", gol, branco);
        Veiculo veiculo2 = new Veiculo("XYZ5678", civic, preto);
        Veiculo veiculo3 = new Veiculo("DEF9012", uno, vermelho);

        // Associar veículos aos clientes
        joao.addVeiculo(veiculo1);
        maria.addVeiculo(veiculo2);
        joao.addVeiculo(veiculo3);

        veiculos.add(veiculo1);
        veiculos.add(veiculo2);
        veiculos.add(veiculo3);
    }

    // Métodos para acesso aos dados
    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Modelo> getModelos() {
        return modelos;
    }

    public List<Marca> getMarcas() {
        return marcas;
    }

    public List<Cor> getCores() {
        return cores;
    }

    // Método para adicionar novo veículo
    public void adicionarVeiculo(Veiculo veiculo) {
        if (veiculo != null) {
            veiculos.add(veiculo);
        }
    }

    // Método para buscar veículo por placa
    public Veiculo buscarVeiculoPorPlaca(String placa) {
        return veiculos.stream()
                .filter(v -> v.getPlaca().equalsIgnoreCase(placa))
                .findFirst()
                .orElse(null);
    }
}
